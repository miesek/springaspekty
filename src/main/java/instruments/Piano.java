package instruments;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {

    public int play() {
        System.out.println("Piano is playing");
//        return "B dur";
        return 2;
    }
}
