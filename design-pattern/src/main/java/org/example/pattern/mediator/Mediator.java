package org.example.pattern.mediator;

/**
 * @author 45180
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object[] args) {
        if ("sale.sell".equals(str)) {
            this.sell((int) args[0]);
        } else if ("sale.offSell".equals(str)) {
            this.offSell();
        } else if ("purchase.buy".equals(str)) {
            buy((int) args[0]);
        } else if ("stock.clear".equals(str)) {
            clearStock();
        }
    }

    private void clearStock() {
        super.salesColleague.offSell();
        super.purchaseColleague.refuseBuy();
    }

    private void offSell() {
        System.out.println("折价销售商品：" + stockColleague.getStockNum());
    }

    private void sell(int number) {
        System.out.println("销售商品：" + number);
        super.stockColleague.decrease(number);
    }

    private void buy(int number) {
        int saleStatus = super.salesColleague.getSaleStatus();
        super.stockColleague.decrease(saleStatus);
        if (saleStatus > 80) {
            System.out.println("销售很好，补充库存，采购商品:" + number);
            super.stockColleague.increase(number);
        } else {
            int buyNum = number / 2;
            System.out.println("销售不好，采购商品：" + buyNum);
            super.stockColleague.increase(buyNum);
        }
    }
}
