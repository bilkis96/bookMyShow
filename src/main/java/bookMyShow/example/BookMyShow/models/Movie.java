package bookMyShow.example.BookMyShow.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String genre;
    private String duration;
    private String language;
    private String description;

    @OneToMany(mappedBy = "movie")
    private List<Booking> bookings;

}
