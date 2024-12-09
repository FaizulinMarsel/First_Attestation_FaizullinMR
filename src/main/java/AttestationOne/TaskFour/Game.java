package AttestationOne.TaskFour;

import java.util.Scanner;

public class Game {
    private int myPoints = 0;
    private int programmPoints = 0;
    private int numberOfRounds = 0;
    private static final int maxRounds = 5;

    protected void rulesOfTheGame(){

        while(numberOfRounds < maxRounds){
            Scanner scanner = new Scanner(System.in);
            SelectLetterProgramm programmClass = new SelectLetterProgramm();
            String randomLetter = programmClass.randomSelectLetter();

            System.out.println("Введите букву: ");
            String myLetter = scanner.nextLine();
            System.out.println(randomLetter);

            if (myLetter.equals("К") && randomLetter.equals("Б")){
                programmPoints +=5;
            }else if(myLetter.equals("К") && randomLetter.equals("Н")){
                myPoints += 1;
            }else if (myLetter.equals("Н") && randomLetter.equals("К")){
                programmPoints += 1;
            }else if (myLetter.equals("Н") && randomLetter.equals("Б")){
                myPoints += 2;
            }else if (myLetter.equals("Б") && randomLetter.equals("К")){
                myPoints += 5;
            }else if (myLetter.equals("Б") && randomLetter.equals("Н")){
                programmPoints += 2;
            }

            numberOfRounds++;
        }
        resultGame();
    }
    private void resultGame(){
        if(programmPoints < myPoints){
            System.out.println("Игрок победил.\nКоличество очков игрока: " + myPoints + "\n"
                    + "Количество очков компьютера: " + programmPoints);
        }else if (myPoints < programmPoints){
            System.out.println("Победил компьютер.\nКоличество очков компьютера: " + programmPoints + "\n"
                    + "Количество очков игрока: " + myPoints);
        }else System.out.println("Ничья.\nКоличество очков игрока: " + myPoints + "\n"
                + "Количество очков компьютера: " + programmPoints);
    }

}
