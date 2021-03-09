import java.util.Scanner;
public class Addmatrices {
    public static void main(String[] args) {
        int m, n; // số hàng và số cột của ma trận A, B

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng của ma trận A, B: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận A, B: ");
        n = scanner.nextInt();


        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int C[][] = new int[m][n];

        while (m > 0 && n > 0) {
                // nhập giá trị của các phần tử cho 2 ma trận A
                System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("A[" + i + "]["+ j + "] = ");
                        A[i][j] = scanner.nextInt();
                    }
                }

                // nhập giá trị của các phần tử cho 2 ma trận B
                System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("B[" + i + "]["+ j + "] = ");
                        B[i][j] = scanner.nextInt();
                    }
                }

                // hiển thị 2 ma trận vừa nhập
                System.out.println("Ma trận A: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(A[i][j] + "\t");
                    }
                    System.out.println("\n");
                }

                System.out.println("Ma trận B: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(B[i][j] + "\t");
                    }
                    System.out.println("\n");
                }

                // tính và in ra ma trận C = A + B
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        C[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            C[i][j] = A[i][j]  + B[i][j];
                        }
                    }
                }

                System.out.println("Ma trận tổng C: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(C[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
        }
    }

}
