package in.pelligent;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        AudioSource amazonMusic = new AudioSource.AudioSourceBuilder("Amazon Music", new BitrateController(Quality.MEDIUM))
                .setSubscriptionType("Free")
                .build();

        AudioSource spotify = new AudioSource.AudioSourceBuilder("Spotify", new BitrateController(Quality.SUPER_HIGH))
                .setSubscriptionType("Paid")
                .setIcon(new Icon("340X340", "./icon.png"))
                .build();

        amazonMusic.play();
        amazonMusic.next();
        spotify.play();
    }
}
