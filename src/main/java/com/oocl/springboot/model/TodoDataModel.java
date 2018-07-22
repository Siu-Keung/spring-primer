package com.oocl.springboot.model;

import java.util.List;

/**
 * @author Dylan Wei
 * @date 2018-07-22 14:03
 */
public class TodoDataModel {
    private List<Item> items;
    private List<Filter> allFilters;

    public TodoDataModel(List<Item> items, List<Filter> allFilters) {
        this.items = items;
        this.allFilters = allFilters;
    }

    public List<Item> getItems() {

        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Filter> getAllFilters() {
        return allFilters;
    }

    public void setAllFilters(List<Filter> allFilters) {
        this.allFilters = allFilters;
    }
}
