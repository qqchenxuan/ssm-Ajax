package com.cx.serviceImpl;

import com.cx.mapper.MenuMapper;
import com.cx.pojo.Menu;
import com.cx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> show() {

        return menuMapper.selByPid(0);
    }

}
