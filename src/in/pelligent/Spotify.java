package in.pelligent;

public class Spotify extends Application implements AudioSource{
    BitrateController bitrateController;
    Icon icon;
    public Spotify(BitrateController bitrateController) {
        super("Spotify");
        System.out.println("Starting Spotify");
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
        return true;
    }

    @Override
    public void play() {
        Speaker.getInstance().play(this);
//        speaker.play(this);
    }

    @Override
    public void pause() {
        Speaker.getInstance().pause(this);
    }

    @Override
    public void next() {
        System.out.println("Moving to next");
    }

//    @Override
//    public String toString() {
//        return "Spotify{" +
//                "bitrateController=" + bitrateController +
//                '}';
//    }
}
