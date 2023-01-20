package com.hipspot.web;

import com.hipspot.domain.cafes.Cafes;
import com.hipspot.domain.cafes.CafesRepository;
import com.hipspot.web.dto.CafesSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CafesApiControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CafesRepository cafesRepository;

    @After
    public void tearDown() throws Exception{
        cafesRepository.deleteAll();
    }

    @Test
    public void Cafes_등록된다() throws Exception {
        //given
        String name = "테스트가게";
        String phone = "12345";
        CafesSaveRequestDto requestDto = CafesSaveRequestDto.builder()
                .name(name)
                .phone(phone)
                .build();

        String url = "http://localhost:" + port + "/api/cafes";

        //when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);

        List<Cafes> all = cafesRepository.findAll();
        assertThat(all.get(0).getName()).isEqualTo(name);
        assertThat(all.get(0).getPhone()).isEqualTo(phone);
    }
}
