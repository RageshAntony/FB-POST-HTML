
package com.JSON2POJO;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order",
    "total_count",
    "can_comment"
})
public class Summary_ implements Serializable
{

    @JsonProperty("order")
    private String order;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("can_comment")
    private Boolean canComment;
    private final static long serialVersionUID = 6333940051516661577L;

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("can_comment")
    public Boolean getCanComment() {
        return canComment;
    }

    @JsonProperty("can_comment")
    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("order", order).append("totalCount", totalCount).append("canComment", canComment).toString();
    }

}
