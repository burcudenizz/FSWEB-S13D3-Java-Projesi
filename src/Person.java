public class Person {

    String firstName;
    String lastName;
    int age;

    String mail;
    String city;
    String job;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    //overloading
    public Person(String mail, String city, String job) {
        this.mail = mail;
        this.city = city;
        this.job = job;

    }

    //constructor chaining
    public Person(String firstName, String lastName, int age, String city) {
        this(firstName, lastName, age);
        this.city = city;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean isTeen(int age) {
        return age <= 19 && age >= 13;
    }


}
