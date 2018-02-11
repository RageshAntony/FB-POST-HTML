
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
    "created_time",
    "from",
    "message",
    "id"
})
public class Parent implements Serializable
{

    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("from")
    private From___ from;
    @JsonProperty("message")
    private String message;
    @JsonProperty("id")
    private String id;
    private final static long serialVersionUID = -731375833063326217L;

    @JsonProperty("created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("from")
    public From___ getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From___ from) {
        this.from = from;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createdTime", createdTime).append("from", from).append("message", message).append("id", id).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(message).append(createdTime).append(from).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parent) == false) {
            return false;
        }
        Parent rhs = ((Parent) other);
        return new EqualsBuilder().append(id, rhs.id).append(message, rhs.message).append(createdTime, rhs.createdTime).append(from, rhs.from).isEquals();
    }

}
