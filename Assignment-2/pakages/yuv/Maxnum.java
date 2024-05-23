package yuv;

public class Maxnum {
        public static int findMax(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null");
            }
            
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }
    }