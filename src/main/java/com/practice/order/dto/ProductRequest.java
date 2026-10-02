package com.practice.order.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
}
