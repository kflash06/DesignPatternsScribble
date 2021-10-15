package in.pelligent;

public class YoutubeFactory implements AudioSourceAbstractFactory{
    private Youtube instance;

    public YoutubeFactory(BitrateController bitrateController) {
        instance = new Youtube(bitrateController);
    }

    @Override
    public AudioSource createAudioSource() {
        return instance;
    }
}
