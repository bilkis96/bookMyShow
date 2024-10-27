package bookMyShow.example.BookMyShow.controller;

import bookMyShow.example.BookMyShow.models.Movie;
import bookMyShow.example.BookMyShow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies()
    {
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie)
    {
       return movieService.saveMovie(movie);
    }


}
