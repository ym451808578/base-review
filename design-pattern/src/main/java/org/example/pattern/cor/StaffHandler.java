package org.example.pattern.cor;

import java.math.BigDecimal;

/**
 * @author Castle
 * @Date 2021/5/31 15:17
 */
public class StaffHandler extends Handler {

    public StaffHandler(String role, Handler next) {
        super(role, next);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice().compareTo(BigDecimal.valueOf(5000)) <= 0) {
            System.out.println("购买金额：" + request.getPrice() + ", " + super.getRole() + "已处理");
        } else {
            super.getNext().processRequest(request);
        }
    }
}
