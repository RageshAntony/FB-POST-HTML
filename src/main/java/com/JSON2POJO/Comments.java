
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
public class Comments implements Serializable
{

    @JsonProperty("data")
    private List<Datum__> data = null;
    @JsonProperty("paging")
    private Paging_____ paging;
    private final static long serialVersionUID = -4947326389657014031L;

    @JsonProperty("data")
    public List<Datum__> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum__> data) {
        this.data = data;
    }

    @JsonProperty("paging")
    public Paging_____ getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging_____ paging) {
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
        if ((other instanceof Comments) == false) {
            return false;
        }
        Comments rhs = ((Comments) other);
        return new EqualsBuilder().append(data, rhs.data).append(paging, rhs.paging).isEquals();
    }

}
