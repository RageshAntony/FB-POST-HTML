
package com.JSON2POJO;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})
public class Subattachments implements Serializable
{

    @JsonProperty("data")
    private List<Datum________> data = null;
    private final static long serialVersionUID = -178270552725238162L;

    @JsonProperty("data")
    public List<Datum________> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum________> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subattachments) == false) {
            return false;
        }
        Subattachments rhs = ((Subattachments) other);
        return new EqualsBuilder().append(data, rhs.data).isEquals();
    }

}
