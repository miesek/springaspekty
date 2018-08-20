package instruments;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {

    public void play() {
        System.out.println("Piano is playing");
    }
}
