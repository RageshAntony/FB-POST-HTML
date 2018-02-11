
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
    "message",
    "created_time",
    "id",
    "full_picture",
    "status_type",
    "from",
    "icon",
    "link",
    "object_id",
    "permalink_url",
    "timeline_visibility",
    "reactions",
    "comments",
    "attachments",
    "likes",
    "name",
    "story",
    "story_tags",
    "caption"
})
public class Datum implements Serializable
{

    @JsonProperty("message")
    private String message;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("full_picture")
    private String fullPicture;
    @JsonProperty("status_type")
    private String statusType;
    @JsonProperty("from")
    private From from;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("link")
    private String link;
    @JsonProperty("object_id")
    private String objectId;
    @JsonProperty("permalink_url")
    private String permalinkUrl;
    @JsonProperty("timeline_visibility")
    private String timelineVisibility;
    @JsonProperty("reactions")
    private Reactions reactions;
    @JsonProperty("comments")
    private Comments comments;
    @JsonProperty("attachments")
    private Attachments attachments;
    @JsonProperty("likes")
    private Likes_ likes;
    @JsonProperty("name")
    private String name;
    @JsonProperty("story")
    private String story;
    @JsonProperty("story_tags")
    private List<StoryTag> storyTags = null;
    @JsonProperty("caption")
    private String caption;
    private final static long serialVersionUID = -7575470597152024649L;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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

    @JsonProperty("full_picture")
    public String getFullPicture() {
        return fullPicture;
    }

    @JsonProperty("full_picture")
    public void setFullPicture(String fullPicture) {
        this.fullPicture = fullPicture;
    }

    @JsonProperty("status_type")
    public String getStatusType() {
        return statusType;
    }

    @JsonProperty("status_type")
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("object_id")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("object_id")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("permalink_url")
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    @JsonProperty("permalink_url")
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    @JsonProperty("timeline_visibility")
    public String getTimelineVisibility() {
        return timelineVisibility;
    }

    @JsonProperty("timeline_visibility")
    public void setTimelineVisibility(String timelineVisibility) {
        this.timelineVisibility = timelineVisibility;
    }

    @JsonProperty("reactions")
    public Reactions getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    @JsonProperty("attachments")
    public Attachments getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("likes")
    public Likes_ getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Likes_ likes) {
        this.likes = likes;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("story")
    public String getStory() {
        return story;
    }

    @JsonProperty("story")
    public void setStory(String story) {
        this.story = story;
    }

    @JsonProperty("story_tags")
    public List<StoryTag> getStoryTags() {
        return storyTags;
    }

    @JsonProperty("story_tags")
    public void setStoryTags(List<StoryTag> storyTags) {
        this.storyTags = storyTags;
    }

    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("message", message).append("createdTime", createdTime).append("id", id).append("fullPicture", fullPicture).append("statusType", statusType).append("from", from).append("icon", icon).append("link", link).append("objectId", objectId).append("permalinkUrl", permalinkUrl).append("timelineVisibility", timelineVisibility).append("reactions", reactions).append("comments", comments).append("attachments", attachments).append("likes", likes).append("name", name).append("story", story).append("storyTags", storyTags).append("caption", caption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(icon).append(reactions).append(createdTime).append(statusType).append(link).append(timelineVisibility).append(caption).append(from).append(id).append(message).append(story).append(storyTags).append(permalinkUrl).append(objectId).append(fullPicture).append(name).append(likes).append(attachments).append(comments).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(icon, rhs.icon).append(reactions, rhs.reactions).append(createdTime, rhs.createdTime).append(statusType, rhs.statusType).append(link, rhs.link).append(timelineVisibility, rhs.timelineVisibility).append(caption, rhs.caption).append(from, rhs.from).append(id, rhs.id).append(message, rhs.message).append(story, rhs.story).append(storyTags, rhs.storyTags).append(permalinkUrl, rhs.permalinkUrl).append(objectId, rhs.objectId).append(fullPicture, rhs.fullPicture).append(name, rhs.name).append(likes, rhs.likes).append(attachments, rhs.attachments).append(comments, rhs.comments).isEquals();
    }

}
