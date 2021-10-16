package in.pelligent;

import java.util.Objects;

// Singleton Design Pattern
public class Speaker {
    private AudioSource src;
    private boolean active;
    private static Speaker instance;

    private Speaker() {
        System.out.println("Initialising speaker");
    }

    public static Speaker getInstance() {
        if (instance == null)
            instance = new Speaker();

        return instance;
    }

    private void setSrc(AudioSource src) {
        if (this.src == null || !this.src.getSrcName().equals(src.getSrcName())) {
            System.out.printf("Updated audio src to %s\n", src.toString());
            this.src = src;
        }
    }

    public void play(AudioSource src) {
//        Implement a system to change src only if different.
        setSrc(src);
        pause(this.src);
        System.out.printf("Playing from %s\n", src.toString());
        active = true;
    }

    public void pause(AudioSource src) {
        if (active)
                System.out.printf("Pausing from %s\n", src.toString());
        else
            System.out.println("Fresh playback");
    }
}
