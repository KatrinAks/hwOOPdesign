import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void countRadioTest() {
        Radio stat = new Radio(12);

        stat.setLimitStation(11);

        int expected = 11;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maxRadioTest() {
        Radio stat = new Radio();
    }

    @Test
    public void shouldGetStation() {
        Radio stat = new Radio();

        stat.setLimitStation(6);

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationNotMore() {
        Radio stat = new Radio();

        stat.setLimitStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNotLess() {
        Radio stat = new Radio();

        stat.setLimitStation(-1);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation() {
        Radio stat = new Radio();

        stat.setLimitStation(5);

        int expected = 6;
        int actual = stat.getNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreNextStation() {
        Radio stat = new Radio();

        stat.setLimitStation(9);

        int expected = 0;
        int actual = stat.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldLessPrevStation() {
        Radio stat = new Radio();

        stat.setLimitStation(0);

        int expected = 9;
        int actual = stat.getPrevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio stat = new Radio();

        stat.setLimitStation(4);

        int expected = 3;
        int actual = stat.getPrevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolume() {
        Radio stat = new Radio();

        stat.setLimitVolume(56);

        int expected = 56;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeNotMoreLimit() {
        Radio stat = new Radio();

        stat.setLimitVolume(101);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeNotLessLimit() {
        Radio stat = new Radio();

        stat.setLimitVolume(-1);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio stat = new Radio();

        stat.setLimitVolume(68);

        int expected = 69;
        int actual = stat.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMoreVolume() {
        Radio stat = new Radio();

        stat.setLimitVolume(100);

        int expected = 100;
        int actual = stat.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio stat = new Radio();

        stat.setLimitVolume(68);

        int expected = 67;
        int actual = stat.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceLessVolume() {
        Radio stat = new Radio();

        stat.setLimitVolume(0);

        int expected = 0;
        int actual = stat.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}
