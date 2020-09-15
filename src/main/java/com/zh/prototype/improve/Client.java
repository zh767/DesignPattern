package com.zh.prototype.improve;


public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        //浅拷贝 可以拷贝基本数据类型和String
        sheep.friend = new Sheep("jack", 2, "黑色");
        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆
        //看到friend的hashcode一样 证明sheep 拷贝了而里面的对象只是复制引用
        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());

        //修改原型羊的friend属性 而复制的羊的friend的属性也修改 证明是复制的引用 这就是浅拷贝
        sheep.friend.setAge(123);
        System.out.println(sheep5.friend.getAge());
    }

}

