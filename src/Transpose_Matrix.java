public class Transpose_Matrix
{
    public static void main(String[] args) {
        int [][] arr= new int [3][3];

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};//printing 2D array

        for(int i = 0; i < 3; i++)//body of the loop
        {
            for (int j = 0; j < 3; j++) //for loop for index j
            {
                System.out.print(a[j][i]+ " ");//printing out the result
            }System.out.println();
        }

    }
}
