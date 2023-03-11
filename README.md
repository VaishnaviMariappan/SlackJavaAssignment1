# SlackJavaAssignment1

## Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers

```java
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
        int div=num1/num2;
        int rem=num1%num2;
        System.out.println("Addition : "+add+"\nSubtraction : "+sub+"\nMultiplication : "+mul+"\nDivision : "+div+"\nReminder : "+rem);
    }
}
```
### Output:

## Write a Java program to compare two numbers
```java
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
```
### Output: 
 
##  Write a Java program to convert a string to an integer
```java
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
```
### Output:

## Java Program to find area of rhombus
```java
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
```
## Write a Java program to find the number of days in a month
```java
import java.util.Scanner;
public class days_month
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a month number");
        Integer month=a.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}
```
## Write a Java program to print the even numbers from 1 to 20 
```java
public class even
{
    public static void main(String[] args)
    {
        for(int i=0;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
```
### Output: 

## Write a Java program to create a simple calculator
```java
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
```
### Output:

## Write a Java program to print multiplication table of given number
```java
import java.util.Scanner;
public class table
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        Integer num = a.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            int table = num * i;
            System.out.println(num+"*"+i+"="+table);
        }
    }
}
```
### Output: 
