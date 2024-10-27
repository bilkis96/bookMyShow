package bookMyShow.example.BookMyShow.service;

import bookMyShow.example.BookMyShow.models.Movie;
import bookMyShow.example.BookMyShow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies()
    {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id)
    {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie saveMovie(Movie movie)
    {
        return movieRepository.save(movie);
    }

}
