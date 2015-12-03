package ua.ck.civilscouncil.entities;

import org.json.JSONObject;

/**
 * Created by cheb on 10/3/15.
 */
public class Project {
    private boolean vote;
    private long id;
    private String title;
    private String description;
    private double charge;
    private String source;
    private String picture;
    private String createdAt;
    private long likes;
    private String owner;
    private String avatar_owner;


    public Project() {
    }

    public Project(JSONObject json) {
        try {
            if (json.has("vote"))
                this.vote = json.getBoolean("vote");
            if (json.has("id"))
                this.id = json.getLong("id");
            if (json.has("title"))
                this.title = json.getString("title").trim();
            if (json.has("description"))
                this.description = json.getString("description").trim();
            if (json.has("charge"))
                this.charge = json.getLong("charge");
            if (json.has("source"))
                this.source = json.getString("source");
            if (json.has("picture"))
                this.picture = json.getString("picture");
            if (json.has("createdAt"))
                this.createdAt = json.getString("createdAt");
            if (json.has("likes_count"))
                this.likes = json.getLong("likes_count");
            if (json.has("owner"))
                this.owner = json.getString("owner");
            if (json.has("avatar_owner"))
                this.avatar_owner = json.getString("avatar_owner");
        } catch (Exception ex) {

        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "vote=" + vote +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", source='" + source + '\'' +
                ", picture='" + picture + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", likes=" + likes +
                ", avatar_owner='" + avatar_owner + '\'' +
                ", owner='" + owner + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(long value) {
        this.charge = value;
    }

    public String getCreated() {
        if (createdAt != null && createdAt.length() > 0) {
            String value = createdAt.substring(0, 10);
            String[] result = value.split("-");
            return result[2] + "-" + result[1] + "-" + result[0];
        }
        return "";
    }
}

