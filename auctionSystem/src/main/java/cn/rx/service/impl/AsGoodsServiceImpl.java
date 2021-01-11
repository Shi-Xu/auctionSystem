package cn.rx.service.impl;

import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.dao.mapper.AsGoodsDOMapper;
import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import cn.rx.service.AsGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AsGoodsService实现
* Created by ranxu on 2021/1/11.
*/
@Service
@Transactional
@BaseService
public class AsGoodsServiceImpl extends BaseServiceImpl<AsGoodsDOMapper, AsGoodsDO, AsGoodsDOExample> implements AsGoodsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsGoodsServiceImpl.class);

    @Autowired
    AsGoodsDOMapper asGoodsDOMapper;

}