package mixed.com.sayed.stereo.soundsys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import auto.com.sayed.stereo.soundsys.BrownDisc;
import auto.com.sayed.stereo.soundsys.CompactDisc;

@Configuration
public class CDConfig {
  @Bean
  public CompactDisc compactDisc() {
    return new BrownDisc();
  }
}