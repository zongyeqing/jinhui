package com.jinhui_admin.controller;

import com.jinhui.po.Pack;
import com.jinhui.vo.EUDataGridResult;
import com.jinhui.vo.Result;
import com.jinhui_admin.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zong on 2017/4/20.
 */
@Controller
@RequestMapping("/pack")
public class PackController {

    @Autowired
    private PackService packService;
    @RequestMapping("/add")
    public Result addPack(Pack pack){
        return packService.addPack(pack);
    }

    @RequestMapping("/list")
    public EUDataGridResult findAllPack(Integer page, Integer rows){
        return packService.findALlPack(page,rows);
    }
}