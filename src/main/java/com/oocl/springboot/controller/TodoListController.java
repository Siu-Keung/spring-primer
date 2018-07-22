package com.oocl.springboot.controller;

import com.oocl.springboot.model.Item;
import com.oocl.springboot.model.TodoDataModel;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dylan Wei
 * @date 2018-07-22 13:57
 */

@RestController
public class TodoListController {
    @Autowired
    private TodoDataModel datas;

    @RequestMapping(value = "/getItems/{filter}")
    public List<Item> getItemsByFilter(@PathVariable("filter") String filter, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        switch (filter) {
            case "全部":
                return this.datas.getItems();
            case "未完成":
                return this.datas.getItems().stream().filter(item -> !item.isChecked()).collect(Collectors.toList());
            case "已完成":
                return this.datas.getItems().stream().filter(item -> item.isChecked()).collect(Collectors.toList());
            default:
                return this.datas.getItems();
        }
    }

}
