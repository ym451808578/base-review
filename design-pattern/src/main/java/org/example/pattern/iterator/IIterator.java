package org.example.pattern.iterator;

/**
 * @author Castle
 * @Date 2021/5/24 14:45
 */
public interface IIterator {

    /**
     * 是否还有下一个（坐标）
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前对象，指针指向下一个（坐标）
     *
     * @return
     */
    Object next();
}
