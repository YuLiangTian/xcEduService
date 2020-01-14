package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 2019/12/6.
 * User: tianyuliang    896880987@qq.com
 * Date: 2019/12/6
 * Time: 16:46
 * Version: xcEduService01 1.0.0.0
 * [功能描述].
 */


public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {

}
