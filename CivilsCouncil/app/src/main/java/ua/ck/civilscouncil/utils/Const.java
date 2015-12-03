package ua.ck.civilscouncil.utils;

/**
 * Created by taras on 27.11.15.
 */
public class Const {
    public static String baseURLString = "http://www.golos.ck.ua/api";

    public static String getProjectsURL() {
        return baseURLString + "/projects";
    }

    public static String getProjectURL(long id) {
        return getProjectsURL() + "/" + id;
    }

    public static String getProjectLikeURL(long id) {
        return getProjectsURL() + "/" + id;
    }

    public static String getAuthURL() {
        return baseURLString + "/authorization";
    }
}
