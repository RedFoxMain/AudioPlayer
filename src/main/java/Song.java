import java.io.File;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class Song {
    private String path;
    private String artist;
    private String name;
    private int len_of_song;

    public Song(String path) {
        this.path = (path.isEmpty())? "null" : path;
        this.name = "Unknown";
        this.artist = "Unknown";
        this.len_of_song = 0;

        try {
            AudioFile file = AudioFileIO.read(new File(path));
            Tag tag = file.getTag();
            if (tag != null) {
                this.name = tag.getFirst(FieldKey.TITLE);
                this.artist = tag.getFirst(FieldKey.ARTIST);
            }
        } catch (Exception e) {
            System.out.println("Cannot load song! Path: " + this.path);
        }
    }

    // Getters
    public String getPath() {
        return this.path;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }

    public int getLen_of_song() {
        return this.len_of_song;
    }
}
