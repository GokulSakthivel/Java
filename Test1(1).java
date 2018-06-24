import java.io.*;
import java.util.*;
class Test1{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int p = 0;
		int q=n-1;
		Arrays.sort(a);
		while((p!=q)&&(p<q)){
		    System.out.print(a[p++]+" ");
		    System.out.print(a[q--]+" ");
		}
		if(n%2!=0){
		    System.out.print(a[n/2]);
		}
	}
}
