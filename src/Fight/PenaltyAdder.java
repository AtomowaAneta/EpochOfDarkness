package Fight;

import java.util.Random;

/**
 * Created by stycz0007 on 15.03.16.
 */
public class PenaltyAdder {
    Random rand = new Random();

    public double randPenalty(){
        return rand.nextDouble();
    }
}
