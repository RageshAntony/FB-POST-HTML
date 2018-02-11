
package com.JSON2POJO;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "media",
    "target",
    "type",
    "url",
    "title",
    "subattachments"
})
public class Datum_______ implements Serializable
{

    @JsonProperty("description")
    private String description;
    @JsonProperty("media")
    private Media__ media;
    @JsonProperty("target")
    private Target__ target;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subattachments")
    private Subattachments subattachments;
    private final static long serialVersionUID = 796651988509516280L;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("media")
    public Media__ getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media__ media) {
        this.media = media;
    }

    @JsonProperty("target")
    public Target__ getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target__ target) {
        this.target = target;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subattachments")
    public Subattachments getSubattachments() {
        return subattachments;
    }

    @JsonProperty("subattachments")
    public void setSubattachments(Subattachments subattachments) {
        this.subattachments = subattachments;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("media", media).append("target", target).append("type", type).append("url", url).append("title", title).append("subattachments", subattachments).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(description).append(target).append(type).append(media).append(subattachments).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum_______) == false) {
            return false;
        }
        Datum_______ rhs = ((Datum_______) other);
        return new EqualsBuilder().append(title, rhs.title).append(description, rhs.description).append(target, rhs.target).append(type, rhs.type).append(media, rhs.media).append(subattachments, rhs.subattachments).append(url, rhs.url).isEquals();
    }

}
