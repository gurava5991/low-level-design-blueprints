package designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators;

import designpattern.behaviourdesionPattern.iterator.Good_Code.PlaylistIterator;
import designpattern.behaviourdesionPattern.iterator.Good_Code.PlayList;
public class SimplePlaylistIterator implements PlaylistIterator {
    private PlayList playlist;
    private int index;
    public SimplePlaylistIterator(PlayList playlist) {
        this.playlist = playlist;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}
