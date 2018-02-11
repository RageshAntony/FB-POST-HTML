
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
    "comment_count",
    "from",
    "created_time",
    "like_count",
    "message",
    "permalink_url",
    "id",
    "comments",
    "reactions",
    "attachment"
})
public class Datum__ implements Serializable
{

    @JsonProperty("comment_count")
    private Long commentCount;
    @JsonProperty("from")
    private From_ from;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("like_count")
    private Long likeCount;
    @JsonProperty("message")
    private String message;
    @JsonProperty("permalink_url")
    private String permalinkUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("comments")
    private Comments_ comments;
    @JsonProperty("reactions")
    private Reactions__ reactions;
    @JsonProperty("attachment")
    private Attachment_ attachment;
    private final static long serialVersionUID = -2389002152304735755L;

    @JsonProperty("comment_count")
    public Long getCommentCount() {
        return commentCount;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    @JsonProperty("from")
    public From_ getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From_ from) {
        this.from = from;
    }

    @JsonProperty("created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("like_count")
    public Long getLikeCount() {
        return likeCount;
    }

    @JsonProperty("like_count")
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("permalink_url")
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    @JsonProperty("permalink_url")
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("comments")
    public Comments_ getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Comments_ comments) {
        this.comments = comments;
    }

    @JsonProperty("reactions")
    public Reactions__ getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(Reactions__ reactions) {
        this.reactions = reactions;
    }

    @JsonProperty("attachment")
    public Attachment_ getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment_ attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("commentCount", commentCount).append("from", from).append("createdTime", createdTime).append("likeCount", likeCount).append("message", message).append("permalinkUrl", permalinkUrl).append("id", id).append("comments", comments).append("reactions", reactions).append("attachment", attachment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(message).append(permalinkUrl).append(likeCount).append(reactions).append(createdTime).append(attachment).append(from).append(commentCount).append(comments).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum__) == false) {
            return false;
        }
        Datum__ rhs = ((Datum__) other);
        return new EqualsBuilder().append(id, rhs.id).append(message, rhs.message).append(permalinkUrl, rhs.permalinkUrl).append(likeCount, rhs.likeCount).append(reactions, rhs.reactions).append(createdTime, rhs.createdTime).append(attachment, rhs.attachment).append(from, rhs.from).append(commentCount, rhs.commentCount).append(comments, rhs.comments).isEquals();
    }

}
