import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array of strings (separated by spaces):");
        String inputArrayStr = scanner.nextLine();
        String[] inputArray = inputArrayStr.split("\\s+");

        String[] resultArray = filterStrings(inputArray);

        for (String str : resultArray) {
            System.out.print(str + " ");
        }
    }

    public static String[] filterStrings(String[] array) {
        List<String> result = new ArrayList<>();
        for (String str : array) {
            if (str.length() <= 3) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
}