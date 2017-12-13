package com.social;

import javax.persistence.*;

/**
 * Created by uengine on 2017. 10. 13..
 */
@Entity
public class Posting {

    @Id
    @GeneratedValue
    String id;

    String previewUrl;
    String title;
    String content;
    String type;
    Object extendedContent;

    /**
     * -- typed json ----
     *
     *      {
     *          aaa: 'aaa'
     *          bbb: 'bbb'
     *          _type: 'com.abc.Person'
     *      }
     *
     *
     */

    @ManyToOne
    @JoinColumn(name="parentId")
    Posting parentPosting;


    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    String detailUrl;


    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
