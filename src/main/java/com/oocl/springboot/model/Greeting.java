package com.oocl.springboot.model;

/**
 * @author Dylan Wei
 * @date 2018-07-22 12:54
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}