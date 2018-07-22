package com.oocl.springboot; /**
 * @author Dylan Wei
 * @date 2018-07-22 13:02
 */
import com.oocl.springboot.controller.GreetingController;
import com.oocl.springboot.model.Filter;
import com.oocl.springboot.model.Item;
import com.oocl.springboot.model.TodoDataModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public TodoDataModel datas(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("3123132", "做作业", false));
        items.add(new Item("3423424", "看电视", false));
        items.add(new Item("12342423", "玩游戏", true));
        items.add(new Item("13424242", "运动", false));
        List<Filter> allFilters = new ArrayList<>();
        allFilters.add(new Filter("全部", true));
        allFilters.add(new Filter("未完成", true));
        allFilters.add(new Filter("已完成", true));
        TodoDataModel datas = new TodoDataModel(items, allFilters);
        return datas;
    }


}
