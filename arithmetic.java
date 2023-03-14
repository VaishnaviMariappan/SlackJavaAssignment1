import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        Integer num1=a.nextInt();
        Scanner b = new Scanner(System.in);
        Integer num2=b.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int divi=num1/num2;
        int rem=num1%num2;
        System.out.println("Addition : "+add+"\nSubtraction : "+sub+"\nMultiplication : "+mul+"\nDivision : "+divi+"\nReminder : "+rem);
    }
}


