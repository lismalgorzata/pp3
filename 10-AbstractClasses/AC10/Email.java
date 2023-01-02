public class Email extends Message {
    private String messageSubject;
    private String recipentAddress;
    private String authorAddress;

    Email(String messageSubject, String text){
        super(text);
        this.messageSubject = messageSubject;
    }

    Email(String authorAddress) {
        super();
        this.authorAddress = authorAddress;
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

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    @Override
    public void send() {
        System.out.println("Email sent with content: " + getText() + "from: "+ getAuthorAddress() + "to: " + getRecipentAddress());
    }



}