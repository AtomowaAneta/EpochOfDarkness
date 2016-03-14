package Places;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stycz0007 on 08.03.16.
 */
public class PlacesTest {
    static Land land;
    static Fort fort;

    @Test
    public void testifFirstLandIsCreated(){
        land = new Land();
        boolean expected = true;
        boolean result = land.isCreated;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfFortCanBeAddedToLand(){
        land = new Land();
        Fort result = land.placeFort();
        assertThat(result).isNotEqualTo(null);
    }

    @Test
    public void testIfCastleCanBeAddedToLand(){
        land = new Land();
        Castle result = land.placeCastle();
        assertThat(result).isNotEqualTo(null);
    }
}
