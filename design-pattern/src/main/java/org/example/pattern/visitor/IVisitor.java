package org.example.pattern.visitor;

/**
 * @author Castle
 * @Date 2021/5/24 11:22
 */
public interface IVisitor {

    void visit(EngineerStaff engineerStaff);

    void visit(ManagerStaff managerStaff);
}
