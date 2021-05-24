package org.example.pattern.visitor;

/**
 * @author Castle
 * @Date 2021/5/24 11:28
 */
public class CTOVisitor implements IVisitor {
    @Override
    public void visit(EngineerStaff engineerStaff) {
        System.out.println("工程师：" + engineerStaff.getName() + "的工作量是：" + engineerStaff.getWorks());
    }

    @Override
    public void visit(ManagerStaff managerStaff) {

        System.out.println("项目经理：" + managerStaff.getName() + "的工程量是：" + managerStaff.getProject());

    }
}
