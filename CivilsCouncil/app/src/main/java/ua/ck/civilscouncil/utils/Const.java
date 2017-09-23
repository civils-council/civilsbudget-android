package ua.ck.civilscouncil.utils;

public class Const {
    public static String baseURLString = "https://www.vote.imisto.com.ua/api";

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
