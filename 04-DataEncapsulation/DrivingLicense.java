import java.time.LocalDate;

public class DrivingLicense {

    private String driverName;
    private String driverSurname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private String yearOfIssue;
    private String drivingLicenseCategory;

    public void displayInfo(){
        System.out.print("Name: "+driverName+" | ");
        System.out.println("Surame: "+driverSurname+" | ");
        System.out.print("Address: "+address+" | ");
        System.out.print("Postal Code: "+postalCode+" | ");
        System.out.println("City: "+city+" | ");
        System.out.print("Driving License Number: "+drivingLicenseNumber+" | ");
        System.out.print("Year od issue: "+yearOfIssue+" | ");
        System.out.println("Category: "+drivingLicenseCategory+" | ");
    }

    public String getName() {
        return driverName;
    }
    public String getSurname() {
        return driverSurname;
    }
    public String getAddress() {
        return address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getDriverLicenseNumber() {
        return drivingLicenseNumber;
    }
    public String getYearOfIssue() {
        return yearOfIssue;
    }
    public String getDriverLicenseCategory() {
        return drivingLicenseCategory;
    }


    public void setName(String driverName) {
        driverName = driverName.substring(0, 1).toUpperCase() + driverName.substring(1).toLowerCase();
        this.driverName = driverName;
    }
    public void setSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDriverLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public void getYearOfIssue(String yearOfIssue) {
        int year = LocalDate.now().getYear();
        if ((Integer.valueOf(yearOfIssue) >= 1980) || Integer.valueOf(yearOfIssue)  < year) {
            this.yearOfIssue = yearOfIssue;
        }

    }
    public void getDriverLicenseCategory(String driverLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public String toString() {
        return "Name: "+ driverName + " | " + "Surname: " + driverSurname + " | " + "Address: " + address + " | " + postalCode + " | " + city + "License number: " + drivingLicenseNumber + " | " + "Year of issue: "+ yearOfIssue + " | " + " Categoty: " + drivingLicenseCategory;
    }
}
