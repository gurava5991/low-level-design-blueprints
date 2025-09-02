package designpattern.struturalpattern.facade.subsystem;

public class TheatreService {
    public String findNearestTheatre(String movieId, String userLocation) {
        System.out.println("Finding nearest theatre for " + movieId + " near " + userLocation);
        return "Theatre#123";
    }
}
