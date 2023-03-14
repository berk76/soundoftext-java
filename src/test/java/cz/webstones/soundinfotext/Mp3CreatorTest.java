package cz.webstones.soundinfotext;

import cz.webstones.soundoftext.Mp3Creator;
import cz.webstones.soundoftext.Mp3CreatorException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Mp3CreatorTest {
    @Test
    @DisplayName("Setup")
    public void testCreateMp3() throws Mp3CreatorException {
        Mp3Creator.createMp3("Hello World!", "en-GB", "hello_world.mp3");
    }
}
