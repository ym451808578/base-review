package org.example.pattern.cor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Castle
 * @Date 2021/5/31 15:15
 */
@Data
@AllArgsConstructor
public class PurchaseRequest {
    private int id;
    private String name;
    private BigDecimal price;
}
