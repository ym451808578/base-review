package org.example.pattern.mediator;

/**
 * @author 45180
 */
public abstract class AbstractMediator {

    protected SalesColleague salesColleague;
    protected PurchaseColleague purchaseColleague;
    protected StockColleague stockColleague;

    public AbstractMediator() {
        salesColleague = new SalesColleague(this);
        purchaseColleague = new PurchaseColleague(this);
        stockColleague = new StockColleague(this);
    }

    public abstract void execute(String str, Object... args);

}
