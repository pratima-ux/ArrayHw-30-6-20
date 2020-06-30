import java.util.Scanner;

public class Specific_Value {
    public static void main(String[] args)
    {
        int num[] = {1, 2, 3, 4, 5};//initialization
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any no:");
        int toFind = scanner.nextInt();
        boolean found = false;

        for (int i=0;i<num.length;i++)
        {  int  n = num[i];
            if (toFind == n )
            {
               found = true;

                break;
            }
        }
        if(found)
           System.out.println(toFind + " is found.");
        else
           System.out.println(toFind + " is not found.");
    }
}