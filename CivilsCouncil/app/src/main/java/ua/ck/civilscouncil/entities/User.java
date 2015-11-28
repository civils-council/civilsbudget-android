package ua.ck.civilscouncil.entities;

/**
 * Created by taras on 27.11.15.
 */
public class User {
    int id;
    String fullName;
    String clid;

    public User(int id, String name, String clid) {
        this.id = id;
        this.fullName = name;
        this.clid = clid;
    }
}
