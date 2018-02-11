
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
public class Comments_ implements Serializable
{

    @JsonProperty("data")
    private List<Datum___> data = null;
    @JsonProperty("paging")
    private Paging___ paging;
    private final static long serialVersionUID = 3963592584967984646L;

    @JsonProperty("data")
    public List<Datum___> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum___> data) {
        this.data = data;
    }

    @JsonProperty("paging")
    public Paging___ getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging___ paging) {
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
        if ((other instanceof Comments_) == false) {
            return false;
        }
        Comments_ rhs = ((Comments_) other);
        return new EqualsBuilder().append(data, rhs.data).append(paging, rhs.paging).isEquals();
    }

}
