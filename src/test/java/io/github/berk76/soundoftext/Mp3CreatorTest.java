package io.github.berk76.soundoftext;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Mp3CreatorTest {
    @Test
    @DisplayName("Setup")
    public void testCreateMp3() throws Mp3CreatorException {
        Mp3Creator.createMp3("Hello World!", "en-GB", "target/hello_world.mp3");
    }
}
