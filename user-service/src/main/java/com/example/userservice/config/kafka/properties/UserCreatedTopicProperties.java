package com.example.userservice.config.kafka.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "kafka.topics.user-created") //application.yml
@Getter
@Setter
public class UserCreatedTopicProperties {
    //Oluşturulan topic'in property'leri için bir class
    private String topicName;
    private int partitionCount;
    private short replicationFactor;
    private String retentionInMs;
}
