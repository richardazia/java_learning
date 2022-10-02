import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int studentAge = 40;
        double studentGPA = 3.14;
        String studentFirstName = "Richard";
        int studentFirstNameLength = studentFirstName.length();
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastLetter = studentFirstName.charAt(studentFirstNameLength - 1);
        char studentLastInitial = 'A';
        boolean neverSick = true;
        String studentComment = "Strings are a reference type in Java.";
        double studentGrade = 7;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastLetter);
        System.out.println(studentLastInitial);
        System.out.println(studentFirstName + " " + studentLastInitial + ". He said: " + studentComment);
        System.out.println(neverSick);
        System.out.println(studentGrade);
        System.out.println(studentComment);
        System.out.println("What is your updated grade?");

        Scanner input = new Scanner(System.in);
        studentGrade = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastInitial + " has a grade average of " + studentGrade);
    }
}