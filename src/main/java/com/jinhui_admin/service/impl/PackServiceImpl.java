package com.jinhui_admin.service.impl;

import com.jinhui.mapper.PackMapper;
import com.jinhui.po.Pack;
import com.jinhui.po.PackExample;
import com.jinhui.vo.Result;
import com.jinhui_admin.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zong on 2017/4/20.
 */
@Service
public class PackServiceImpl implements PackService{
    @Autowired
    private PackMapper packMapper;
    @Override
    public Result addPack(Pack pack) {
        PackExample packExample=new PackExample();
        int row=packMapper.insertSelective(pack);
        if(row>0){
            return Result.ok();
        }
        return Result.build(200,"添加新套餐错误",null);
    }
}
