package in.pelligent;

public final class AudioSourceFactory {
    public static AudioSource getAudioSource(AudioSourceAbstractFactory factory) {
        return factory.createAudioSource();
    }
}
