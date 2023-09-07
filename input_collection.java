import java.util.Scanner;
class in {
        public static void main(String[] arg){
            Scanner ramdom_bill = new Scanner(System.in);
            System.out.print("what is yor name: ");
            String collection = ramdom_bill.nextLine();
            System.out.printf("hi %s you are gay", collection);
            ramdom_bill.nextLine();
            //the extra scanner is to check the next enter press
            System.out.print("how old are you?");
            int age = ramdom_bill.nextInt();
            // number use Nextint() not line
            System.out.printf("your age %d \n", age);
            System.out.println("average gpa");
            ramdom_bill.nextLine();

            double gpa = Double.parseDouble(ramdom_bill.nextLine());
            System.out.printf("this skips the scanner .nextline() %f\n", gpa);
            System.out.println("average letter");

            char grade = ramdom_bill.next().charAt(0);
            //no othere way to input only one character
            System.out.printf("char: %c", grade);
            ramdom_bill.close();

        }
}