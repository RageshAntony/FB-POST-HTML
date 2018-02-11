
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
    "cursors"
})
public class Paging implements Serializable
{

    @JsonProperty("cursors")
    private Cursors cursors;
    private final static long serialVersionUID = 7524839229445498309L;

    @JsonProperty("cursors")
    public Cursors getCursors() {
        return cursors;
    }

    @JsonProperty("cursors")
    public void setCursors(Cursors cursors) {
        this.cursors = cursors;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cursors", cursors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cursors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paging) == false) {
            return false;
        }
        Paging rhs = ((Paging) other);
        return new EqualsBuilder().append(cursors, rhs.cursors).isEquals();
    }

}
