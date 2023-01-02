public class Email extends Message {
    private String messageSubject;
    private String recipentAddress;

    Email(String messageSubject, String text){
        super(text);
        this.messageSubject = messageSubject;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getRecipentAddress() {
        return recipentAddress;
    }

    public void setRecipentAddress(String recipentAddress) {
        this.recipentAddress = recipentAddress;
    }

    @Override
    public void send() {
        System.out.println("Email sent with content: " + getText() + "to: " + getRecipentAddress());
    }

}
