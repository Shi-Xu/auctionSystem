package cn.rx.service.impl;

import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import cn.rx.service.AsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AsUserService实现
* Created by ranxu on 2021/1/11.
*/
@Service
@Transactional
@BaseService
public class AsUserServiceImpl extends BaseServiceImpl<AsUserDOMapper, AsUserDO, AsUserDOExample> implements AsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsUserServiceImpl.class);

    @Autowired
    AsUserDOMapper asUserDOMapper;

}