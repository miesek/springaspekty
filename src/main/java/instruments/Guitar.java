package instruments;

import javax.inject.Named;

@Named
public class Guitar implements Instrument {

    public void play() {
        System.out.println("Guitar is playing");
    }
}
