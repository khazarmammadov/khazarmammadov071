package lesson6;

public class Player {
    public static void main(String[] args) {
        JazzMusicPlayer js = new JazzMusicPlayer();
        ClassicalMusicPlayer cl = new ClassicalMusicPlayer();

        js.play();
        cl.play();
    }
}
