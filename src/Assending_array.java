public class Assending_array
{
    public static void main(String[] args)

    {
    int a[] = {2, 5, 9, 3, 1};//initialization
    int asd = 0;
    for (int i = 0; i < a.length; i++)
    {
        for(int s=i+1;s<a.length;s++)
        {
            if (a[i] > a[s])
            {
                asd = a[i];
                a[i]=a[s];
                a[s]=asd;
            }
        }
        System.out.println(a[i]);
    }
}}