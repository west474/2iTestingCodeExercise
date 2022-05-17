import java.util.Scanner;

public class CodingExercise {

    /**
     * Iterates in multiples of A until X.
     * Then iterates in multiples of A+1 until 2X.
     * Then iterates in multiples of A+2 until 3X
     *
     * @author: Richard West
     * @date: 17-05-2022
     *
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        int total;

            for (int i = 1; i <= x / a; i++){
                total = i * a;
                System.out.println(total);
            }
            for (int i = 1; i <= 2*x / a; i++){
                a = a+1;
                total = i * a;
            }
            for (int i = 1; i < 3*x / a; i++){
                a = a+2;
                total = i * a;
            }

        }
    }
