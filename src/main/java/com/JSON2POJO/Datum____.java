
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
    "link",
    "name",
    "pic",
    "picture",
    "type"
})
public class Datum____ implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("link")
    private String link;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pic")
    private String pic;
    @JsonProperty("picture")
    private Picture_ picture;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = 687851156271614521L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
    public Picture_ getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture_ picture) {
        this.picture = picture;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("link", link).append("name", name).append("pic", pic).append("picture", picture).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(picture).append(id).append(name).append(link).append(pic).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum____) == false) {
            return false;
        }
        Datum____ rhs = ((Datum____) other);
        return new EqualsBuilder().append(picture, rhs.picture).append(id, rhs.id).append(name, rhs.name).append(link, rhs.link).append(pic, rhs.pic).append(type, rhs.type).isEquals();
    }

}
