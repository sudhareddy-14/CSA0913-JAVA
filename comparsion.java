 class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1000000; 

       
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("Iteration ").append(i).append(", ");
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");

        
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("Iteration ").append(i).append(", ");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTimeStringBuffer - startTimeStringBuffer) + " ms");
    }
}
