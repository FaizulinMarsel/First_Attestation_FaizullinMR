package AttestationOne.TaskFour;

import java.util.Random;

import static javax.swing.UIManager.get;

public class SelectLetterProgramm {

    private final String [] listLeterrs = {"К","Н","Б"};

    protected String randomSelectLetter(){
        Random random = new Random();
        return listLeterrs[random.nextInt(listLeterrs.length)];
    }

}
