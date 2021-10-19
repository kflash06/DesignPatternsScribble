package in.pelligent;

public class AudioSource implements CloneableAudioSrc {
    private BitrateController bitrateController;
    private String name;

    private Icon icon;
    private String subscriptionType;

    public AudioSource (String name, BitrateController controller, Icon icon, String subscriptionType) {
        this.name = name;
        this.bitrateController = controller;
        this.icon = icon;
        this.subscriptionType = subscriptionType;
    }

    public void setBitrateController(BitrateController bitrateController) {
        this.bitrateController = bitrateController;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    BitrateController getBitRateController() {
        return bitrateController;
    }

    String getSrcName() {
        return name;
    }

    Icon getIcon() {
        return icon;
    }

    boolean minimizable() {
        return false;
    }

    public void play() {
        Speaker.getInstance().play(this);
    }

    public void pause() {
        Speaker.getInstance().pause(this);
    }

    public void next() {
        System.out.println("Moving to next");
        play();
    }

    @Override
    public String toString() {
        return "AudioSource{" +
                "bitrateController=" + bitrateController +
                ", icon=" + icon +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public AudioSource clone() {
        AudioSource src = new AudioSource(name, new BitrateController(bitrateController.getQuality()), new Icon(icon.getBitmap(), icon.getUri()), subscriptionType);
        return src;
    }
}
