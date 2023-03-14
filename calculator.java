import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        System.out.println("Addition = 1\nSubtraction = 2\nMultiplication = 3\nDivision = 4");
        System.out.print("Choose one number: ");
        Scanner a = new Scanner(System.in);
        Integer choice = a.nextInt();
        Scanner x = new Scanner(System.in);
        Integer num1 = a.nextInt();
        Scanner y = new Scanner(System.in);
        Integer num2 = a.nextInt();
        if(choice==1)
        {
            int add=num1+num2;
            System.out.println("Addition : "+add);
        }
        else if(choice==2)
        {
            int sub=num1-num2;
            System.out.println("Subtraction : "+sub);
        }
        else if(choice==3)
        {
            int mul=num1*num2;
            System.out.println("Multiplication : "+mul);
        }
        else if(choice==4)
        {
            int div=num1/num2;
            System.out.println("Division : "+div);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
