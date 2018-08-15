package com.yz.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sun.xml.internal.ws.api.Component;
import com.yz.common.entity.ComponentEntity;
import com.yz.common.entity.MenuEntity;
import com.yz.dao.ComponentDao;
import com.yz.dao.MenuDao;
import com.yz.service.ComponentService;
import com.yz.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author xiechaofeng
 * @date 2018/7/25 14:10
 * @desc
 */
@Service("componentService")
public class ComponentServiceImpl extends ServiceImpl<ComponentDao, ComponentEntity> implements ComponentService
{
    @Override
    public ComponentEntity getInfo(Integer menuId)
    {
        ComponentEntity componentEntity = selectOne(new EntityWrapper<ComponentEntity>().eq("menu_id", menuId));
        return  componentEntity;
    }

    @Override
    public void update(ComponentEntity componentEntity)
    {
        System.out.println(1);
        this.baseMapper.updateById(componentEntity);
        System.out.println(2);
    }
}