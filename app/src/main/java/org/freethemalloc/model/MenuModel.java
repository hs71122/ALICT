package org.freethemalloc.model;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 9/19/2015.
 */

/**
 * Menu model for the recycle view
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

    /**
     * Get the Header String
     * @return header-text
     */
    public String getHeader() {
        return header;
    }

    /**
     * set the head text
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * Get the tag text for the menu item
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     * Set the tag text for the menu item
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Get the title text
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title text
     * @param title String which need to be title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the image id
     * @return image - image id as string
     */
    public String getImage() {
        return image;
    }

    /**
     * Set the image id
     * @param image String id of the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Tag : "+this.tag+", Title : "+this.title+", Image : "+this.image;
    }
}
