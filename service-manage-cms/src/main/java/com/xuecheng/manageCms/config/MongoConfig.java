package com.xuecheng.manageCms.config;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/10/2019
 */
@Configuration
public class MongoConfig {
    // 从配置文件读取数据  下载流使用
    @Value("${spring.data.mongodb.database}")
    String db;

   @Bean
    public GridFSBucket getGridFSBucket(MongoClient mongoClient){
        MongoDatabase database = mongoClient.getDatabase(db);
        GridFSBucket bucket = GridFSBuckets.create(database);
        return bucket;
    }


}
