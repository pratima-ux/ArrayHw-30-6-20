public class SumOfArray {
    public static void main(String[] args) {//main method
        int a[] = {2, 4, 6, 3, 9};//initialization
        int sum = 0;
        for (int i = 0; i < a.length; i++)//for loop
            sum = sum + a[i]; //doing sum of array
        {

            System.out.println("Sum of all elements is = " + sum);//printout result
        }
    }
}
