package org.example.pattern.mediator;

/**
 * @author 45180
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("***采购人员采购商品***");
        PurchaseColleague purchaseColleague = new PurchaseColleague(mediator);
        purchaseColleague.buyProduct(100);
        System.out.println("***销售人员销售商品***");
        SalesColleague salesColleague = new SalesColleague(mediator);
        salesColleague.sell(1);
        System.out.println("***库房清理库存***");
        StockColleague stockColleague = new StockColleague(mediator);
        stockColleague.clearStock();
    }
}
