import java.util.*;
class Pattern13{
    public static void main(String[] str){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int n = c.length;
    int sum = 0;
    for(int i=0;i<n;i++){
        if((c[i]>=48)&&(c[i]<58))
        {
            sum = sum + c[i] - 48;
        }
    }
    System.out.println(sum);
    }
}
