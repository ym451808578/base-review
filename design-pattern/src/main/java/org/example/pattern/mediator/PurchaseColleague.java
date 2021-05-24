package org.example.pattern.mediator;

/**
 * @author 45180
 */
public class PurchaseColleague extends AbstractColleague {
    public PurchaseColleague(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyProduct(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuy() {
        System.out.println("暂时不采购商品");
    }
}
