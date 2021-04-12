import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        //float weight = 64;
        //float high = 1.77f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight: "); //Введите Ваш вес
        float weight = input.nextInt();
        System.out.print("Enter your high in santimetres: ");  //Введите Ваш рост
        float high = input.nextInt();
        // closing the scanner object
        input.close();
        float BMI = service.calculate(weight, high);
        System.out.println(BMI);
        if (BMI > 20 && BMI< 25) {
            System.out.println("Good job, stay fit");
        }
        if (BMI < 20) {
            System.out.println("You have to eat pizza every day");
        }
        if (BMI>25) {
            System.out.println("Run Run Run");
        }
    }
}
