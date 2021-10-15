package in.pelligent;

public class Main {

    public static void main(String[] args) {
        AudioSource source = AudioSourceFactory.getAudioSource(new AmazonMusicFactory(new BitrateController(Quality.MEDIUM)));
        source.play();
        source.next();
        source.pause();
    }
}
