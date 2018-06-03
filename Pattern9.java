import java.util.*;
class Pattern9{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int temp=0;
        int sum=0;
        if(in>=0){
        while(true){
            temp = in%10;
            sum = sum + temp;
            in = (in-temp)/10;
            if(in==0){
                in=sum;
                sum=0;
            if(in%10==in){
                break;
            }
            }
        }
        System.out.println(in);
        }
        else
        {
            System.out.println("InvalidNumber");
        }
        
    }
}


