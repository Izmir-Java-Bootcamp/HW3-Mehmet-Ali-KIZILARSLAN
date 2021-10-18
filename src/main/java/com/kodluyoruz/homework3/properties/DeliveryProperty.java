package com.kodluyoruz.homework3.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "delivery")
public class DeliveryProperty {

    private int fee;
    private int feeLimit;
}
