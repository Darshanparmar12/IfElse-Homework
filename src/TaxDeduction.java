import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class TaxDeduction {
    static String str = "Max Smith "; //employee name
    static int employeeId = 125;
    static int basicSalary = 2000;

    //putting formula to calculate taxes and printing accordingl
    static void calculateHRA() {
        System.out.println("HRA " + basicSalary * (double) 10 / 100);
    }

    static void calculateDA() {
        System.out.println("DA " + basicSalary * (double) 8 / 100);
    }

    static void calculateTA() {
        System.out.println("TA " + basicSalary * (double) 9 / 100);
    }

    static void calculatePf() {
        System.out.println("PF " + basicSalary * (double) 20 / 100);
    }




    public static void main(String[] args) {

        System.out.println("Name of the employee - " + str);
        System.out.println("Employee ID - " + employeeId);
        calculateHRA();
        calculateDA();
        calculatePf();
        calculateTA();




}}













