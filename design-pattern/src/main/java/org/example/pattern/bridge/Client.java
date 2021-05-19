package org.example.pattern.bridge;

/**
 * @author Castle
 * @Date 2021/5/19 8:44
 */
public class Client {
    public static void main(String[] args) {
        Company company=new ElecCompany(new IpadProduct());
        company.makeProfile();

        company=new ElecCompany(new XiaoMiProduct());
        company.makeProfile();
    }
}
