import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        int temp = 0;
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();7
        } while (n < 0);
        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        //In mảng vừa nhập
        System.out.println("Mảng: ");
        for (int i = 0; i <n; i++) {
            System.out.print(array[i] + " ");
        }
        // tính tổng các phần tử có trong mảng và trung bình cộng các phần tử trong mảng
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("\nTổng các phần tử có trong mảng = " + sum);

        System.out.println("\nTrung bình cộng các phần tử trong mảng = " + sum/n);


        //Sắp xếp mảng
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                if(array[i] >array[j]) {      //swap
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //In mảng được sắp xếp
        System.out.println("\nMảng sắp xếp theo thứ tự tăng dần: ");
        for (int i = 0; i <n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}