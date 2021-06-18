package misc;

import paths.Audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.util.Objects;

public class AudioPlayer {

    private final Audio audio = new Audio();
    Clip winClip = AudioSystem.getClip();

    public AudioPlayer() throws LineUnavailableException {
    }


    private void play(String melody) {

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Objects.requireNonNull(getClass().getClassLoader().getResource(melody)));
            clip.open(audioInputStream);
            clip.start();
            // If you want the sound to loop infinitely, then put: clip.loop(Clip.LOOP_CONTINUOUSLY);
            // If you want to stop the sound, then use clip.stop();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void playJackpot() {

        play(audio.JACKPOT);
    }

    public void playRoll() {


        play(audio.PLAY);
    }

    public void playWin() {


        play(audio.WIN);

    }

    public void playLittleWin() {

        play(audio.LITTLE_WIN);



    }

    public void playClick() {


        play(audio.CLICK);
    }
}
