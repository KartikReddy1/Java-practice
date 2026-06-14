package com.Methods;

public class Test2 {
    int i;
    int j;
    public Test2() {
        i = 10;
        j = 20;
    }
    public Test2(int i,int j) {
        this.i = i;
        this.j = j;
    }
      public static void main(String[] args){
          Test2 t1 = new Test2();
          Test2 t2 = new Test2(15,20);
          Test2 t3 = new Test2(50,80);
          System.out.println(t1.add());
          System.out.println(t2.add());
          System.out.println(t3.add());

          System.out.println(t1 == t2);
          System.out.println(t2 == t3);



      }
    public int add(){
        return i+j;
    }
}
