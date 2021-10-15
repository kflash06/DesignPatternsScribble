package in.pelligent;

public class AmazonMusicFactory implements AudioSourceAbstractFactory{
    private AmazonMusic instance;

    public AmazonMusicFactory(BitrateController bitrateController) {
        instance = new AmazonMusic(bitrateController);
    }

    @Override
    public AudioSource createAudioSource() {
        return instance;
    }
}
