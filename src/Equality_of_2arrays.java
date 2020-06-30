public class Equality_of_2arrays
{
    public static void main(String[] args)//main method
    {
        int a[]={1,2,3,4,5};//initialization
        int b[]={4,6,2,3,6};//initialization

        if (a.length== b.length) {//if loop to compare lenth of a and b
            System.out.println("both arrays are equal size");
            for (int i = 0; i < a.length; i++) { //for loop for index i
                for (int j = 0; j < a.length; j++) { // forl oop for index j
                    if (a[i] == b[j]) {  // if loop to compare index values
                        System.out.println((b[j] + " Equal value in both array"));
                    }//printing out the result
                }
            }}
        else
            {
                System.out.println("not equal array");//printing out the result
            }
        }
    }

