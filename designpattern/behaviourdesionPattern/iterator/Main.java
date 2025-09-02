package designpattern.behaviourdesionPattern.iterator;

import designpattern.behaviourdesionPattern.iterator.Bad_Code.Playlist;
import designpattern.behaviourdesionPattern.iterator.Good_Code.PlayList;
import designpattern.behaviourdesionPattern.iterator.Good_Code.PlaylistIterator;

public class Main {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();
        playlist.addSong("Song 1 Fav");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4 Fav");
        playlist.addSong("son5 Fav");
        playlist.addSong("song6");

        System.out.println("Simple playlist:");
        PlaylistIterator iterator = playlist.iterator("simple");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Shuffled playlist:");
        iterator = playlist.iterator("shuffled");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Favorites playlist:");
        iterator = playlist.iterator("favorites");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
