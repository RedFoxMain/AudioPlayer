import java.io.File;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class Song {
    private String path;
    private String artist;
    private String name;
    private String len_of_song;

    public Song(String path){
        this.path = path;
        try {
            AudioFile file = AudioFileIO.read(new File(path));
            Tag tag = file.getTag();
            if(tag != null){
                this.name = tag.getFirst(FieldKey.TITLE);
                this.artist = tag.getFirst(FieldKey.ARTIST);
            }else{
                this.name = "Unknown";
                this.artist = "Unknown";
            }
        }catch (Exception e){}
    }

    // Getters
    public String getPath() { return path; }
    public String getArtist() { return artist; }
    public String getName() { return name; }
    public String getLen_of_song() { return len_of_song; }
}
