package com.garfield.es.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * @author jingliyuan
 * @date 2020/12/24
 */
@Configuration
@ConfigurationProperties(prefix = "spring.elasticsearch.rest")
public class ElasticsearchConfig {
    private String uris;
    @Bean
    public RestHighLevelClient restHighLevelClient(){
        ClientConfiguration clientConfiguration = ClientConfiguration.builder().connectedTo(uris).build();
        return RestClients.create(clientConfiguration).rest();
    }
}
