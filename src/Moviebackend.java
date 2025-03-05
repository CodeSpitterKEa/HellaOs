public class Moviebackend {
    private String title;
    private String director;
    private double duration;

    public double getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }
// Splitter
    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieDetails(String title) {
        return(title);

    }
}
