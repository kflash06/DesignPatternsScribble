package in.pelligent;

public class JioSaavnFactory implements AudioSourceAbstractFactory{
    private JioSaavn instance;

    public JioSaavnFactory(BitrateController bitrateController) {
        instance = new JioSaavn(bitrateController);
    }

    @Override
    public AudioSource createAudioSource() {
        return instance;
    }
}
