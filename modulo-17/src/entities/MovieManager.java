package entities;

import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieManager() {
        addMovies();
    }

    private void addMovies() {
        /*
        movies.add(new Movie("O Poderoso Chefão"));
        movies.add(new Movie("O Senhor dos Anéis"));
        movies.add(new Movie("Titanic"));
        movies.add(new Movie("A Lista de Schindler"));
        movies.add(new Movie("Forrest Gump"));
        movies.add(new Movie("Star Wars"));
        movies.add(new Movie("Jurassic Park"));
        movies.add(new Movie("Avatar"));
        movies.add(new Movie("O Rei Leão"));
        movies.add(new Movie("Os Vingadores"));
        */
        movies.add(new Movie("Interestelar"));
        movies.add(new Movie("O Labirinto do Fauno"));
        movies.add(new Movie("Pulp Fiction"));
        movies.add(new Movie("Matrix"));
        movies.add(new Movie("A Origem"));
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
