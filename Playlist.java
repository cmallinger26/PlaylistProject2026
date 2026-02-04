import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> songs;
    



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        songs = new ArrayList<Song>();
    }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void addSong(Song newSong) {
        songs.add(newSong);
    }
     public void printAllSongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i));
        }
    }
    public void printLikedSongs() {
        for (int i = 0; i < songs.size(); i++) {
            Song current = songs.get(i);

            if (current.getLiked() == true) {
                System.out.println(current);
            }
        }
    }
     public void likeSong(int position){
        if(position >= 0 && position < songs.size()){
            songs.get(position).like();
        }
    }
    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.remove(index);
        }
    }
         public String totalDuration() {

        int totalSeconds = 0;

        for (int i = 0; i < songs.size(); i++) {
            Song s = songs.get(i);

            int addedtime = s.getMinutes() * 60 + s.getSeconds();
            totalSeconds = totalSeconds + addedtime;
        }
        return ("Total Duration: " + totalSeconds);
    }
    public void removeUnlikedSongs() {
        for(int i = songs.size()-1; i>=0; i--){
            if(songs.get(i).getLiked() == false){
                songs.remove(i);
            }
        }
    }
}
