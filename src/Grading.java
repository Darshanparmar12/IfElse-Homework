import java.util.Scanner;

public class Grading {


    static String str = "Raj"; //Name of student so string
    static int number = 127;
    static int eng = 80;
    static int maths = 45;
    static int bio = 30;
    static int totalMarks = 300; //for percentage
    static int total = eng + maths + bio;
    static double percentage = (total/ (double) totalMarks) * 100;


    public static void main(String[] args)
    {
//Printing basic information first
        System.out.println("Student name - " + str);
        System.out.println("Roll number - " + number); //roll number


        if (eng >= 80)
        {
            System.out.println("Grade in English - " + "A+" );
        } else if (eng >= 60)
        {
            System.out.println("Grade in English - " + " A ");
        }else if (eng>=50){
            System.out.println("Grade in English - " + " B" );
        }else if (eng>=35){
            System.out.println("Grade in English - " + " C" );
        }else{
            System.out.println("fail in English");
        }
        if (maths>=80)
        {
        System.out.println("Grade in Maths - " + "A+" );
        }else if (maths>=60) {
        System.out.println("Grade in Maths - " + "A " );
        }else if(maths>=50) {
        System.out.println("Grade in Maths - " + "B " );
        }else if (maths>=35) {
        System.out.println("Grade in Maths - " + "C" );
        }else  {
        System.out.println("fail in Maths");
        }
        if (bio>=80)
        {
            System.out.println("Grade in Biology - " + " A+");
        }else if (bio>=60) {
            System.out.println("Grade in Biology - " + " A");
        }else if (bio>=50) {
            System.out.println("Grade in Biology - " + " B");
        }else if (bio>=35) {
            System.out.println("Grade in Biology - " + " C" );
        }else {
            System.out.println("Fail in Biology");
        }
        System.out.println("Total marks " + total); //total marks
        System.out.println("Overall Percentage " + String.format("%.2f", percentage));
// Made the percentage shorter

    }}

