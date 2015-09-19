package org.freethemalloc.model;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 9/19/2015.
 */
public class MenuModel {
    private String title;
    private String header;
    private String tag;
    private String image;

    public MenuModel() {
    }

    public MenuModel(String title, String header, String tag, String image) {
        this.title = title;
        this.header = header;
        this.tag = tag;
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Tag : "+this.tag+", Title : "+this.title+", Image : "+this.image;
    }
}
