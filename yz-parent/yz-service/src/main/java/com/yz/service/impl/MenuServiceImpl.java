package com.yz.service.impl;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yz.common.entity.MenuEntity;
import com.yz.dao.MenuDao;
import com.yz.service.MenuService;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author xiechaofeng
 * @date 2018/7/24 15:28
 * @desc
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuEntity> implements MenuService {

    @Override
    public List<MenuEntity> getMenuList()
    {
        List<MenuEntity> list = selectList(new EntityWrapper<MenuEntity>().eq("type", 0));
        if(list!=null && list.size()!=0){
            for (MenuEntity menuEntity : list)
            {
                List<MenuEntity> selectList = selectList(new EntityWrapper<MenuEntity>().eq("type", menuEntity.getId()));
                menuEntity.setComponentList(selectList);
            }

            return list;
        }else{
            return Collections.EMPTY_LIST;
        }
    }
}