
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
    "id",
    "url"
})
public class Target__ implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    private final static long serialVersionUID = -4089055286773967992L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Target__) == false) {
            return false;
        }
        Target__ rhs = ((Target__) other);
        return new EqualsBuilder().append(id, rhs.id).append(url, rhs.url).isEquals();
    }

}
