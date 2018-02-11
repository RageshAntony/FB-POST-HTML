
package com.JSON2POJO;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total_count",
    "can_like",
    "has_liked"
})
public class Summary implements Serializable
{

    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("can_like")
    private Boolean canLike;
    @JsonProperty("has_liked")
    private Boolean hasLiked;
    private final static long serialVersionUID = 3069080458199863142L;

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("can_like")
    public Boolean getCanLike() {
        return canLike;
    }

    @JsonProperty("can_like")
    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    @JsonProperty("has_liked")
    public Boolean getHasLiked() {
        return hasLiked;
    }

    @JsonProperty("has_liked")
    public void setHasLiked(Boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalCount", totalCount).append("canLike", canLike).append("hasLiked", hasLiked).toString();
    }

}
