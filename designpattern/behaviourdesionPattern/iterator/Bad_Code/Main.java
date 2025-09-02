package designpattern.behaviourdesionPattern.iterator.Bad_Code;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.playPlaylist(false); // Play playlist in order
        playlist.playPlaylist(true); // Play playlist in random order
    }
}
