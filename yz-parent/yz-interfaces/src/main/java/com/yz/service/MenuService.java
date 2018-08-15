package com.yz.service;

import com.baomidou.mybatisplus.service.IService;
import com.yz.common.entity.MenuEntity;

import java.awt.*;
import java.util.List;
import java.util.Map;

/**
 * @author xiechaofeng
 * @date 2018/7/24 15:28
 * @desc
 */
public interface MenuService extends IService<MenuEntity>
{


    List<MenuEntity> getMenuList();
}