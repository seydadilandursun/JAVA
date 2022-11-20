import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Variables
        int math;
        int physics;
        int chemistry;
        int turkish;
        int history;
        int music;
        //Create a scanner for your variables
        Scanner input = new Scanner(System.in);
        //Get the grade values from the student/user
        System.out.print("Please, write your Math grade: ");
        math = input.nextInt();
        System.out.print("Please, write your Physics grade: ");
        physics = input.nextInt();
        System.out.print("Please, write your Chemistry grade: ");
        chemistry= input.nextInt();
        System.out.print("Please, write your History grade: ");
        history = input.nextInt();
        System.out.print("Please, write your Music grade: ");
        music= input.nextInt();
        System.out.print("Please, write your Turkish grade: ");
        turkish= input.nextInt();
        //Find the user's average point:
        double your_gpa=(math+physics+music+chemistry+turkish+history) / 6.0;
        System.out.print(your_gpa+"\n");
        //Pass or fail:
        String pass_or_fail = (your_gpa >= 60) ? "You passed the class" : "You failed the class";
        System.out.print(pass_or_fail);

    }
}