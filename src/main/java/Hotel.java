public class Hotel {
    String hotelName;
    String hotelRatesForWeekDayRegularCustomer;
    String hotelRatesForWeekendRegularCustomer;
    String hotelRatesForWeekDayRewardCustomer;
    String hotelRatesForWeekendRewardCustomer;
    public Hotel(String hotelName, String hotelRatesForWeekDayRegularCustomer, String hotelRatesForWeekendRegularCustomer, String hotelRatesForWeekDayRewardCustomer, String hotelRatesForWeekendRewardCustomer, String ratingOfHotel) {
        this.hotelName = hotelName;
        this.hotelRatesForWeekDayRegularCustomer = hotelRatesForWeekDayRegularCustomer;
        this.hotelRatesForWeekendRegularCustomer = hotelRatesForWeekendRegularCustomer;
        this.hotelRatesForWeekDayRewardCustomer = hotelRatesForWeekDayRewardCustomer;
        this.hotelRatesForWeekendRewardCustomer = hotelRatesForWeekendRewardCustomer;
    }

}
