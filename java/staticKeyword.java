package  Static;


public class staticKeyword {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo.disp1();
        d.disp2();
    }
}

class Demo {
    static int a;
    static int b;

    int m;
    int n;

    static{
        a = 10;
        b = 20;
        System.out.println("control in static block");
    }

    {
        m = 100;
        n = 200;
        System.out.println("control in non static block");
    }

    static void disp1(){
        System.out.println("variable static a : " + a);
        System.out.println("variable static b : " + b);
    }

    void disp2(){
        System.out.println("variable non static m : " + m);
        System.out.println("variable non static n : " + n);
    }
}

