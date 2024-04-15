import java.util.Arrays;

public class SumaCercana {
   
    public static int sumaMasCercana(int[] arr, int target) {
        Arrays.sort(arr); 
        int closestSum = Integer.MAX_VALUE; 
        int minDiff = Integer.MAX_VALUE; 

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
