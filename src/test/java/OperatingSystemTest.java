import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperatingSystemTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void onWindowsTest(){
        System.out.println("Run this on windows");
        assertTrue(true);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void onWindowsOrLinuxTest() {
        System.out.println("Enabled on Windows or Linux");
        assertTrue(true);
    }

    /**
     * gets automatically disabled on Windows machine
     */
    @Test
    @EnabledOnOs(OS.LINUX)
    void onLinuxMatch() {
        System.out.println("Enabled on Linux machine");
        assertTrue(true);
    }
}
