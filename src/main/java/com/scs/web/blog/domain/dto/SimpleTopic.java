package com.scs.web.blog.domain.dto;

import lombok.Data;


@Data
public class SimpleTopic {
    private Long id;
    private String topicName;
    private String logo;
}