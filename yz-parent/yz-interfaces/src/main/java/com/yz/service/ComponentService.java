package com.yz.service;

import com.baomidou.mybatisplus.service.IService;
import com.yz.common.entity.ComponentEntity;

/**
 * @author xiechaofeng
 * @date 2018/7/25 14:10
 * @desc
 */
public interface ComponentService extends IService<ComponentEntity>
{
    ComponentEntity getInfo(Integer menuId);

    void update(ComponentEntity componentEntity);
}
