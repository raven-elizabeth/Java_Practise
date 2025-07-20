package beginner;

import java.util.Scanner;

public class calcInfiniteSum {

    public static void main(String[] args){
        System.out.println("How many numbers do you want to add?");
        Scanner scanner = new Scanner(System.in);
        int amountOfNums = scanner.nextInt();

        double[] numbers = new double[amountOfNums];

        for(int i = 0; i < amountOfNums; i++){
            System.out.printf("Enter number %d\n", i);
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Adding your numbers...");
        System.out.printf("The total is: %f", calcSum(numbers));

    }

    // Using varargs
    public static double calcSum(double[] args){
        double sum = 0;
        for(double i: args){
            sum += i;
        }
        return sum;
    }
}
