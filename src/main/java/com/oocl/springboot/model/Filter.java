package com.oocl.springboot.model;

/**
 * @author Dylan Wei
 * @date 2018-07-22 14:05
 */
public class Filter {
    private String tittle;
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getTittle() {

        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Filter(String tittle, boolean selected) {

        this.tittle = tittle;
        this.selected = selected;
    }
}
