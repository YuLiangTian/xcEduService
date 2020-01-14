package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 2019/12/11.
 * User: tianyuliang    896880987@qq.com
 * Date: 2019/12/11
 * Time: 9:58
 * Version: xcEduService01 1.0.0.0
 * [功能描述].
 */


public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {

}
