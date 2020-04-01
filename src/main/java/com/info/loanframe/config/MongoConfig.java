package com.info.loanframe.config;

import com.mongodb.MongoClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
@ConfigurationProperties(prefix = "mongodb")
public class MongoConfig extends AbstractMongoConfiguration {

    private String host;
    private int port;
    private String database;

    public String getHost() {
        return host;
    }

    public MongoConfig setHost(String host) {
        System.out.println(host+"---------------");
        this.host = host;
        return this;
    }

    public int getPort() {
        return port;
    }

    public MongoConfig setPort(int port) {
        this.port = port;
        return this;
    }

    public MongoConfig setDatabase(String database) {
        this.database = database;
        return this;
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        System.out.println("host-------"+host);
        return new MongoClient(host,port);
    }

    @Override
    protected String getDatabaseName() {
        return this.database;
    }
}
