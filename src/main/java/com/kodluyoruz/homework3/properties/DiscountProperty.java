package com.kodluyoruz.homework3.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "discount")
public class DiscountProperty {
    private double discount;
}
