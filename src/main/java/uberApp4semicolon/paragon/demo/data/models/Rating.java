package uberApp4semicolon.paragon.demo.data.models;

public enum Rating {

    BAD(1),
    GOOD(2),
    SATISFACTORY(3),
    VERY_GOOD(4),
    EXCELLENT(5);
    private int rating;
    public int getRating(){
        return rating;
    }

    Rating(int rating){
        this.rating = rating;
    }
}
