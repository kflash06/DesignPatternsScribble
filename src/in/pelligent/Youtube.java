package in.pelligent;

public class Youtube extends Application implements AudioSource{
    BitrateController bitrateController;
    Icon icon;
    public Youtube(BitrateController bitrateController) {
        super("YouTube");
        System.out.println("Starting YouTube");
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
        return "Youtube{" +
                "bitrateController=" + bitrateController +
                '}';
    }
}
