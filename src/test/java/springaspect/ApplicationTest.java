package springaspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.AppConfig;
import instruments.Instrument;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ApplicationTest {

    @Autowired
    @Qualifier("guitar")
    private Instrument guitar2;

    @Autowired
//    @Qualifier("piano")
    private Instrument piano;

    @Test
    public void shouldGuitarPlay() throws Exception {
        guitar2.play();
    }

    @Test
    public void shouldianoPlay() throws Exception {
        piano.play();
    }

}
