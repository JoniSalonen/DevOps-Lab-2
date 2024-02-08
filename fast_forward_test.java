import java.util.Scanner;

class fast_forward_test {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter number one");
        String num1 = numbers.nextLine();
        System.out.println("Enter number one");
        String num2 = numbers.nextLine();
        System.out.println("Enter number one");
        String num3 = numbers.nextLine();
        System.out.println("Enter number one");
        String num4 = numbers.nextLine();
        double numb1 = Integer.parseInt(num1);
        double numb2 = Integer.parseInt(num2);
        double numb3 = Integer.parseInt(num3);
        double numb4 = Integer.parseInt(num4);
        double average = (numb1 + numb2 + numb3 +numb4)/4 ;

        System.out.println("Average is: " + average );


        int largest = Math.max(Math.max(numb1, numb2), Math.max(numb3, numb4));
        int smallest = Math.min(Math.min(numb1, numb2), Math.min(numb3, numb4));

        System.out.println("Average is: " + average);
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);


    }

    

    
}
