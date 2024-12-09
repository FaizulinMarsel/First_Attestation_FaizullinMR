package AttestationOne.TaskTwo;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Cactus cactus = new Cactus();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите дату последнего полива (гггг-мм-дд): ");
            String inputDate = scanner.nextLine();
            if (inputDate.equalsIgnoreCase("exit")) {
                break;
            } else System.out.println(cactus.wateringPlants(LocalDate.parse(inputDate)));
        }


    }
}
