import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int leapYear;

        Scanner input=new Scanner(System.in);

        leapYear=input.nextInt();
        System.out.print("Yıl:");

        if (leapYear % 4 == 0 && (leapYear % 400 == 0 || leapYear % 100 !=0)) {
            System.out.println(leapYear + " bir artık yıldır!");
        }else {
            System.out.println(leapYear + " bir artık yıl değildir!");
        }

    }
}
