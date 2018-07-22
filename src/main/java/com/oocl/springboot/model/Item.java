package com.oocl.springboot.model;

/**
 * @author Dylan Wei
 * @date 2018-07-22 14:04
 */
public class Item {
    private String id;
    private String content;
    private boolean checked;

    public Item(String id, String content, boolean checked) {
        this.id = id;
        this.content = content;
        this.checked = checked;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
