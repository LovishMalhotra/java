package Static;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }
}

class Farmer{
    int pa;
    float tp;
    static float ri;
    float si;

    static {
        ri = 8.5f;
    }
    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount");
        pa = scan.nextInt();
        System.out.println("enter the time period");
        tp = scan.nextFloat();
    }

    void compute(){
        si = (pa*tp*ri)/100f;
    }

    void disp(){
        System.out.println("the SI is : " + si);
    }
}


