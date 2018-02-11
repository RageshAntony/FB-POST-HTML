
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
public class Paging____ implements Serializable
{

    @JsonProperty("cursors")
    private Cursors____ cursors;
    private final static long serialVersionUID = 2999811094464646443L;

    @JsonProperty("cursors")
    public Cursors____ getCursors() {
        return cursors;
    }

    @JsonProperty("cursors")
    public void setCursors(Cursors____ cursors) {
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
        if ((other instanceof Paging____) == false) {
            return false;
        }
        Paging____ rhs = ((Paging____) other);
        return new EqualsBuilder().append(cursors, rhs.cursors).isEquals();
    }

}
