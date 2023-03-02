public class Address {

//DATA
    private String street;
    private String district;
    private String postcode;
    private String state;

    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }

//OPERATIONS

    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getDistrict() {
        return district;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public String getFullAddress() {
        return street +" "+ district +" "+ postcode +" "+ state;
    }
}
