package org.example.pattern.bridge;

/**
 * @author Castle
 * @Date 2021/5/19 8:37
 */
public class ElecCompany extends Company{
    public ElecCompany(IProduct product) {
        super(product);
    }

    @Override
    public void makeProfile() {
        super.makeProfile();
        System.out.println("电子厂赚大钱了");
    }
}
