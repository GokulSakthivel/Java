import java.util.*;
class Wipro_robot{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String s = sc.next();
        int p_x = s.charAt(0)-'0';
        int p_y = s.charAt(2)-'0';
        String[] d = {"E","SE","S","SW","W","NW","N","NE"};
        int f = 0;
        for(int i=0;i<d.length;i++){
            if(d[i].equals(s.substring(4))) f = i;
        }
        sc.nextLine();
        String s1 = (sc.nextLine()).replace(" ","");
        String res = "";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='R') f=((f+2>7)?f+2-8:f+2);
            if(s1.charAt(i)=='L') f=((f-2<0)?f-2+8:f-2);
            if(s1.charAt(i)=='r') f=((f+1>7)?0:f+1);
            if(s1.charAt(i)=='l') f=((f-1<0)?7:f-1);
            if((s1.charAt(i)=='M')&&(f==0)) p_x++;
            if((s1.charAt(i)=='M')&&(f==1)){
                p_x++;
                p_y--;
            }
            if((s1.charAt(i)=='M')&&(f==2)) p_y--;
            if((s1.charAt(i)=='M')&&(f==3)){
                p_x--;
                p_y--;
            }
            if((s1.charAt(i)=='M')&&(f==4)) p_x--;
            if((s1.charAt(i)=='M')&&(f==5)){
                p_x--;
                p_y++;
            }
            if((s1.charAt(i)=='M')&&(f==6)) p_y++;
            if((s1.charAt(i)=='M')&&(f==7)){
                p_x++;
                p_y++;
            }
            if(!((p_x<=x)&&(p_y<=y)&&(p_x>=0)&&(p_y>=0))){
                res = res+"-ER";
                break;
            }
            else res = p_x+"-"+p_y+"-"+d[f];
        }
        System.out.println(res);
    }
}

