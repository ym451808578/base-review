package org.example.pattern.mediator;

/**
 * @author 45180
 */
public class StockColleague extends AbstractColleague {
    private static int STOCK_NUM = 100;

    public StockColleague(AbstractMediator mediator) {
        super(mediator);
    }

    public int getStockNum() {
        return STOCK_NUM;
    }

    public void increase(int number) {
        STOCK_NUM += number;
        System.out.println("增加库存：" + number + " ，现库存：" + STOCK_NUM);
    }

    public void decrease(int number) {
        STOCK_NUM -= number;
        System.out.println("减少库存：" + number + " ，现库存：" + STOCK_NUM);
    }

    public void clearStock() {
        System.out.println("清仓库存：" + STOCK_NUM);
        super.mediator.execute("stock.clear");
    }
}
