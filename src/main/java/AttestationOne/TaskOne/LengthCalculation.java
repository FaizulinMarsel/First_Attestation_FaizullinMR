package AttestationOne.TaskOne;

public class LengthCalculation {

    private static final double LENGTH_THREE_LETTERS = 0.62;
    private static final double LENGTH_ONE_SPACE = 0.12;

    protected void getFenceLength(double fenceLength){
        double lengthSentence = 5*LENGTH_THREE_LETTERS + 3 * LENGTH_ONE_SPACE;
        if(fenceLength < lengthSentence){
            System.out.println("Длинны забора не хвататет для признания в любви");
        }
        else System.out.println("Длинны забора хватит на признание в любви");
    }
}
