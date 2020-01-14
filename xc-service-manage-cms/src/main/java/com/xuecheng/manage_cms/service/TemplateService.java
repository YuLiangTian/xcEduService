package com.xuecheng.manage_cms.service;


import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by User on 2019/12/11.
 * User: tianyuliang    896880987@qq.com
 * Date: 2019/12/11
 * Time: 8:35
 * Version: xcEduService01 1.0.0.0
 * [功能描述]. 模板
 */

@Service
public class TemplateService{

    @Autowired
    private CmsTemplateRepository cmsTemplateRepository;

    public QueryResponseResult findAll(){
        List<CmsTemplate> cmsTemplates =  cmsTemplateRepository.findAll();
        QueryResult queryResult = new QueryResult();
        queryResult.setTotal(cmsTemplates.size());
        queryResult.setList(cmsTemplates);
        return new QueryResponseResult(CommonCode.SUCCESS,queryResult);
    }
}
