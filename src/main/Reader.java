package main;

public class Reader {
    private Integer id;
    private String firstName;
    private String lastName;
    private String addressStreetName;
    private Integer addressHouseNumber;
    private Integer phoneNumber;

    public Reader(Integer id, String name, String lastName, String addressStreetName, Integer addressHouseNumber, Integer phoneNumber) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.addressStreetName = addressStreetName;
        this.addressHouseNumber = addressHouseNumber;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressStreetName() {
        return addressStreetName;
    }

    public void setAddressStreetName(String addressStreetName) {
        this.addressStreetName = addressStreetName;
    }

    public Integer getAddressHouseNumber() {
        return addressHouseNumber;
    }

    public void setAddressHouseNumber(Integer addressHouseNumber) {
        this.addressHouseNumber = addressHouseNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
