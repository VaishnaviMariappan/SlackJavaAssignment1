import java.util.Scanner;
public class rhombus
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Integer num1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        Integer num2 = b.nextInt();
        int Area=(num1*num2)/2;
        System.out.println("Area of rhombus = "+Area);
    }
}