package AttestationOne.TaskTwo;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;


public class Cactus implements Plants{
    Sensor sensor = new Sensor();
    LocalDate nextDateWateringOfTheCactus;

    @Override
    public String wateringPlants(LocalDate lastDateWateringOfTheCactus) {

        final EnumSet<Month> winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
        final EnumSet<Month> spring = EnumSet.of(Month.MARCH, Month.APRIL, Month.MAY);
        final EnumSet<Month> summer = EnumSet.of(Month.JUNE, Month.JULY, Month.AUGUST);
        final EnumSet<Month> fall = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER);

        Month month = lastDateWateringOfTheCactus.getMonth();

            if(winter.contains(month)){
                nextDateWateringOfTheCactus = lastDateWateringOfTheCactus.plusMonths(1);
            }
            else if(spring.contains(month) || fall.contains(month)){
                nextDateWateringOfTheCactus = lastDateWateringOfTheCactus.plusWeeks(1);}
            else if(summer.contains(month)){
                int valueHumidity = sensor.generationHumidity();
                System.out.println("Влажность воздуха: " + valueHumidity);
                if(valueHumidity < 30){
                    nextDateWateringOfTheCactus = lastDateWateringOfTheCactus.plusDays(2);
                }else {
                    nextDateWateringOfTheCactus = lastDateWateringOfTheCactus.plusDays(3);
                }
            }
            return "Следующая дата полива: " + nextDateWateringOfTheCactus;
        }
}
