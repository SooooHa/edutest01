package com.xuecheng.testfreemarker.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Map;
@RequestMapping("/freemarker")
@Controller
public class FreemarkerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/test2")
    public String freemarker(Map<String, Object> map){
        map.put("name","Wrold");
//返回模板文件名称
        return "test1";
    }

    @RequestMapping("/banner")
    public String banner(Map<String,Object> map){
        // 请求轮播图数据
        ResponseEntity<Map> entity = restTemplate.getForEntity("http://localhost:31001/cms/config/getmodel/5a791725dd573c3574ee333f", Map.class);
        Map body = entity.getBody();

        // 设置数据
        map.putAll(body);
        return "index_banner";
    }
}