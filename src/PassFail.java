public class PassFail extends Grading {
//extending class from Grading so that we dont have type variables and class again
    public static void main(String[] args) {

// Previous class marks
// static int eng = 80;
// static int maths = 45;
// static int bio = 30;

if (eng >=35 && maths>35 && bio>=35){
    System.out.println(str + " is passed on all subject");
} else {
    System.out.println(str + " is failed");
}
    }
}