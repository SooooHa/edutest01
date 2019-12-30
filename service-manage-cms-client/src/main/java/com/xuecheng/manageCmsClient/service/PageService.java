package com.xuecheng.manageCmsClient.service;

import com.xuecheng.framework.domain.cms.CmsPage;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/17/2019
 */
public interface PageService {
    /**
     * 接受消息之后,调用的方法
     * @param pageId
     */
    void savePageToServerPath(String pageId);


    CmsPage findCmsPageById(String pageId);
}
