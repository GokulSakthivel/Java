import java.util.*;
class Test2{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String s = sc.next();
        int d_len = 0;
        int temp=d;
        int min=temp%10;
        int max=0;
        while(temp!=0){
            int last=temp%10;
            if(min>last){
                min=last;
            }
            if(max<last){
                max=last;
            }
            d_len++;
            temp=temp/10;
        }
        int l = s.length();
        //char c = s.charAt(l/2);
        if(d_len==5){
            System.out.println(max+""+((l%2==1)?"#":"$")+""+min+""+s.charAt(l/2));
        }
        else{
            System.out.println("0000");
        }
    }
}


