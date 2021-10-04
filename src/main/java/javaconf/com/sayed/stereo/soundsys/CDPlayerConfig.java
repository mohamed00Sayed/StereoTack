package javaconf.com.sayed.stereo.soundsys;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import auto.com.sayed.stereo.soundsys.BrownDisc;
import auto.com.sayed.stereo.soundsys.CDPlayer;
import auto.com.sayed.stereo.soundsys.CompactDisc;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new BrownDisc();
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
