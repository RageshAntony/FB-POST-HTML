
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
    "previous",
    "next"
})
public class Paging_______ implements Serializable
{

    @JsonProperty("previous")
    private String previous;
    @JsonProperty("next")
    private String next;
    private final static long serialVersionUID = -5199440108539586212L;

    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("previous", previous).append("next", next).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(previous).append(next).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paging_______) == false) {
            return false;
        }
        Paging_______ rhs = ((Paging_______) other);
        return new EqualsBuilder().append(previous, rhs.previous).append(next, rhs.next).isEquals();
    }

}
