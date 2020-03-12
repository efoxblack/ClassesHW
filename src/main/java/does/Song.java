package does;

public class Song {
    public String title;
    public String artist;

    public Song() {

    }

    public void setTitle() {
        System.out.println("The title of the song you chose is: " + title);
    }
    public void setArtist() {
        System.out.println("The artist of the song you chose is: " + artist);
    }
    public void play() {
        System.out.println("The current song playing is: " + title + " / " + artist);
    }
}
