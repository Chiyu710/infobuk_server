package com.louis.kitty.admin.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * article_text_raw
 * @author 
 */
public class ArticleTextRaw implements Serializable {
    private Integer id;

    private String url;

    private LocalDateTime date;

    private Integer ifabstract;

    private String summaryid;

    private String author;

    private String title;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getIfabstract() {
        return ifabstract;
    }

    public void setIfabstract(Integer ifabstract) {
        this.ifabstract = ifabstract;
    }

    public String getSummaryid() {
        return summaryid;
    }

    public void setSummaryid(String summaryid) {
        this.summaryid = summaryid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ArticleTextRaw other = (ArticleTextRaw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getIfabstract() == null ? other.getIfabstract() == null : this.getIfabstract().equals(other.getIfabstract()))
            && (this.getSummaryid() == null ? other.getSummaryid() == null : this.getSummaryid().equals(other.getSummaryid()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getIfabstract() == null) ? 0 : getIfabstract().hashCode());
        result = prime * result + ((getSummaryid() == null) ? 0 : getSummaryid().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", date=").append(date);
        sb.append(", ifabstract=").append(ifabstract);
        sb.append(", summaryid=").append(summaryid);
        sb.append(", author=").append(author);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}