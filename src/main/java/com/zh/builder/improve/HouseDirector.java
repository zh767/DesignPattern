package com.zh.builder.improve;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者
     *
     * 指挥者（Director）直接和客户（Client）进行需求沟通；
     * 沟通后指挥者将客户创建产品的需求划分为 各个部件 的建造请求（Builder）；
     * 将各个部件的建造请求委派到具体的建造者（ConcreteBuilder）；
     * 各个具体建造者负责进行产品部件的构建；
     * 最终指挥者控制生产过程 并构建成具体产品（Product）
     */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
