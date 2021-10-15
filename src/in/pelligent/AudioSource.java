package in.pelligent;

public interface AudioSource {
    BitrateController getBitRateController();
    String getSrcName();
    Icon getIcon();
    boolean minimizable();
    void play();
    void pause();
    void next();
}
