public class PersonInfo {
    private String name;
    private int age;
    private String pesel;
    private String birthDate;
    private String motherMaidenName;

    public PersonInfo(String name, int age, String pesel, String birthDate, String motherMaidenName) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
        this.birthDate = birthDate;
        this.motherMaidenName = motherMaidenName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }



}
