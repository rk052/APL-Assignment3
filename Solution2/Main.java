import java.util.Scanner;

abstract class Arithmetic{
    public abstract int addition(int x, int y);
    public abstract int subtraction(int x, int y);
    public abstract int multiplication(int x, int y);
    public abstract double division(int x, int y);
}

class Answer extends Arithmetic{
    public int addition(int x, int y) {
        return x+y;
    }
    public int subtraction(int x, int y) {
        return x-y;
    }
    public int multiplication(int x, int y) {
        return x*y;
    }
    public double division(int x, int y) {
        return x/y;
    }

}

public class Main{
    public static void main(String[] args){
        int x, y;
        Answer a=new Answer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer");
        x=sc.nextInt();

        System.out.println("Enter second integer");
        y=sc.nextInt();

        System.out.println(x + "+" + y + "=" + a.addition(x,y));
        System.out.println(x + "-" + y + "=" + a.subtraction(x,y));
        System.out.println(x + "*" + y + "=" + a.multiplication(x,y));
        System.out.println(x + "/" + y + "=" + a.division(x,y));
    }
}
