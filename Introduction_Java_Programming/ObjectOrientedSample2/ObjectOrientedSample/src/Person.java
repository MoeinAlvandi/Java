import java.util.Date;

abstract class Person {
   private String FullName;
    private static int user_ID=0;
   private Date CreateDate;
   private int Age;
   private int ID;
   private int Sex;

   private String UserName;
   private String Password;



    public Person() {
        user_ID++;

    }

    public Person(String fullName) {
        FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        this.ID = user_ID;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FullName='" + FullName + '\'' +
                ", CreateDate=" + CreateDate +
                ", Age=" + Age +
                ", ID=" + ID +
                ", Sex=" + Sex +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
