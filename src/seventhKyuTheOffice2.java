/*Instructions:
* Every now and then people in the office moves teams or departments. Depending what people are doing with their time they can become more or less boring. Time to assess the current team.

    You will be provided with an array of Person objects with each instance containing the name and department for a staff member.
    * Each department has a different boredom assessment score, as follows:

accounts = 1
finance = 2
canteen = 10
regulation = 3
trading = 6
change = 6
IS = 8
retail = 5
cleaning = 4
pissing about = 25

Depending on the cumulative score of the team, return the appropriate sentiment:

<=80: 'kill me now'
< 100 & > 80: 'i can handle this'
100 or over: 'party time!!'*/

public class seventhKyuTheOffice2 {

    static class Person {
        public final String name;        // name of the staff member
        public final String department;  // department they work in

        Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }

    public static void main(String[] args) {
        Person[] test = new Person[]{
                new Person("dave", "accounts"),
                new Person("dave", "finance"),
                new Person("dave", "canteen"),
                new Person("dave", "regulation"),
                new Person("dave", "trading"),
                new Person("dave", "change"),
                new Person("dave", "IS"),
                new Person("dave", "retail"),
                new Person("dave", "cleaning"),
                new Person("dave", "pissing about"),


        };

        System.out.println(boredom(test));

    }


    public static String boredom(Person[] staff) {
        int sumOfAssessment=0;
        int numberOfStaff=0;
        int finalScore=0;
        for (int x = 0; x < staff.length; x++) {
            if(staff[x].department.equals("accounts")){



            }else if(staff[x].department.equals("finance")){

            }
            if(staff[x].department.equals("canteen")){

            }else if(staff[x].department.equals("regulation")){

            }
            if(staff[x].department.equals("trading")){

            }else if(staff[x].department.equals("change")){

            }
            if(staff[x].department.equals("IS")){

            }else if(staff[x].department.equals("retail")){

            }else if(staff[x].department.equals("cleaning")){

            }else if(staff[x].department.equals("pissing about")){

            }
        }

        return "What should I do?";
    }
}
