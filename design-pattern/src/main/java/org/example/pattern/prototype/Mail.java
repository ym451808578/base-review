package org.example.pattern.prototype;

import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/18 8:54
 */
@Data
public class Mail implements Cloneable {

    private String username;
    private String subject;
    private String context;
    private String tail;

    public Mail(SalaryTemplate salaryTemplate) {
        this.subject = salaryTemplate.getSalSubject();
        this.context = salaryTemplate.getSalContext();
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return mail;
    }
}
