package com.xuecheng.manageCms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/10/2019
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {

}
