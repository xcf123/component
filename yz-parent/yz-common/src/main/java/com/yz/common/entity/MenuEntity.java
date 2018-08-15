package com.yz.common.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;
import java.util.List;

/**
 * @author xiechaofeng
 * @date 2018/7/24 15:38
 * @desc
 */
@TableName("tb_menu")
public class MenuEntity
{
    /**
     * 主键
     */
    @TableId
    private Integer id;

    private Integer type;
    private String name;
    private String url;
    private Date createTime;
    private Date modifyTime;
    @TableField(exist = false)
    private List<MenuEntity> componentList;

    public List<MenuEntity> getComponentList()
    {
        return componentList;
    }

    public void setComponentList(List<MenuEntity> componentList)
    {
        this.componentList = componentList;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getModifyTime()
    {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime)
    {
        this.modifyTime = modifyTime;
    }
}
