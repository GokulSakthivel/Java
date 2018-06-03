import java.util.*;
class Pattern3{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] st = s.toCharArray();
        int len = st.length;
        char temp = st[0];
        st[0] = st[len-1];
        st[len-1] = temp;
        for(int i=0;i<len;i++){
            System.out.print(st[i]);
        }
    }
}
