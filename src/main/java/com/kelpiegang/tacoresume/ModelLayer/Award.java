package com.kelpiegang.tacoresume.ModelLayer;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("awards")
public class Award {

    @Id
    private ObjectId _id;
    @Reference
    private User user;
    private String title;
    private String about;

    public Award() {
    }

    public Award(User user,String title, String about) {
        this.title = title;
        this.about = about;
        this.user = user;
    }

    public ObjectId getObjectId() {
        return _id;
    }

    public String get_id() {
        return _id.toString();
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public String getAbout() {
        return about;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAbout(String about) {
        this.about = about;
    }

}
