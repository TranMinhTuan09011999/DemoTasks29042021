package com.itsj.tightcoupling;

public class DemoTightCoupling {
    public static void main(String[] args){
        A a = new A();

        //a.display() will print A and B
        //this implementation can not be changed dynamically
        //being tight coupling
        a.display();
    }
}

class A{
    B b;
    public A() {
        //b is tightly couple to A
        b = new B();
    }
    public void display(){
        System.out.println("A");
        b.display();
    }
}

class B{
    public B() {
    }
    public void display(){
        System.out.println("B");
    }
}
