package in.pelligent;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        AudioSource amazonMusic = new AudioSource("Amazon Music", new BitrateController(Quality.MEDIUM), new Icon("340X340", "./amazonMusic.png"), "Paid");

        AudioSource spotify = amazonMusic.clone();
        spotify.setName("Spotify");
        spotify.getIcon().setUri("./spotify.png");

        amazonMusic.play();
        amazonMusic.next();
        spotify.play();
    }
}
