import java.util.Arrays;


/*Your colleagues have been looking over you shoulder. When you should have been doing your boring real job, you've been using the work computers to smash in endless hours of codewars.

In a team meeting, a terrible, awful person declares to the group that you aren't working. You're in trouble. You quickly have to gauge the feeling in the room to decide whether or not you should gather your things and leave.

Given a Person array (meet) containing team members, you need to assess the overall happiness rating of the group. If <= 5, return "Get Out Now!". Else return "Nice Work Champ!".
*/
public class seventhKyuTheOffice1 {
    static class Person {
        final String name;    // team memnber's name
        final int happiness;  // happiness rating out of 10

        Person(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }

    public static void main(String[] args) {
        Person[] test = new Person[]{
                new Person("Suraj", 1),
                new Person("Dave", 2),
                new Person("Kim", 64),
                new Person("Darren", 23),
                new Person("Lilly", 22),
                new Person("Mel", 21),
                new Person("Jessica", 22),
        };

        System.out.println(outed(test, "Dave"));


    }

    public static String outed(Person[] meet, String boss) {

        for (int x = 0; x < meet.length; x++) {
            System.out.println(meet[x].name + " " + meet[x].happiness);
        }
        return "What should I do?";
    }
}

