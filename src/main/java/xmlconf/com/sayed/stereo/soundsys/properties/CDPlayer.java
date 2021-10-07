package xmlconf.com.sayed.stereo.soundsys.properties;
import xmlconf.com.sayed.stereo.soundsys.CompactDisc;
import xmlconf.com.sayed.stereo.soundsys.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
