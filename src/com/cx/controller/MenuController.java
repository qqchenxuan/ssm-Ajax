package com.cx.controller;

import com.cx.mapper.MenuMapper;
import com.cx.pojo.Menu;
import com.cx.service.MenuService;
import com.cx.serviceImpl.MenuServiceImpl;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    private MenuService menuServiceImpl;

@RequestMapping("/show")
@ResponseBody
 public List<Menu> show(){
    System.out.println(menuServiceImpl.show());

    return menuServiceImpl.show();

}



}
