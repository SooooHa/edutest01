package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.Teachplan;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 2019/12/18
 */
@Api(value = "课程管理接口",description = "课程管理接口,提供页面的CRUD")
public interface CourseControllerApi  {
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);
    @ApiOperation("test")
    public ResponseResult addTeachplan2(Teachplan teachplan);
}
