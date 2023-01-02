public class SMS extends Message {
    String phoneNumber;

    SMS(String phoneNumber) {
        super();
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void send(){
        System.out.println("SMS sent with content: "+ getText() );
    }

}
