package AttestationOne.TaskThree;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int [] number = {1,5,7,3,2,0,4,9,6};
        Arrays.sort(number);
        System.out.println(number[number.length - 2]);
    }

}
