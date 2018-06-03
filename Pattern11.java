class Pattern11{
    public static void main(String[] str){
        char[] s = {'!','@','#','$','%'};
        for(int i =0;i<5;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }
}
