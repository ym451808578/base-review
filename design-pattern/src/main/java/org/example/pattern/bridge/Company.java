package org.example.pattern.bridge;

/**
 * @author Castle
 * @Date 2021/5/19 8:31
 */
public abstract class Company {

    private IProduct product;

    public Company(IProduct product) {
        this.product = product;
    }

    public void makeProfile() {
        this.product.beProduced();
        this.product.beSold();
    }
}
