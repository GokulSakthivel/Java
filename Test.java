import java.util.*;
class Box{
    double volume(double width,double height,double depth){
        return width*height*depth;
    }
}
class Test{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();
        Box B = new Box();
        System.out.println(B.volume(width,height,depth));
    }
}
