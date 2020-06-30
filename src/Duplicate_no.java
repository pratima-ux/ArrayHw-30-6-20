public class Duplicate_no
{
    public static void main(String[] args)
    {
        int arr[]={2,34,5,6,2,5,4,6};//initialization

        for (int a=0; a<arr.length; a++)//for loop
            {
            for (int b=a+1; b<arr.length;b++)//for loop
                {
                    if (arr[a] == arr[b])//if loop to compare value
                  {
                      System.out.println("Duplicates value is = "+ arr[b]); //print out result
                  }
                }
            }
    }
}


