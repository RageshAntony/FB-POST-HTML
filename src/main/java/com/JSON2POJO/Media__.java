
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
    "image"
})
public class Media__ implements Serializable
{

    @JsonProperty("image")
    private Image__ image;
    private final static long serialVersionUID = 7595817092519748121L;

    @JsonProperty("image")
    public Image__ getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image__ image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("image", image).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Media__) == false) {
            return false;
        }
        Media__ rhs = ((Media__) other);
        return new EqualsBuilder().append(image, rhs.image).isEquals();
    }

}
