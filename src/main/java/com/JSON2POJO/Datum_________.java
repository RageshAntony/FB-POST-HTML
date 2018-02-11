
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
    "pic_large",
    "pic_small",
    "pic_square",
    "profile_type",
    "picture"
})
public class Datum_________ implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("link")
    private String link;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pic")
    private String pic;
    @JsonProperty("pic_large")
    private String picLarge;
    @JsonProperty("pic_small")
    private String picSmall;
    @JsonProperty("pic_square")
    private String picSquare;
    @JsonProperty("profile_type")
    private String profileType;
    @JsonProperty("picture")
    private Picture____ picture;
    private final static long serialVersionUID = -2956404747307966124L;

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

    @JsonProperty("pic_large")
    public String getPicLarge() {
        return picLarge;
    }

    @JsonProperty("pic_large")
    public void setPicLarge(String picLarge) {
        this.picLarge = picLarge;
    }

    @JsonProperty("pic_small")
    public String getPicSmall() {
        return picSmall;
    }

    @JsonProperty("pic_small")
    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    @JsonProperty("pic_square")
    public String getPicSquare() {
        return picSquare;
    }

    @JsonProperty("pic_square")
    public void setPicSquare(String picSquare) {
        this.picSquare = picSquare;
    }

    @JsonProperty("profile_type")
    public String getProfileType() {
        return profileType;
    }

    @JsonProperty("profile_type")
    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    @JsonProperty("picture")
    public Picture____ getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture____ picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("link", link).append("name", name).append("pic", pic).append("picLarge", picLarge).append("picSmall", picSmall).append("picSquare", picSquare).append("profileType", profileType).append("picture", picture).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(picture).append(id).append(picSquare).append(picSmall).append(profileType).append(picLarge).append(name).append(link).append(pic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum_________) == false) {
            return false;
        }
        Datum_________ rhs = ((Datum_________) other);
        return new EqualsBuilder().append(picture, rhs.picture).append(id, rhs.id).append(picSquare, rhs.picSquare).append(picSmall, rhs.picSmall).append(profileType, rhs.profileType).append(picLarge, rhs.picLarge).append(name, rhs.name).append(link, rhs.link).append(pic, rhs.pic).isEquals();
    }

}
