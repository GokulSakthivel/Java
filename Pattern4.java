import java.util.*;
class Pattern4{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        String s1 = s.substring(0,2);
        int sl = s.length();
        String s2 = s.substring(sl-2,sl);
        //char[] c = s.toCharArray();
        //for(int i=0;i<c.length;i++){
//System.out.print(c[i]);
       // }
        //int l = s.length();
        //String s1 = l+c[0]+c[1]+c[l-2]+c[l-1];
        System.out.print(sl+s1+s2);
    }
}

