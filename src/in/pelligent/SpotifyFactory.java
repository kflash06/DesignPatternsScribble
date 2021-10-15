package in.pelligent;

public class SpotifyFactory implements AudioSourceAbstractFactory{
    private Spotify instance;

    public SpotifyFactory(BitrateController bitrateController) {
        instance = new Spotify(bitrateController);
    }

    @Override
    public AudioSource createAudioSource() {
        return instance;
    }
}
