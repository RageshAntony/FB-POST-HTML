
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
    "media",
    "target",
    "type",
    "url"
})
public class Attachment_ implements Serializable
{

    @JsonProperty("media")
    private Media_ media;
    @JsonProperty("target")
    private Target_ target;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
    private final static long serialVersionUID = 5719514352416055961L;

    @JsonProperty("media")
    public Media_ getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media_ media) {
        this.media = media;
    }

    @JsonProperty("target")
    public Target_ getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target_ target) {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("media", media).append("target", target).append("type", type).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(target).append(type).append(media).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attachment_) == false) {
            return false;
        }
        Attachment_ rhs = ((Attachment_) other);
        return new EqualsBuilder().append(target, rhs.target).append(type, rhs.type).append(media, rhs.media).append(url, rhs.url).isEquals();
    }

}
