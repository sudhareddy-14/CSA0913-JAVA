import java.util.Arrays; 
import java.util.HashMap; 
import java.util.Map; 
 class MeanMedianMode { 
public static void main(String[] args) { 
int[] elements = {16, 18, 27, 16, 23, 21, 19}; 
double sum = 0; 
for (int element : elements) { 
sum += element; 
} 
double mean = sum / elements.length; 
Arrays.sort(elements); 
double median; 
if (elements.length % 2 == 0) { 
median = (elements[elements.length / 2 - 1] + 
elements[elements.length / 2]) / 2.0; 
} else { 
median = elements[elements.length / 2]; 
} 
Map<Integer, Integer> frequency = new HashMap<>(); 
int maxFrequency = 0; 
int mode = 0; 
for (int element : elements) { 
int count = frequency.getOrDefault(element, 0) + 1; 
frequency.put(element, count); 
if (count > maxFrequency) { 
maxFrequency = count; 
mode = element; 
} 
} 
// Output 
System.out.println("Mean = " + mean); 
System.out.println("Median = " + median); 
System.out.println("Mode = " + mode);
} 
} 
