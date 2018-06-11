import java.util.*;
import java.math.*;
class Calculator{
    static double powerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}
class TestCalculator{
    public static void main(String[] str){
    	Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        double v3 = sc.nextDouble();
        int v4 = sc.nextInt();
        System.out.println(Calculator.powerInt(v1,v2));
        System.out.println(Calculator.powerDouble(v3,v4));
    }
}
