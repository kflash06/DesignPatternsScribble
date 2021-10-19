package in.pelligent;

public class BitrateController {
    private int bitrate;
    private Quality quality;
    public BitrateController(Quality quality) {
        this.quality = quality;
        switch (quality) {
            case LOW:
                bitrate = 128;
                break;
            case HIGH:
                bitrate = 512;
                break;
            case SUPER_HIGH:
                bitrate = 1024;
                break;
            default:
                bitrate = 256;
                break;
        }
    }

    public int getBitrate() {
        return bitrate;
    }

    public Quality getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "BitrateController{" +
                "bitrate=" + bitrate +
                '}';
    }
}
