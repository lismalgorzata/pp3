public class Family {
    public Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adult() {
        int sum = 0;
        for (Person person : members) {
            if (person.getAge() > 18) {
                sum ++;
            }
        }
        return sum;
    }
}
