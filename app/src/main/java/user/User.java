package user;

public class User {

    private String name;
    private String email;
    private String address;
    private int age;
    private String photoURL;

    public User() {
    }
    public User(String name,  String photoURL) {
        this.name = name;
        this.photoURL = photoURL;
    }



    public User(String name, String email, String address, int age, String photoURL) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.photoURL = photoURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}