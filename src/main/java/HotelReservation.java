public class HotelReservation {
    public boolean addHotel() {
        System.out.println("Welcome To Hotel Reservation");
        Hotel likeWood = new Hotel("LikeWod", "180", "190", "120", "100", "3.5");
        System.out.println("LikeWood Hotel Is Added");
        System.out.println(likeWood);
        Hotel BridgeWood = new Hotel("BridgeWood", "190", "198", "199", "189", "3.9");
        System.out.println(BridgeWood);
        Hotel RidgeWood = new Hotel("RidgeWood", "189", "190", "156", "167", "3.3");
        System.out.println(RidgeWood);
        return true;
    }
}

