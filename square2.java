class PatternPrint {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            for (int j = 1; j <= i; j++) {
                System.out.print(square + "   ");
                square += 1; 
            }
            System.out.println();
        }
    }
}
