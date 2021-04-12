public class BMIService {
    public float calculate(float weight, float high) {

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your weight: "); //Введите Ваш вес
        // int weight = input.nextInt();
        // System.out.print("Enter your high: ");  //Введите Ваш рост
        //int high = input.nextInt();
        // closing the scanner object
        //input.close();
        float high1 = high/100; // Transform in metres
        float BMI = weight/(high1*high1); // Body Mass Index
        return (BMI);


    }
}
