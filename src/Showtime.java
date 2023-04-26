import java.time.*;

public class Showtime {
    private Seat[][] seats;
    private LocalTime time;
    private LocalDate date;
    private int ticketPrice;

    public Showtime(Theater theater, LocalDate date, LocalTime time, int ticketPrice) {
        seats = theater.getSeats().clone();
    }

}
