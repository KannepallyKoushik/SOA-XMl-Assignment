package nl.utwente.soa.sampleWebapplication.services;

import nl.utwente.soa.sampleWebapplication.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StaticMovieService implements MovieService {

    public List<Movie> getMovies(){
        return Arrays.asList(
            new Movie("SOA with webservices","2020", Arrays.asList("Leon", "João)"), "Aoubt service oriented architectrure with webservices", "EN"),
            new Movie("SOA with webservices","2020", Arrays.asList("Leon", "João)"), "Aoubt service oriented architectrure with webservices", "EN")
        );
    }
}
