
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
public class Media_ implements Serializable
{

    @JsonProperty("image")
    private Image_ image;
    private final static long serialVersionUID = -954372069267577754L;

    @JsonProperty("image")
    public Image_ getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image_ image) {
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
        if ((other instanceof Media_) == false) {
            return false;
        }
        Media_ rhs = ((Media_) other);
        return new EqualsBuilder().append(image, rhs.image).isEquals();
    }

}
