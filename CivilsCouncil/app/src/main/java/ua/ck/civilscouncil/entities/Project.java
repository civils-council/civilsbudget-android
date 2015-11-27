package ua.ck.civilscouncil.entities;

import org.json.JSONObject;

/**
 * Created by cheb on 10/3/15.
 */
public class Project {
    private long id;
    private String title;
    private String description;
    private String source;
    private String picture;
    private String createdAt;
    private long likes;
    private String owner;
    private double budget;


    public Project() {
    }

    public Project(JSONObject json) {
        try {
            if (json.has("id"))
                this.id = json.getLong("id");
            if (json.has("title"))
                this.title = json.getString("title");
            if (json.has("description"))
                this.description = json.getString("description");
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
            if (json.has("budget"))
                this.budget = json.getLong("budget");
        } catch (Exception ex) {

        }
    }

    public Project(long id, String title, String description, String source, String picture, String createdAt, long likes, String owner, double budget) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.source = source;
        this.picture = picture;
        this.createdAt = createdAt;
        this.likes = likes;
        this.owner = owner;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", source='" + source + '\'' +
                ", picture='" + picture + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", likes=" + likes +
                ", owner='" + owner + '\'' +
                ", budget='" + budget + '\'' +
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

}

