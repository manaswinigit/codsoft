package codsoft;
import java.util.Scanner;
public class studentgradecalculator {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to STUDENTGRADECALCULATOR ! Making your work simpler,quicker,easier");
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter marks obtained: "+i+ ":");
            int marks=sc.nextInt();
            totalmarks+=marks;

        }
        double avgPercentage=(double)totalmarks/n;
        String grade;
        if(avgPercentage >= 90) {
            grade = "O";
        } else if(avgPercentage >= 80) {
            grade = "A";
        } else if(avgPercentage >= 70) {
            grade = "B";
        } else if(avgPercentage >= 60) {
            grade = "C";
        } else if(avgPercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + avgPercentage);
        System.out.println("Grade: " + grade);

        sc.close();

    }
}
