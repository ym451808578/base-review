package org.example.pattern.cor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/31 15:14
 */
@Data
@AllArgsConstructor
public abstract class Handler {

    private String role;

    private Handler next;

    public abstract void processRequest(PurchaseRequest request);
}
