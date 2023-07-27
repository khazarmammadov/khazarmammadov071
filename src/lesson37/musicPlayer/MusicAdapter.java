package lesson37.musicPlayer;

public class MusicAdapter implements INewMusic{
    private IOldMusic OldMusic;

    public MusicAdapter(IOldMusic oldMusic) {
        this.OldMusic = oldMusic;
    }

    @Override
    public String playMusic() {
        return OldMusic.playMusic();
    }
}
