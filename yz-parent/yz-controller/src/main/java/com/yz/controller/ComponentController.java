package com.yz.controller;

import com.yz.common.entity.ComponentEntity;
import com.yz.common.utils.R;
import com.yz.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author xiechaofeng
 * @date 2018/7/25 14:08
 * @desc
 */
@RestController
@RequestMapping("component")
public class ComponentController
{
    @Autowired
    private ComponentService componentService;

    @RequestMapping("/info")
    public R getInfo(@RequestBody ComponentEntity componentEntity){
      ComponentEntity component= componentService.getInfo(componentEntity.getMenuId());
      return R.ok().put("component",component);
    }

    @RequestMapping("/update")
    public R update(@RequestBody ComponentEntity componentEntity){
        componentEntity.setModifyTime(new Date());
        componentService.update(componentEntity);
        return R.ok();
    }
}
