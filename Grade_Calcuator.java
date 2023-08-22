import java.util.Scanner;

public class Grade_Calcuator {
    public static void main(String[] args) {
        float a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks Obtained: ");
        System.out.println("Enter Marks In Physics : ");
        a = sc.nextFloat();
        System.out.println("Enter Marks In Chemistry : ");
        b = sc.nextFloat();
        System.out.println("Enter Marks In Mathematics : ");
        c = sc.nextFloat();
        System.out.println("Enter Marks In Hindi : ");
        d = sc.nextFloat();
        System.out.println("Enter Marks In English : ");
        e = sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println("Total Marks Obtained : " + sum);
        float avg = sum / 5;
        System.out.println("Average Percentage : " + avg + " %");
        if (avg >= 95) {
            System.out.println("Grade : A+");
        } else if (avg >= 90 && avg < 95) {
            System.out.println("Grade : A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade : B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Grade : C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Poor Performance! ");
        }
    }
}
