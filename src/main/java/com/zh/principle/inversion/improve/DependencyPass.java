package com.zh.principle.inversion.improve;

public class DependencyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //方法直接传递接口 进行依赖传递
        //IOpenAndClose openAndClose = new OpenAndClose();
        //openAndClose.open(changHong);

        //通过构造器和设置类里面的接口属性 进行依赖传递
        //IOpenAndClose openAndClose = new OpenAndClose(changHong);
        //openAndClose.open();
        //通过setter方法 进行依赖传递
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
        //三种区别：
        // 第一种 直接关联方法 传入接口参数
        // 第二种 通过创建实例时 构造方法传入接口参数
        // 第三种 通过setter方法传入接口参数
    }

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
/*interface IOpenAndClose {
    public void open(ITV tv); //抽象方法,接收接口
}

interface ITV { //ITV接口
    public void play();
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }

}

// 实现接口
class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}*/



// 方式2: 通过构造方法依赖传递
/*interface IOpenAndClose {
    public void open(); //抽象方法
}

interface ITV { //ITV接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITV tv; //成员

    public OpenAndClose(ITV tv) { //构造器
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}
class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}*/



// 方式3 , 通过setter方法传递

interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}

interface ITV { // ITV接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }

}
