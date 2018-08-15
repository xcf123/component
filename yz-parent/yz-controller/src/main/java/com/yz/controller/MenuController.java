package com.yz.controller;

import com.yz.common.entity.MenuEntity;
import com.yz.common.utils.R;
import com.yz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;

/**
 * @author xiechaofeng
 * @date 2018/7/24 11:24
 * @desc
 */
@RestController
@RequestMapping("menu")
public class MenuController
{
    @Autowired
    private MenuService menuService;

    @RequestMapping("/menuList")
    public R getMenuList(){
        List<MenuEntity> menuList=menuService.getMenuList();
        //xxxxxxxxxxxxxxxxxxxxxxxxx
        return R.ok().put("menuList",menuList);
    }

    @RequestMapping("/addDetail")
    public R addDetail(@RequestBody MenuEntity menuEntity){
        menuEntity.setUrl("component.html");
        menuEntity.setCreateTime(new Date());
        menuEntity.setModifyTime(new Date());
        menuService.insert(menuEntity);
        return R.ok();
    }

}
