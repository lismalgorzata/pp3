public abstract class Message {
    private String text;

    Message() {

    }

    Message(String text) {
        this.text = text;
    }

    int charNumber() {
        return text.length();
    }

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public abstract void send();

    public static void main(String[] args) {
        SMS sms = new SMS("123456789");
        sms.setText("siema");
        sms.send();

        sms.setText("wassup");
        sms.send();

        Email email = new Email("L4","Jestem chora.");
        email.setRecipentAddress();
        email.send();
    }
}
