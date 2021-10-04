package auto.com.sayed.stereo.soundsys;
import org.springframework.stereotype.Component;

@Component
public class BrownDisc implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
