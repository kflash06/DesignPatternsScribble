package in.pelligent;

public class AudioSource {
    private BitrateController bitrateController;
    private String name;

    private Icon icon;
    private String subscriptionType;

    private AudioSource(AudioSourceBuilder builder) {
        this.name = builder.name;
        this.bitrateController = builder.bitrateController;
        this.icon = builder.icon;
        this.subscriptionType = builder.subscriptionType;
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

    public static class AudioSourceBuilder {
        private BitrateController bitrateController;
        private String name;

        private Icon icon;
        private String subscriptionType;

        public AudioSourceBuilder(String name, BitrateController controller) {
            bitrateController = controller;
            this.name = name;
        }

        public AudioSourceBuilder setIcon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public AudioSourceBuilder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        public AudioSource build() {
            return new AudioSource(this);
        }
    }

    @Override
    public String toString() {
        return "AudioSource{" +
                "bitrateController=" + bitrateController +
                ", icon=" + icon +
                ", name='" + name + '\'' +
                '}';
    }
}
