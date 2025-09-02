package designpattern.struturalpattern.facade.subsystem;

public class MovieCatalogService {
    public boolean isMovieAvailable(String movieId) {
        System.out.println("Checking movie availability for: " + movieId);
        return true;
    }
}
