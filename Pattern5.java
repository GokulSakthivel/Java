import java.util.*;
class Pattern5{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char[] c = in.toCharArray();
        int count=0;
        int n = in.length();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
            
        }
            
            if(count>0){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        
    }
}
