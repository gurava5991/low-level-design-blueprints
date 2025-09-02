package designpattern.behaviourdesionPattern.iterator.Good_Code.Concreate_Iterators;

import designpattern.behaviourdesionPattern.iterator.Good_Code.PlayList;
import designpattern.behaviourdesionPattern.iterator.Good_Code.PlaylistIterator;


public class FavoritesPlaylistIterator implements PlaylistIterator {
    private PlayList playlist;
    private int index;

    public FavoritesPlaylistIterator( PlayList playlist) {
        this.index = index;
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        // Only return the next song if it's marked as a favorite
        while (index < playlist.getSongs().size()) {
            if (playlist.getSongs().get(index).contains(
                    "Fav")) { // Mark favorites with 'Fav' in name
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}
