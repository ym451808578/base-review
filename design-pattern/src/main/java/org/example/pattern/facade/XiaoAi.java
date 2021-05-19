package org.example.pattern.facade;

/**
 * @author 45180
 */
public class XiaoAi {

    private LightSystem lightSystem = new LightSystem();
    private MusicSystem musicSystem = new MusicSystem();
    private WindowSystem windowSystem = new WindowSystem();

    /**
     * 下班回到家，开灯、开音乐、拉窗帘
     */
    public void backHome() {
        lightSystem.open();
        musicSystem.open();
        windowSystem.close();
    }

    /**
     * 睡觉：关灯、关音乐
     */
    public void goBed() {
        musicSystem.close();
        lightSystem.close();
    }

    /**
     * 起床：拉开窗帘、打开音乐
     */
    public void wakeUp() {
        windowSystem.open();
        musicSystem.open();
    }
}
