package Fight;

import java.util.Random;

/**
 * Created by stycz0007 on 15.03.16.
 */
public class BonusAdder {
    Random rand = new Random();

    public double randBonus(){
        return rand.nextDouble()*10;
    }
}
