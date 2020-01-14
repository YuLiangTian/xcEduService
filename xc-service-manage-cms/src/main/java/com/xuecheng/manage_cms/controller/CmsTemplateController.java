package com.xuecheng.manage_cms.controller;

import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 2019/12/6.
 * User: tianyuliang    896880987@qq.com
 * Date: 2019/12/6
 * Time: 16:54
 * Version: xcEduService01 1.0.0.0
 * [功能描述].
 */

@RestController
@RequestMapping("/cms/template")
public class CmsTemplateController {

    @Autowired
    private TemplateService templateService;

    @RequestMapping("/list")
    public QueryResponseResult findAll(){
        return templateService.findAll();
    }
}
