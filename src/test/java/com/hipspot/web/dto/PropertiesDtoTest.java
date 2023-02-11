package com.hipspot.web.dto;


import com.hipspot.domain.cafes.Geojsons;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PropertiesDtoTest {

    @Test
    public void filterList() throws Exception {
        //given
        Geojsons entity = new Geojsons(1L, "이름", "[1, 2, 3]", "instaId", 37.123123, 127.123912);

        //when
        PropertiesDto propertiesDto = new PropertiesDto(entity);
        List<Integer> filterList = new ArrayList<>();
        filterList.add(1);
        filterList.add(2);
        filterList.add(3);


        //then
        assertThat(propertiesDto.getFilterList()).isEqualTo(filterList);
        System.out.println("propertiesDto.getFilterList = " + propertiesDto.getFilterList());
        System.out.println("filterList = " + filterList);
    }

}