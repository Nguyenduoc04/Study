package lession9;

public class Calculator {
    public void calculate(int[] numbers) {
        if (!validateInput(numbers)) return;

        int sum = calculateSum(numbers);

        // Calculate average
        double average = (double) sum / numbers.length;

        int max = findMax(numbers);

        int min = getMin(numbers);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    private static int getMin(int[] numbers) {
        // Find min
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        // Find max
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int calculateSum(int[] numbers) {
        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static boolean validateInput(int[] numbers) {
        // Validate input
        if (numbers == null) {
            System.out.println("Error: Array is null");
            return true;
        }
        if (numbers.length == 0) {
            System.out.println("Error: Array is empty");
            return true;
        }
        return false;
    }
}
