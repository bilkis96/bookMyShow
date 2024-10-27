package bookMyShow.example.BookMyShow.service;

import bookMyShow.example.BookMyShow.models.Booking;
import bookMyShow.example.BookMyShow.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking)
    {
        return bookingRepository.save(booking);
    }
}
