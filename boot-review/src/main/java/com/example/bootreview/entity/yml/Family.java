package com.example.bootreview.entity.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * @author Castle
 * @Date 2021/5/11 8:11
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
public class Family {
    @NotEmpty
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}
