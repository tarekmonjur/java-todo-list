package Todo.Models;

/**
 * Created by Tarek Monjur on 11/27/2017.
 */
public class Todo {

    protected int id;
    protected String firstName,lastName,email,password,address,city,state,zip;

    public int setId(int id) {
        return this.id = id;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public String setCity(String city) {
        return this.city = city;
    }

    public String setState(String state) {
        return this.state = state;
    }

    public String setZip(String zip) {
        return this.zip = zip;
    }



    public int getId() {  return id; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }


}
