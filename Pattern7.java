class Pattern7{
    public static void main(String[] str){
        int s = 10;
        int k = 1;
        for(int i=0;i<3;i++){
            for(int j=s;j>0&&s>=5;j--){
                System.out.print(" ");
            }
            s=s-5;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(k);
                k++;
                if((i>0)&&(j<2*i+1)){
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        k=2;
        s=5;
        for(int i=1;i>=0;i--){
            for(int j=0;j<s&&s<=10;j++){
                System.out.print(" ");
            }
            s=s+5;
            for(int j=0;j<2*i+1;j++){
                System.out.print(k);
                k++;
                if((i>0)&&(j<2*i+1)){
                    System.out.print("    ");
                }
            }
            k=1;
            System.out.println();
        }
    }
}
