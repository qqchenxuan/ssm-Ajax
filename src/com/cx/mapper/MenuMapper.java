package com.cx.mapper;

import com.cx.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pid);

}
