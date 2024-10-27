package bookMyShow.example.BookMyShow.controller;

import bookMyShow.example.BookMyShow.models.Booking;
import bookMyShow.example.BookMyShow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    public Booking createBooking(@RequestBody Booking booking)
    {
        return bookingService.createBooking(booking);
    }

}
