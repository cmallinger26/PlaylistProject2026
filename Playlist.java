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
public void examine(){
    for(Song s : songs){
        System.out.println(s.toString());
    }
}
public void examineLiked(){
    for(Song s: songs){
        if(s.getLiked()){
            System.out.println(s.toString());
        }
    }
}

    public void likeSong(){
        liked = true;
    }
    public void dislikeSong(){
        liked = false;
    }
    public int totalDuration(){
        int totalDuration = 0;
        for (Song s : songs){
            totalDuration += s.getMinutes; 
        } 
    } 
}
