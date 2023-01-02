public class User {
    String firstName;
    String lastName;
    Email email;
    SMS phone;

    public User(String firstName, String lastName, Email email, SMS phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public static void main(String[] args) {
        User user = new User("Małgosia", "Lis", new Email("gochowi1@gmail.com"), new SMS("123-456-789"));

        user.email.setText("1000zł");
        user.email.setMessageSubject("Podwyżka");
        user.email.setRecipentAddress("pracownik@poczta.pl");
        user.email.send();

        user.phone.setText("upsi upsi");
        user.phone.send();
    }
}
