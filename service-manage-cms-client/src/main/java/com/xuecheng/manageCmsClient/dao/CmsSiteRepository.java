package com.xuecheng.manageCmsClient.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/17/2019
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {

}
