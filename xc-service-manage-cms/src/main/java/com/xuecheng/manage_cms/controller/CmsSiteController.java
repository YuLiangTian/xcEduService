package com.xuecheng.manage_cms.controller;

import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.SiteService;
import io.swagger.annotations.ApiModelProperty;
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
@RequestMapping("/cms/site")
public class CmsSiteController {

    @Autowired
    private SiteService siteService;

    @RequestMapping("/list")
    public QueryResponseResult findAll(){
        return siteService.findAll();
    }
}
