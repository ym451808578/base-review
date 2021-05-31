package org.example.pattern.cor;

import java.math.BigDecimal;

/**
 * @author Castle
 * @Date 2021/5/31 15:30
 */
public class Client {
    public static void main(String[] args) {
        Handler master = new MasterHandler("处长", null);
        Handler manager = new ManagerHandler("科长", master);
        Handler staff = new StaffHandler("员工", manager);
        PurchaseRequest request = new PurchaseRequest(1, "服务器", BigDecimal.valueOf(160000));
        staff.processRequest(request);
    }
}
