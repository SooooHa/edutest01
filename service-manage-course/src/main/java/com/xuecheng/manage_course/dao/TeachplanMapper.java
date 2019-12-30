package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 2019/12/18
 */
@Mapper
public interface TeachplanMapper {

    /**
     * 课程计划查询 映射到自己编写的类中
     * @param courseId
     * @return
     */
    public TeachplanNode selectList(String courseId);
}
