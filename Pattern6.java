import java.util.*;
class Pattern6{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        int vl;
        for(int i=0;i<n;i++){
            vl = s[i].length();
            System.out.println(s[i].substring(0,1)+s[i].substring(vl-1));
        }
    }
}


