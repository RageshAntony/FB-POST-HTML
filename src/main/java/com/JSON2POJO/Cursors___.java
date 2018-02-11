
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
    "before",
    "after"
})
public class Cursors___ implements Serializable
{

    @JsonProperty("before")
    private String before;
    @JsonProperty("after")
    private String after;
    private final static long serialVersionUID = -805378767017271017L;

    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    @JsonProperty("after")
    public void setAfter(String after) {
        this.after = after;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("before", before).append("after", after).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(after).append(before).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cursors___) == false) {
            return false;
        }
        Cursors___ rhs = ((Cursors___) other);
        return new EqualsBuilder().append(after, rhs.after).append(before, rhs.before).isEquals();
    }

}
