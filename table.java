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

