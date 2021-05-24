package org.example.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Castle
 * @Date 2021/5/24 11:37
 */
public class Report {
    private List<Staff> staffList = new ArrayList<>();

    public void report() {
        staffList.add(new EngineerStaff("工程师1"));
        staffList.add(new EngineerStaff("工程师2"));
        staffList.add(new EngineerStaff("工程师3"));
        staffList.add(new ManagerStaff("项目经理1"));
        staffList.add(new ManagerStaff("项目经理2"));
        staffList.add(new ManagerStaff("项目经理3"));
    }

    public void show(IVisitor visitor) {
        for (Staff staff : staffList) {
            staff.accept(visitor);
        }
    }
}
