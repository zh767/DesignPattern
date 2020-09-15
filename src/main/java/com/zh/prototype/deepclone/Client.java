package com.zh.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {

        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
       /* DeepProtoType p2 = (DeepProtoType) p.clone();

        p.deepCloneableTarget.setCloneName("我修改了哈哈哈");

        System.out.println("p.name=" + p.name + " p.deepCloneableTarget="
                + p.deepCloneableTarget.hashCode() + " target cloneName: "
                + p.deepCloneableTarget.getCloneName());
        System.out.println("p2.name=" + p.name + " p2.deepCloneableTarget="
                + p2.deepCloneableTarget.hashCode() + " target cloneName: "
                + p2.deepCloneableTarget.getCloneName());*/

        //方式2 完成深拷贝
		DeepProtoType p2 = (DeepProtoType) p.deepClone();
		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }

}
