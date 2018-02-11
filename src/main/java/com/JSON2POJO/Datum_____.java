
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
    "pic",
    "picture",
    "name"
})
public class Datum_____ implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("pic")
    private String pic;
    @JsonProperty("picture")
    private Picture__ picture;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = 2270614968625885852L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("pic")
    public String getPic() {
        return pic;
    }

    @JsonProperty("pic")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @JsonProperty("picture")
    public Picture__ getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture__ picture) {
        this.picture = picture;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("pic", pic).append("picture", picture).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(picture).append(id).append(name).append(pic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum_____) == false) {
            return false;
        }
        Datum_____ rhs = ((Datum_____) other);
        return new EqualsBuilder().append(picture, rhs.picture).append(id, rhs.id).append(name, rhs.name).append(pic, rhs.pic).isEquals();
    }

}
