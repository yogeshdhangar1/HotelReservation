import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void CheckHotelTest(){
        HotelReservation hr = new HotelReservation();
        boolean result = hr.addHotel();
        Assert.assertEquals(result,true);
    }
}
