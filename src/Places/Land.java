package Places;

/**
 * Created by stycz0007 on 08.03.16.
 */
public class Land {
    Fort fort ;
    Castle castle;
    public boolean isCreated = false;

    public Land(){
        isCreated = true;
    }

    public Fort placeFort(){
        return fort = new Fort();
    }

    public Castle placeCastle(){
        return castle = new Castle();
    }

}
