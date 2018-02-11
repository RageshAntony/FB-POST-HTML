
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
    "data"
})
public class Picture__ implements Serializable
{

    @JsonProperty("data")
    private Data__ data;
    private final static long serialVersionUID = 4216318488308628833L;

    @JsonProperty("data")
    public Data__ getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data__ data) {
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
        if ((other instanceof Picture__) == false) {
            return false;
        }
        Picture__ rhs = ((Picture__) other);
        return new EqualsBuilder().append(data, rhs.data).isEquals();
    }

}
