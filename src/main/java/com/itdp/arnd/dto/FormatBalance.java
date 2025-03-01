package com.itdp.arnd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormatBalance {
    private Integer currencyId;
    private String name;
    private Double balance;
}
