package instruments;

import org.springframework.stereotype.Component;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

@Component
public class Guitar implements Instrument {

    public int play() {
        System.out.println("Guitar is playing");
//        throw new InternalException("curtain down");
//        return "C dur";
        return 1;
    }
}
