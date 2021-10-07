package xmlconf.com.sayed.stereo.soundsys;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
