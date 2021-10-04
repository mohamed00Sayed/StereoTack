package xmlconf.com.sayed.stereo.soundsys;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new BrownDisc();
  }
  
  @Bean
  public CDPlayer cdPlayer() {
    return new CDPlayer(compactDisc());
  }

}
