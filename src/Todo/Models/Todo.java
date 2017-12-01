package Todo.Models;

/**
 * Created by Tarek Monjur on 11/27/2017.
 */
public class Todo {

    protected int row, id;
    protected String firstName,lastName,email,password,address,city,state,zip;

    public void setRow(int row) {
        this.row = row;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
         this.lastName = lastName;
    }

    public void setEmail(String email) {
         this.email = email;
    }

    public void setPassword(String password) {
         this.password = password;
    }

    public void setAddress(String address) {
         this.address = address;
    }

    public void setCity(String city) {
         this.city = city;
    }

    public void setState(String state) {
         this.state = state;
    }

    public void setZip(String zip) {
         this.zip = zip;
    }



    public int getRow() { return this.row; }

    public int getId() { return this.id; }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }


}
