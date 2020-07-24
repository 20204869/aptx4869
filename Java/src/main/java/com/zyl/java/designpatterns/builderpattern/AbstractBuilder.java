package com.zyl.java.designpatterns.builderpattern;

/**
 * @author 4869
 *

 */
public abstract class AbstractBuilder {
    protected Role role = new Role();

    public abstract void buildHead();

    public abstract void buildFace();

    public abstract void buildBody();

    public abstract void buildHp();

    public abstract void buildSp();

    public abstract void buildMp();

    public Role getResult() {
        return role;
    }
}
