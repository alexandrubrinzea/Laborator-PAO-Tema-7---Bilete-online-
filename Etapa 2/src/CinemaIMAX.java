public class CinemaIMAX extends Events{
    private String movieTitle, Genre;
    private int ageRestriction;
    private String[] Actors;

    public CinemaIMAX() throws Exception{
        super();
    }

    public CinemaIMAX(String eventName, String eventType, int uniqueCode, String stringStartDate, String stringEndDate, String movietitle, String genre, int agerestriction, String[] actors, Venue location) throws Exception{
        super(eventName, eventType, uniqueCode, stringStartDate, stringEndDate, location);
        movieTitle = movietitle;
        Genre = genre;
        ageRestriction = agerestriction;
        Actors = actors;
    }
}
