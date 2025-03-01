package com.itdp.arnd.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetCurrency {
    private Integer id;
    private String name;

    @JsonProperty("currency_code")
    private Integer code;

    @JsonProperty("currency_rate")
    private Double currencyRate;
}