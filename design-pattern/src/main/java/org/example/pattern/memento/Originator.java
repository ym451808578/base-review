package org.example.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/25 8:43
 */
@Data
@AllArgsConstructor
public class Originator {
    private String state;

    /**
     * 创建一个备忘录
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 从备忘录恢复
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
