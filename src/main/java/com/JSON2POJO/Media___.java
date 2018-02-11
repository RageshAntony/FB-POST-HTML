
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
public class Media___ implements Serializable
{

    @JsonProperty("image")
    private Image___ image;
    private final static long serialVersionUID = 4349732082566996252L;

    @JsonProperty("image")
    public Image___ getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image___ image) {
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
        if ((other instanceof Media___) == false) {
            return false;
        }
        Media___ rhs = ((Media___) other);
        return new EqualsBuilder().append(image, rhs.image).isEquals();
    }

}
