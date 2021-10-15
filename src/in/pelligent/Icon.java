package in.pelligent;

public class Icon {
    private String bitmap;
    private String uri;

    public Icon(String bitmap, String uri) {
        this.bitmap = bitmap;
        this.uri = uri;
    }

    public String getBitmap() {
        return bitmap;
    }

    public String getUri() {
        return uri;
    }
}
