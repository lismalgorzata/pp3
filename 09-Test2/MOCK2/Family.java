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

    public static void main(String[] args) {
        Person p1 = new Person("Maciek", 19);
        Person p2 = new Person("Krystyna", 78);
        Person p3 = new Person("Nadia",8);

        Family f = new Family(new Person[]{p1,p2,p3});
        System.out.println(f.adult());

    }
}
