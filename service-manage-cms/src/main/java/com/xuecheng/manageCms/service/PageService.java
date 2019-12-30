package com.xuecheng.manageCms.service;

import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;

import java.util.Map;


/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/1/2019
 */

public interface PageService {
    /**
     * 查询网页列表
     * @param page 页码
     * @param size 大小
     * @param queryPageRequest 参数
     * @return
     */
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

    /**
     * 新增页面
     * @param cmsPage 页面属性
     * @return
     */
    CmsPageResult add(CmsPage cmsPage);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    CmsPage findPageById(String id);


    /**
     * 修改页面
     * @param id
     * @param cmsPage
     * @return
     */
    CmsPageResult update(String id,CmsPage cmsPage);


    /**
     * 删除页面
     * @param id
     * @return
     */
    ResponseResult delete(String id);

    /**
     * 根据id查询cmsConfig
     * @return
     */
    CmsConfig getConfigById(String id);


    /**
     * 页面静态化
     * @param pageId
     * @return
     */
    String getPageHtml(String pageId);


    // 生产方 页面发布
    ResponseResult post(String pageId);

    // 保存页面
    CmsPage saveHtml(String pageId,String htmlContent);





}
