package com.yiwang.javalearningphase2.object;

public class TestThis {
    int a,b,c;
    TestThis(){
        System.out.println(" 正要new 一个Hello 对象");
    }
    TestThis(int a,int b){
//Hello(); // // 这样是无法调用构造方法的！
        this(); // 调用无参的构造方法，并且必须位于第一行！
        a = a;// 这里都是指的局部变量而不是成员变量
        this.a = a;// 这样就区分了成员变量和局部变量. 这种情况占了this 使用情况的大多数！
        this.b = b;
    }
    TestThis(int a,int b,int c){
        this(a,b); // 调用无参的构造方法，并且必须位于第一行！
        this.c = c;
    }
    void sing(){}
    void chifan(){
        this.sing(); //sing();
        System.out.println(" 你妈妈喊你回家吃饭！");
    }
    public static void main(String[] args){
        TestThis hi = new TestThis(2,3);
        hi.chifan();
    }
}
