import java.util.*;
class Patient{
    String name = new String();
    double weight,height;
    double BMI(double weight, double height){
        return weight/(height*height)*703;
    }
}
class Patients{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        Patient p = new Patient();
        System.out.println(p.BMI(weight,height));
    }
}
