/**
 * @author hanbo
 * @date 2018/9/19 19:55
 */

package com.jys.jyplus.wiki.vo;

import java.sql.Timestamp;

public class WikiVo {
    private Integer wikiId;
    private String wikiTitle;
    private String wikiTags;
    private Timestamp wikiCreateTime;
    private Timestamp wikiLastEditTime;
    private Boolean wikiHidden;
    private String wikiExcerpt;
    private String wikiContent;

    public Integer getWikiId() {
        return wikiId;
    }

    public void setWikiId(Integer wikiId) {
        this.wikiId = wikiId;
    }

    public String getWikiTitle() {
        return wikiTitle;
    }

    public void setWikiTitle(String wikiTitle) {
        this.wikiTitle = wikiTitle;
    }

    public String getWikiTags() {
        return wikiTags;
    }

    public void setWikiTags(String wikiTags) {
        this.wikiTags = wikiTags;
    }

    public Timestamp getWikiCreateTime() {
        return wikiCreateTime;
    }

    public void setWikiCreateTime(Timestamp wikiCreateTime) {
        this.wikiCreateTime = wikiCreateTime;
    }

    public Timestamp getWikiLastEditTime() {
        return wikiLastEditTime;
    }

    public void setWikiLastEditTime(Timestamp wikiLastEditTime) {
        this.wikiLastEditTime = wikiLastEditTime;
    }

    public Boolean getWikiHidden() {
        return wikiHidden;
    }

    public void setWikiHidden(Boolean wikiHidden) {
        this.wikiHidden = wikiHidden;
    }

    public String getWikiExcerpt() {
        return wikiExcerpt;
    }

    public void setWikiExcerpt(String wikiExcerpt) {
        this.wikiExcerpt = wikiExcerpt;
    }

    public String getWikiContent() {
        return wikiContent;
    }

    public void setWikiContent(String wikiContent) {
        this.wikiContent = wikiContent;
    }
}
