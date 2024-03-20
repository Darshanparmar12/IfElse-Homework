import java.util.Scanner;

public class FindingCommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salesId = 84;

        String str = "Paul Newman";
        int basicSalary = 30000;
        //printing basic information
        System.out.println("Sales ID- " + salesId);
        System.out.println("Employee name- " + str);
        System.out.println("Basic salary " + basicSalary);
        System.out.println("Enter Sales Amount");

        //printing as scanner as amount could vary

        int salesAmount= scanner.nextInt();
        int salesCommission = salesAmount;

        if (salesCommission >=50000){
            double commission = (salesCommission)* 0.35; //35%
            System.out.println("Commission on Sales is " + commission);
        }else if (salesCommission >= 30000) {
            double commission = (salesCommission) * 0.20; //20%
            System.out.println("Commission on sales is " + commission);
        }else if (salesCommission >= 20000){
            double commission = (salesCommission) * 0.10;
            System.out.println("Commission on sales is " + commission);
        }else if (salesCommission >= 10000){
            double commission = (salesCommission) * 0.10;
            System.out.println("Commission on sales is " + commission);
        }else {
            double commission = (salesCommission) * 0.02;
            System.out.println("Commission on sales is " + (double)commission );
        }

    }
}
