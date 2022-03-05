package nl.utwente.soa.sampleWebapplication.services;

import nl.utwente.soa.sampleWebapplication.domain.Movie;
import nl.utwente.soa.sampleWebapplication.omdb.SearchResult;
import nl.utwente.soa.sampleWebapplication.omdb.OtherData;
import nl.utwente.soa.sampleWebapplication.omdb.OtherData.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class XmlMovieService implements  MovieService{

    // Request a free API KEY from: http://www.omdbapi.com/apikey.aspx
    public static final String API_KEY = "ec356b30";

    public List<Movie> getMovies(){

        String searchQuery = "Harry Potter";

        RestTemplate rest = new RestTemplate();
        SearchResult result = rest.getForObject("http://www.omdbapi.com/?s=" + searchQuery + "&apikey=" + API_KEY + "&r=XML&t=movie",
                SearchResult.class);

        return result.getResults().stream().map(item -> {

            // Do a request to also retrieve the actors, languages and description for each movie found by the API.
            System.out.println(item);
            OtherData otherData = rest.getForObject("http://www.omdbapi.com/?apikey="+API_KEY+"&i="+item.getImdbID()+"&plot=full&r=xml",
                    OtherData.class);


            Item myitem = otherData.getResult();
            System.out.println(myitem.toString());


            return new Movie(item.getTitle(), "" + item.getYear(), myitem.getActors(), myitem.getPlot(), myitem.getLanguage());
        }).collect(Collectors.toList());

    }

}
