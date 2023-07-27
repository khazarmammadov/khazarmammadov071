package lesson37.musicPlayer;

public class MusicPlayer {
    public static void main(String[] args) {
        OldMusicPlayer mp3 = new OldMusicPlayer();
        INewMusic newMP3 = new MusicAdapter(mp3);

        System.out.println(newMP3.playMusic());
    }
}
