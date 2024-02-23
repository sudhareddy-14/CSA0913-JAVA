 class PatternPrint {
    public static void main(String[] args) {
        int n = 5,num=1; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = n-i; j >= 0; j++) {
                System.out.print("  ");
            }

   
            for (int k = 1; k <= i; k++) {
                
                System.out.print("+num*num"+" ");
num++;
            }

            System.out.println();
        }
    }
}
