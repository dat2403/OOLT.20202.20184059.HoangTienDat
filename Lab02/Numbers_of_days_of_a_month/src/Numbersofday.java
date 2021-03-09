// in ra so ngay cua 1 thang voi thang, nam nhap tu ban phim
import java.util.Scanner;
public class Numbersofday {
    public static void main(String[] args){
        int year;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i!=1){
            String  month;
            System.out.println("Nhap vao thang: ");
            month = scanner.nextLine();
            System.out.println("Nhap vao nam: ");
            year = scanner.nextInt();
            if(year < 100) {
                System.out.println("Nam khong hop le!");
                System.out.println("Moi ban nhap lai: ");
                year = scanner.nextInt();
            }
            switch (month.toLowerCase()){
                case "1":
                case "january":
                case "jan.":
                case "jan":
                case "3":
                case "march":
                case "mar.":
                case "mar":
                case "5":
                case "may":
                case "7":
                case "july":
                case "jul":
                case "8":
                case "august":
                case "aug.":
                case "aug":
                case "10":
                case "october":
                case "oct.":
                case "oct":
                case "12":
                case "december":
                case "dec.":
                case "dec":
                    System.out.println("Thang " +month + " nam " +year + " co 31 ngay");
                    break;
                case "2":
                case "february":
                case "feb.":
                case "feb":
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                        System.out.println("Thang " +month + " nam " + year + " co 29 ngay");
                    }
                    else {
                        System.out.println("Thang " + month + " nam " +year + " co 28 ngay");
                    }
                    break;
                case "4":
                case "april":
                case "apr.":
                case "apr":
                case "6":
                case "june":
                case "jun":
                case "9":
                case "september":
                case "sept.":
                case "sep":
                case "11":
                case "november":
                case "nov.":
                case "nov":
                    System.out.println("Thang " +month + " nam " +year + " co 30 ngay");
                    break;
                default:
                    System.out.println("Thang khong hop le!");
                    break;
            }
        }
    }
}