import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            Song newSong = new Song(songTitle, duration);
            this.songs.add(newSong);
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if ((trackNumber > 0) && (trackNumber <= this.songs.size())) {
            playList.add(this.songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        if (findSong(songTitle) != null) {
            playList.add(findSong(songTitle));
            return true;
        }
        return false;
    }


}