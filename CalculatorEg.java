package assignment;


public class CalculatorEg {
    public int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int subtract(int... nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result -= nums[i];
        }
        return result;
    }

    public int multiply(int... nums) {
        int result = 1;
        for (int num : nums) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        CalculatorEg calculator = new CalculatorEg();
        System.out.println("The Addition (1+2+3) is: " + calculator.add(1, 2, 3));
        System.out.println("The Subtraction (5-3-1) is: " + calculator.subtract(5, 3, 1));
        System.out.println("The Multiplication (2*4*1) is: " + calculator.multiply(2, 4, 1));
    }
}