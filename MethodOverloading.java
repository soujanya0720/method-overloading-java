import java.util.*;
public class MethodOverloading{
    static class Calculator{
        public int add(int a, int b){
            return a+b;
        }
        private int add(int a, int b, int c){
            return a+b+c;
        }
        public void printThreeSum(int a, int b, int c){
            System.out.println("Sum of three numbers: " + add(a,b,c));
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Calculator calc = new Calculator();
        int sumTwo = calc.add(a,b);
        System.out.println("Sum of two numbers: " + sumTwo);
        calc.printThreeSum(a,b,c);
        sc.close();
    }
}