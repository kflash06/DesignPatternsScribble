package in.pelligent;

public class AmazonMusic extends Application implements AudioSource {
    BitrateController bitrateController;
    Icon icon;
    public AmazonMusic(BitrateController bitrateController) {
        super("Amazon Music");
        System.out.println("Starting Amazon Music");
        this.bitrateController = bitrateController;
        icon = new Icon("340X340", "\"C:\\Users\\visha\\OneDrive\\Pictures\\PELLIGENT_LOGO\\PNG\\ICON\\Pelligent_Logo_Final-14.png\"");
    }

    @Override
    public BitrateController getBitRateController() {
        return bitrateController;
    }

    @Override
    public String getSrcName() {
        return super.getName();
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public boolean minimizable() {
        return false;
    }


    @Override
    public void play() {
        Speaker.getInstance().play(this);
    }

    @Override
    public void pause() {
        Speaker.getInstance().pause(this);
    }

    @Override
    public void next() {
        System.out.println("Moving to next");
    }

    @Override
    public String toString() {
        return "AmazonMusic{" +
                "bitrateController=" + bitrateController +
                '}';
    }
}
