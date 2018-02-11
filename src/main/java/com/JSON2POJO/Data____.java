
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
    "cache_key",
    "height",
    "url",
    "width",
    "is_silhouette"
})
public class Data____ implements Serializable
{

    @JsonProperty("cache_key")
    private String cacheKey;
    @JsonProperty("height")
    private Long height;
    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("is_silhouette")
    private Boolean isSilhouette;
    private final static long serialVersionUID = 3954484946691914201L;

    @JsonProperty("cache_key")
    public String getCacheKey() {
        return cacheKey;
    }

    @JsonProperty("cache_key")
    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    @JsonProperty("is_silhouette")
    public Boolean getIsSilhouette() {
        return isSilhouette;
    }

    @JsonProperty("is_silhouette")
    public void setIsSilhouette(Boolean isSilhouette) {
        this.isSilhouette = isSilhouette;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cacheKey", cacheKey).append("height", height).append("url", url).append("width", width).append("isSilhouette", isSilhouette).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cacheKey).append(height).append(width).append(isSilhouette).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data____) == false) {
            return false;
        }
        Data____ rhs = ((Data____) other);
        return new EqualsBuilder().append(cacheKey, rhs.cacheKey).append(height, rhs.height).append(width, rhs.width).append(isSilhouette, rhs.isSilhouette).append(url, rhs.url).isEquals();
    }

}
