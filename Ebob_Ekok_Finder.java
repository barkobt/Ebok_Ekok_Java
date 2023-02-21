import java.util.Scanner;

public class Ebob_Ekok_Finder {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int ebob;
        int ekok;
        System.out.print("Bir sayı giriniz: ");
        int n2 = input.nextInt();
        if (n1 > n2) {
            for (int k = n2; k >= 1; k--) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("Ebob: " + ebob);
                    break;
                }
            }
        } else {
            for (int k = n1; k >= 1; k--) {

                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("Ebob: " + ebob);
                    break;
                }

            }

        }
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok: " + i);
                break;
            }
        }

        System.out.println("================");
        if (n2 > n1) {
            int k = n1;
            while (k >= 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    break;
                } else {
                    k--;
                }


            }System.out.println(k);

        } else {
            int k = n2;
            while (k >= 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    break;
                } else {
                    k--;

                }
            }System.out.println(k);

        }


    }
}


