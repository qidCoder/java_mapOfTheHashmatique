// To demonstrate to the band how it would work, use a HashMap with the track titles as keys and some sample lyrics as the values. Add at least 4 songs to your trackList HashMap and then pull one out by its name. They also want to be able to see all the tracks with the lyrics immediately following them.

import java.util.HashMap;
import java.util.Set;

public class Soundtrack{
    public static void main(String[] args){
        //Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();

        //Add in at least 4 songs that are stored by title
        //key (track title) ,  value(lyrics)
        trackList.put("Yellow", "Look at the stars Look how they shine for you And everything you do Yeah, they were all yellow");
        trackList.put("Clocks", "The lights go out and I can't be saved Tides that I tried to swim against Have brought me down upon my knees Oh I beg, I beg and plead, singing");
        trackList.put("Princess Of China", "Once upon a time somebody ran Somebody ran away saying fast as I can I got to go, I got to go!");
        trackList.put("A Sky Full Of Stars", "I don't care, go on and tear me apart I don't care if you do, ooh");

    //Pull out one of the songs by its track title
    String getOne = trackList.get("Clocks");
    System.out.println(getOne);

    //Print out all the track names and lyrics in the format Track: Lyrics
    Set<String> keys = trackList.keySet();

    for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
    }

    }
}