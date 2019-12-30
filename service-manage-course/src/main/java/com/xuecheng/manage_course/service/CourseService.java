package com.xuecheng.manage_course.service;

import com.xuecheng.framework.domain.course.Teachplan;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.ResponseResult;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 2019/12/19
 */
public interface CourseService {
    /**
     * 查询课程计划
     * @param courseId
     * @return
     */
    TeachplanNode findTeachplanList(String courseId);

    /**
     * 获取课程根结点，如果没有则添加根结点
     * @param courseId
     * @return
     */
    String getTeachplanRoot(String courseId);

    /**
     * 添加根节点
     * @param teachplan
     * @return
     */
    public ResponseResult addTeachplan(Teachplan teachplan);

}
