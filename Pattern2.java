import java.util.*;
class Pattern2{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = {'A','B','C','D','E','F','G','H','I','J','K'};
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
