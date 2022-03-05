package nl.utwente.soa.sampleWebapplication.omdb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.*;

@XmlRootElement(name="root")
public class OtherData {

    @XmlElement(name = "movie")
    public Item data;

    public Item getResult() {
        return data;
    }


    public static class Item {

        @XmlAttribute
        private String title;

        @XmlAttribute
        private String year;

        @XmlAttribute
        private String rated;

        @XmlAttribute
        private String released;

        @XmlAttribute
        private String runtime;

        @XmlAttribute
        private String genre;

        @XmlAttribute
        private String director;

        @XmlAttribute
        private String writer;

        @XmlAttribute
        private String actors;

        @XmlAttribute
        private String plot;

        @XmlAttribute
        private String language;

        @XmlAttribute
        private String country;

        @XmlAttribute
        private String awards;

        @XmlAttribute
        private String poster;

        @XmlAttribute
        private String metascore;

        @XmlAttribute
        private String imdbRating;

        @XmlAttribute
        private String imdbVotes;

        @XmlAttribute
        private String imdbID;

        @XmlAttribute
        private String type;

        public String getTitle() {
            return title;
        }

        public String getYear() {
            return year;
        }

        public String getRated() {
            return rated;
        }

        public String getReleased() {
            return released;
        }

        public String getRuntime() {
            return runtime;
        }

        public String getGenre() {
            return genre;
        }

        public String getDirector() {
            return director;
        }

        public String getWriter() {
            return writer;
        }

        public List<String> getActors() {
            List<String> returnData = Arrays.asList(actors.split("\\s*,\\s*"));
            return returnData;
        }

        public String getPlot() {
            return plot;
        }

        public String getLanguage() {
            return language;
        }

        public String getCountry() {
            return country;
        }

        public String getAwards() {
            return awards;
        }

        public String getPoster() {
            return poster;
        }

        public String getMetascore() {
            return metascore;
        }

        public String getImdbRating() {
            return imdbRating;
        }

        public String getImdbVotes() {
            return imdbVotes;
        }

        public String getImdbID() {
            return imdbID;
        }

        public String getType() {
            return type;
        }
    }
}
