package Console;
import java.util.Scanner;
public class Matrix_symmetric {

	public static void main(String[] args) {
		Scanner mat = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows : ");
         
        int rows = mat.nextInt();
         
        System.out.println("Enter the no. of columns : ");
         
        int cols = mat.nextInt();
         
        int matrix[][] = new int[rows][cols];
         
        System.out.println("Enter the elements :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = mat.nextInt();
            }
        }
         
        System.out.println("Input matrix :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
         
        if(rows != cols)
        {
            System.out.println("Matrix is not a square matrix, It is not symmetric.");
        }
        else
        {
            boolean symmetric = true;
             
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("Entered matrix is symmetric...");
            }
            else
            {
                System.out.println("The given matrix is not symmetric...");
            }
        }
         
        mat.close();
		

		// TODO Auto-generated method stub

	}

}