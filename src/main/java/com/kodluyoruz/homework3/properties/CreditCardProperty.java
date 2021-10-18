package com.kodluyoruz.homework3.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "credit-card")
public class CreditCardProperty {

    private double commission;
}
