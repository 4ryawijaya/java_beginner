import java.util.ArrayList;
import java.util.Collections;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Seek and Destroy");
    desertIslandPlaylist.add("Angin");
    desertIslandPlaylist.add("In Waves");
    desertIslandPlaylist.add("Ular");
    desertIslandPlaylist.add("True");
    desertIslandPlaylist.add("Breakdance-remix");

    desertIslandPlaylist.remove("True");

    //SWAP SONG USING INDEX
    int songSeek = desertIslandPlaylist.indexOf("Seek and Destroy");
    int songBreak = desertIslandPlaylist.indexOf("Breakdance-remix");

    String tempA = "Seek and Destroy";
    String tempB = "Breakdance-remix";

    desertIslandPlaylist.set(songSeek, tempB);
    desertIslandPlaylist.set(songBreak, tempA);

    System.out.println(desertIslandPlaylist);

    //REVERSE THE PLAYLIST
    Collections.reverse(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist);
    //System.out.println(desertIslandPlaylist.size());

  }
  
}
