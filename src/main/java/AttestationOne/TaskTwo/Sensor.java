package AttestationOne.TaskTwo;

import java.util.concurrent.ThreadLocalRandom;

public class Sensor {

    protected int generationHumidity(){
        return ThreadLocalRandom.current().nextInt(0,100);
    }
}
