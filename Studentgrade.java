import java.util.Scanner;

class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 90)
            System.out.println("Grade A");
        else if (marks >= 70)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
