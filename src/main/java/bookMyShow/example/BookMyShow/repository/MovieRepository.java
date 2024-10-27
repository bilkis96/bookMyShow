package bookMyShow.example.BookMyShow.repository;

import bookMyShow.example.BookMyShow.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
