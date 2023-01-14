import java.util.Scanner;
import java.util.ArrayList;
public class PersonGenerator {
    public static void main(String[] args) {
        Scanner in - new Scanner(System.in);

        ArrayList<Double> inputs = new ArrayList<Double>();
        System.out.print("Enter numbers: ");
        while (in.hasNextDouble()) {
            inputs.add(in.nextDouble());
        }
        System.out.println(inputs);
    }
}