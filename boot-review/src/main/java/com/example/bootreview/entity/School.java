package com.example.bootreview.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Castle
 * @Date 2021/5/10 16:45
 */
@ConfigurationProperties(prefix = "school")
@Component
@Data
public class School {
    private String id;
    private String name;
}
