import java.util.Scanner;

public class Example21 {

    public static void main(String[] args) {

        int num, positives, i;
        Scanner input = new Scanner(System.in);
        i = 0;
        positives = 0;

        while (i < 10) {
            System.out.println("Enter a number");
            num = input.nextInt();
            if (num >= 0) {
                positives ++;
            }
            i++;
        }
        System.out.println("positives " + positives);
    }
}




