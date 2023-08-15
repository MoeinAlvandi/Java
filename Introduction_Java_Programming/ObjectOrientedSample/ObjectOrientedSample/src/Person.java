public class Person {
    private int userID;
    private static int user_ID;
    private String FullName;
    private int age;
    private String email;

    public Person(String fullName) {
        FullName = fullName;
    }

    public Person() {
        user_ID++;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID() {
        this.userID = user_ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userID=" + userID +
                ", FullName='" + FullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
