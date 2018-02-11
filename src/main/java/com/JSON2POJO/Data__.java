
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
    "height",
    "is_silhouette",
    "url",
    "width"
})
public class Data__ implements Serializable
{

    @JsonProperty("height")
    private Long height;
    @JsonProperty("is_silhouette")
    private Boolean isSilhouette;
    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private Long width;
    private final static long serialVersionUID = -63981605655184844L;

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("is_silhouette")
    public Boolean getIsSilhouette() {
        return isSilhouette;
    }

    @JsonProperty("is_silhouette")
    public void setIsSilhouette(Boolean isSilhouette) {
        this.isSilhouette = isSilhouette;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("height", height).append("isSilhouette", isSilhouette).append("url", url).append("width", width).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(height).append(width).append(isSilhouette).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data__) == false) {
            return false;
        }
        Data__ rhs = ((Data__) other);
        return new EqualsBuilder().append(height, rhs.height).append(width, rhs.width).append(isSilhouette, rhs.isSilhouette).append(url, rhs.url).isEquals();
    }

}
