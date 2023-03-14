import java.util.Scanner;
public class compare
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        Integer num1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        Integer num2 = b.nextInt();
        if (num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if (num1 < num2)
        {
            System.out.println(num1 + " is lesser than " + num2);
        }
        else
        {
            System.out.println("The numbers are equal");
        }
    }
}

