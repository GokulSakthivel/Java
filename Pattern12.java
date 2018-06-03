import java.util.*;
class Pattern12{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        //st = st.toLowerCase();
        char[] c = st.toCharArray();
        int n = st.length();
        int sum =0;
        int count=1;
        for(int i=0;i<n;i++){
            sum = sum + i;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(c[i]==c[j]){
                    sum = sum + count*j;
                    //count++;
                }
            }
            count=1;
        }
        System.out.println(sum);
    }
}


