package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by User on 2019/12/6.
 * User: tianyuliang    896880987@qq.com
 * Date: 2019/12/6
 * Time: 16:48
 * Version: xcEduService01 1.0.0.0
 * [功能描述].
 */

@Service
public class SiteService {

    @Autowired
    CmsSiteRepository cmsSiteRepository;

    public QueryResponseResult findAll(){
        List<CmsSite> sites = cmsSiteRepository.findAll();
        QueryResult queryResult = new QueryResult();
        queryResult.setList(sites);
        queryResult.setTotal(sites.size());
        return new QueryResponseResult(CommonCode.SUCCESS,queryResult);
    }
}
