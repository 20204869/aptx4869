package com.zyl.java.designpatterns.builderpattern;

/**
 * 指挥者类
 */
public class Director {

    public void construct(AbstractBuilder builder){
        builder.buildBody();
        builder.buildHead();
        builder.buildFace();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}