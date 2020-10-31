
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }

    public int getDuration() {
        return this.durationInSeconds;
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compared;
        if (comparedSong.getArtist().equals(this.artist) && comparedSong.getName().equals(this.name)
                && comparedSong.getDuration() == this.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
