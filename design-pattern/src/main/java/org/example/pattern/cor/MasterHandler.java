package org.example.pattern.cor;

import java.math.BigDecimal;

/**
 * @author Castle
 * @Date 2021/5/31 15:31
 */
public class MasterHandler extends Handler {

    public MasterHandler(String role, Handler next) {
        super(role, next);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice().compareTo(BigDecimal.valueOf(50000)) > 0) {
            System.out.println("金额：" + request.getPrice() + "," + super.getRole() + "已处理");
        }
    }
}
