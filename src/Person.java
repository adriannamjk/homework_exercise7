

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private List<String> phoneNumbers;
    private List<Address> addresses;
    private Role role;
    private int age;


    public Person() {
    }
    public Person(String name, String surname, List <String> phoneNumbers, List <Address> addresses, Role role, int age) {
        this.name = name;
        this.surname = surname;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
        this.role = role;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List <String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List <String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List <Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List <Address> addresses) {
        this.addresses = addresses;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" + "surname='" + surname + '\'' +
                ", phoneNumbers=" + phoneNumbers + ", addresses=" + addresses +
                ", role=" + role + ", age=" + age +
                ", name='" + name + '\'' + '}';
    }


}
