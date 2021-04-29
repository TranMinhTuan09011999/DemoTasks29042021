package com.itsj.dependencyinjection;

public class DemoFixTightCouplingToDI {
    public static void main(String[] args){
        B b = new B();
        A a = new A(b);

        //a.display() will print A and B
        //this implementation can not be changed dynamically
        //being tight coupling
        a.display(b);
    }
}

class A{
    public A(B b) {
    }
    public void display(B b){
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
