import java.util.Scanner;
public class string_int
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=input.nextLine();
        int num=Integer.parseInt(str);
        System.out.println("The number is: "+num);
    }
}