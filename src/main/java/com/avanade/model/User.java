package com.avanade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author mirco.cennamo on 20/10/2023
 * @project spring-boot-kafka-producer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String name;
    private String dept;
    private Long salary;
}

