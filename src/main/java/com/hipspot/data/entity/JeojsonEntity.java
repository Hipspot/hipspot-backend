package com.hipspot.data.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Jeojson")
public class JeojsonEntity {

    @Id
    Long JeojsonId;

    /**
    String[] properties; 어떻게 리스트로 줄까?
    ArrayList<String> geometry;
    **/
}
