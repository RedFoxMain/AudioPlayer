import java.util.ArrayList;

public class SongPlayer {
    private ArrayList<Song> played_song;
    private Song current_song;

    private void playSong(){

    }

    public void loadSong(Song song){
        if(song == null){ return; }
        else{ current_song = song; playSong(); }
    }
}