package designpattern.behaviourdesionPattern.iterator.Good_Code;

import designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators.FavoritesPlaylistIterator;
import designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators.ShuffledPlaylistIterator;
import designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators.SimplePlaylistIterator;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<String> songs;
    public PlayList() {
        songs = new ArrayList<>();
    }
    public void addSong(String song) {
        songs.add(song);
    }
    public PlaylistIterator iterator(String type) {
        switch (type) {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            case "favorites":
                return new FavoritesPlaylistIterator(this);
            default:
                return null;
        }
    }
    public ArrayList<String> getSongs() {
        return songs;
    }
}
