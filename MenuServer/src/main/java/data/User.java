package data;

/**
 * POJO that should match the tabe User
 * name             : Name of user
 * age              : Age of user
 * latitude         : latitude of user
 * longitude        : longitude of user
 */
public class User {
    private String name;
    private int age;
    private double latitude;
    private double longitude;

    public User(String name, int age, double latitude, double longitude){
        this.name = name;
        this.age = age;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
