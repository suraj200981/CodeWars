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
                new Person("tim", 2),
                new Person("jim ", 9),
                new Person("randy ", 2),
                new Person("sandy ", 8),
                new Person("andy ", 2),
                new Person("katie ", 6),
                new Person("laura", 7),
                new Person("saajid ", 3),
                new Person("alex ", 2),
                new Person("john  ", 1),
        };

        System.out.println(outed(test, "Dave"));


    }

    public static String outed(Person[] meet, String boss) {

        int overallHappiness=0;
        int totalHappiness=0;
        int totalPeopleInRoom = meet.length;

        for (int x = 0; x < meet.length; x++) {
            System.out.println(meet[x].name + " " + meet[x].happiness);
            totalHappiness += meet[x].happiness;
        }
        System.out.println("Total Happiness: "+totalHappiness);
        System.out.println("Number of people: "+(totalPeopleInRoom+1));
        overallHappiness= (int) Math.round((double)totalHappiness/ ((double) (totalPeopleInRoom+1)));
        System.out.println("Overall Happiness: "+overallHappiness);

        if(Math.round(overallHappiness)<5){
            return "Get Out Now!";

        }else{
            return "Nice Work Champ!";

        }
    }
}

