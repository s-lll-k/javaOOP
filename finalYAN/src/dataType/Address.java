package dataType;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    public Address(String streetAddress,String city,String state,String zipcode,String country){
        this.city=city;
        this.country=country;
        this.state=state;
        this.zipcode=zipcode;
        this.streetAddress=streetAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
