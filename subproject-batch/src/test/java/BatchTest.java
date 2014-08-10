import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class BatchTest {
  private final Config config = ConfigFactory.load("batch-config.conf");

  @Test
  public void test() {
    String value = config.getString("value");
    assertThat(value, is("main"));
  }

}
