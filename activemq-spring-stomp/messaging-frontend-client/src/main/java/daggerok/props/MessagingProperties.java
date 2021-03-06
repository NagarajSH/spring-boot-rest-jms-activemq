package daggerok.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "messaging")
public class MessagingProperties {

  /**
   * Messaging server
   */
  Service service;

  @Data
  public static class Service {

    /**
     * Messaging service schema
     */
    String schema;

    /**
     * Messaging service host
     */
    String host;

    /**
     * Messaging service port
     */
    Integer port;

    /**
     * Messaging service url
     */
    String url;

    /**
     * Messaging service STOMP
     */
    Stomp stomp;
  }

  @Data
  public static class Stomp {

    /**
     * Messaging service STOMP application endpoint
     */
    String endpoint;

    /**
     * Messaging service STOMP application send message path
     */
    String sendPath;

    /**
     * Messaging service STOMP application subscription identifier
     */
    String subscription;
  }
}
