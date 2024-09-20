import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for A: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns for A: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of rows for B: ");
        int p = sc.nextInt();
        System.out.print("Enter the number of columns for B: ");
        int q = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[p][q];
        int[][] result = new int[m][q];
        if(n==q){
            System.out.println("Enter the elements of the A:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the b:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    B[i][j] = sc.nextInt();
                }
            }
        
                for (int i = 0; i <m ; i++) {
                    for (int j = 0; j < q; j++) {
                        for (int k = 0; k < n; k++) {
                            result[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Cannot multiply");
        }
    }
}
