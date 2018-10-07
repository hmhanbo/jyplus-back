/**
 * @author hanbo
 * @date 2018/9/19 19:55
 */

package com.jys.jyplus.wiki.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class WikiVo {
    @JsonProperty("id")
    private Integer wikiId;

    @JsonProperty("title")
    private String wikiTitle;

    @JsonProperty("beginTime")
    private Timestamp wikiCreateTime;

    @JsonProperty("updateTime")
    private Timestamp wikiUpdateTime;

    @JsonProperty("content")
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

    public Timestamp getWikiCreateTime() {
        return wikiCreateTime;
    }

    public void setWikiCreateTime(Timestamp wikiCreateTime) {
        this.wikiCreateTime = wikiCreateTime;
    }

    public Timestamp getWikiUpdateTime() {
        return wikiUpdateTime;
    }

    public void setWikiUpdateTime(Timestamp wikiUpdateTime) {
        this.wikiUpdateTime = wikiUpdateTime;
    }

    public String getWikiContent() {
        return wikiContent;
    }

    public void setWikiContent(String wikiContent) {
        this.wikiContent = wikiContent;
    }
}
