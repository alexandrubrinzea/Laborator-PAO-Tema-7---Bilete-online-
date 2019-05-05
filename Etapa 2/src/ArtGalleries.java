public class ArtGalleries extends Events{
    private String expositionType, artistName;

    public ArtGalleries() throws Exception{
        super();
    }

    public ArtGalleries(String eventName, String eventType, int uniqueCode, String stringStartDate, String stringEndDate, String artist, String exposition, Venue location) throws Exception{
        super(eventName, eventType, uniqueCode, stringStartDate, stringEndDate, location);
        artistName = artist;
        expositionType = exposition;
    }
}
