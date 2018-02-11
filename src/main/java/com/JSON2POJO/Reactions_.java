
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
    "data",
    "paging"
})
public class Reactions_ implements Serializable
{

    @JsonProperty("data")
    private List<Datum____> data = null;
    @JsonProperty("paging")
    private Paging_ paging;
    private final static long serialVersionUID = -4889836418217043837L;

    @JsonProperty("data")
    public List<Datum____> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum____> data) {
        this.data = data;
    }

    @JsonProperty("paging")
    public Paging_ getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging_ paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).append("paging", paging).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(paging).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reactions_) == false) {
            return false;
        }
        Reactions_ rhs = ((Reactions_) other);
        return new EqualsBuilder().append(data, rhs.data).append(paging, rhs.paging).isEquals();
    }

}
