import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {

        float firstNumberOrnella;
        float secondNumberOrnella;
        float sum;
        float difference;
        float quotient;
        float product;

         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program calculates sum, difference, product and quotient for two numbers. ");
              // Get user input for two numbers
            System.out.println("Enter the first number: ");
            firstNumberOrnella=Float.parseFloat(br.readLine());

            System.out.println("Enter the second number: ");
            secondNumberOrnella=Float.parseFloat(br.readLine());


            // Calculate sum, difference, product, and quotient
            sum = firstNumberOrnella + secondNumberOrnella;
            difference = firstNumberOrnella- secondNumberOrnella;
            product= firstNumberOrnella * secondNumberOrnella;
            quotient=firstNumberOrnella/ secondNumberOrnella;

            // Display the results with two decimal places

            System.out.printf("Sum: %.2f\n", sum);
            System.out.printf("Difference: %.2f\n", difference);
            System.out.printf("Product: %.2f\n", product);
            System.out.printf("Quotient: %.2f\n", quotient);
        }
    }


