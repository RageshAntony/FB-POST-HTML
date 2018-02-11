
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
    "attachment",
    "comment_count",
    "from",
    "created_time",
    "id",
    "like_count",
    "message",
    "parent",
    "permalink_url",
    "message_tags",
    "reactions",
    "likes"
})
public class Datum___ implements Serializable
{

    @JsonProperty("attachment")
    private Attachment attachment;
    @JsonProperty("comment_count")
    private Long commentCount;
    @JsonProperty("from")
    private From__ from;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("like_count")
    private Long likeCount;
    @JsonProperty("message")
    private String message;
    @JsonProperty("parent")
    private Parent parent;
    @JsonProperty("permalink_url")
    private String permalinkUrl;
    @JsonProperty("message_tags")
    private List<MessageTag> messageTags = null;
    @JsonProperty("reactions")
    private Reactions_ reactions;
    @JsonProperty("likes")
    private Likes likes;
    private final static long serialVersionUID = -8274460068928206093L;

    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("comment_count")
    public Long getCommentCount() {
        return commentCount;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    @JsonProperty("from")
    public From__ getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From__ from) {
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @JsonProperty("permalink_url")
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    @JsonProperty("permalink_url")
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    @JsonProperty("message_tags")
    public List<MessageTag> getMessageTags() {
        return messageTags;
    }

    @JsonProperty("message_tags")
    public void setMessageTags(List<MessageTag> messageTags) {
        this.messageTags = messageTags;
    }

    @JsonProperty("reactions")
    public Reactions_ getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(Reactions_ reactions) {
        this.reactions = reactions;
    }

    @JsonProperty("likes")
    public Likes getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attachment", attachment).append("commentCount", commentCount).append("from", from).append("createdTime", createdTime).append("id", id).append("likeCount", likeCount).append("message", message).append("parent", parent).append("permalinkUrl", permalinkUrl).append("messageTags", messageTags).append("reactions", reactions).append("likes", likes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(likeCount).append(reactions).append(createdTime).append(messageTags).append(parent).append(from).append(attachment).append(commentCount).append(message).append(id).append(permalinkUrl).append(likes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum___) == false) {
            return false;
        }
        Datum___ rhs = ((Datum___) other);
        return new EqualsBuilder().append(likeCount, rhs.likeCount).append(reactions, rhs.reactions).append(createdTime, rhs.createdTime).append(messageTags, rhs.messageTags).append(parent, rhs.parent).append(from, rhs.from).append(attachment, rhs.attachment).append(commentCount, rhs.commentCount).append(message, rhs.message).append(id, rhs.id).append(permalinkUrl, rhs.permalinkUrl).append(likes, rhs.likes).isEquals();
    }

}
