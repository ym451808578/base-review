package org.example.pattern.mediator;

import java.util.Random;

/**
 * @author 45180
 */
public class SalesColleague extends AbstractColleague {
    public SalesColleague(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 正常销售
     *
     * @param number
     */
    public void sell(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售商品：" + number);
    }

    /**
     * 反馈销售情况，0-100表示畅销程度
     *
     * @return
     */
    public int getSaleStatus() {
        int saleStatus = new Random().nextInt(100);
        System.out.println("商品的销售情况：" + saleStatus);
        return saleStatus;
    }

    /**
     * 打折处理
     *
     * @return
     */
    public void offSell() {
        super.mediator.execute("sale.offSell");
    }
}
