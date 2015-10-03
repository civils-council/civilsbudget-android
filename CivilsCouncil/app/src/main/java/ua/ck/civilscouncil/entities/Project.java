package ua.ck.civilscouncil.entities;

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


    public Project() {
    }

    public Project(long id, String title, String description, String source, String picture, String createdAt, long likes, String owner) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.source = source;
        this.picture = picture;
        this.createdAt = createdAt;
        this.likes = likes;
        this.owner = owner;
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
}

