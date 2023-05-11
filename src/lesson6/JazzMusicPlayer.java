package lesson6;

public class JazzMusicPlayer implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("Start music...");
    }

    @Override
    public void pause() {
        System.out.println("Pause music...");
    }

    @Override
    public void stop() {
        System.out.println("Stop music...");
    }

    void playJazzMusic() {
        play();
    }
}
