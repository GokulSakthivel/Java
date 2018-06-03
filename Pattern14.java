import java.util.*;
class Pattern14{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = st.length();
        char c;
        int count=0;
        int a;
        int b;
        for(int i=0;i<n;i++){
            c = st.charAt(i);
            if(c == ' '){
                System.out.print(" ");
                continue;
            }
            a=c;
            b=a;
            while(a!=0){
                a=a/10;
                count++;
            }
            System.out.print(count+""+b);
            count=0;
        }
    }
}

