import java.io.*;
import java.util.*;
class Test3{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int count=0;
		int flag=0;
		String c = "~!@#$%^&*()_+:><?|{}[\';,.']1234567890";
		for(int i=0;((i<s.length()));i++){
		    String s1 = s.substring(i,i+1);
		    if((c.contains(s1))){
		        flag=1;
		        break;
		    }
		}
		    for(int i=0;((i<t.length()));i++){
		    String t1 = t.substring(i,i+1);
		    if((c.contains(t1))){
		        flag=1;
		        break;
		    }
		}
		for(int i=0;i<t.length();i++){
		    if(s.contains(t.substring(i,i+1))){
		        count++;
		        s=s.replace(t.charAt(i),'\0');
		    }
		}
		if(flag==0){
		if((count==s.length())&&(s.length()==t.length())){
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
		}
		else{
		    System.out.println("Invalid String");
		}
	}
}
