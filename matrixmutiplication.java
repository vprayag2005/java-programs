import java.util.Scanner;
public class matrixmutiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row1,row2,col1,col2;
        System.out.println("Enter the number of rows of matrix1");
        row1=sc.nextInt();
        System.out.println("Enter the number of colunm of matrix1");
        col1=sc.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        row2=sc.nextInt();
        System.out.println("Enter the number of column of matrix2");
        col2=sc.nextInt();
        int[][] mat1=new int[row1][col1];
        int[][] mat2=new int[row2][col2];
        int[][] mat3=new int[row1][col2];
        if (col1!=row2) {
            System.out.println("Matrix Mutiplication Not Possible");
        }else{
            System.out.println("Matrix1");
            for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col1; j++) {
                        System.out.println("Enter the value at position["+i+"]["+j+"]");
                        mat1[i][j]=sc.nextInt();
                    }
            }
            System.out.println("Matrix2");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.println("Enter the value at position["+i+"]["+j+"]");
                    mat2[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int j2 = 0; j2 < col1; j2++) {
                        mat3[i][j]+=mat1[i][j2]*mat2[j2][j];
                    }
                }
            }
            System.out.println("Matrix Mutiplication result");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(mat3[i][j]+"\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
