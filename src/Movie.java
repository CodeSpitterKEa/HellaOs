public class Movie {
    public static void main(String[] args) {
        Moviebackend moviebackend = new Moviebackend();
        moviebackend.setDirector("Lyrical Lemonade");
        moviebackend.setTitle("Big Baller Life");
        moviebackend.setDuration(101);
        System.out.println(moviebackend.getMovieDetails(moviebackend.getTitle() +". Made by "+ moviebackend.getDirector() +" Duration "+ moviebackend.getDuration()));

    }


}
