package designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators;


import designpattern.behaviourdesionPattern.iterator.Good_Code.PlayList;
import designpattern.behaviourdesionPattern.iterator.Good_Code.PlaylistIterator;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylistIterator implements PlaylistIterator {

    private PlayList playlist;
    private int index;
    private ArrayList<String> shuffledSongs;
    public ShuffledPlaylistIterator(PlayList playlist) {
        this.playlist = playlist;
        this.shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs); // Shuffle the songs randomly
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }
    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
