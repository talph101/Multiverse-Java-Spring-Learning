package Week1Day1;

public class MadLibs {
    /*
    This program generates a Mad Libs story. -Tiffany 10/14/2024
    */
    public static void main(String[] args){
        String name1 = "Jimmy";
        String adjective1 = "funny";
        String adjective2 = "good";
        String adjective3 = "bad";
        String verb1 = "run";
        String noun1 = "cat";
        String noun2 = "chair";
        String noun3 = "assignments";
        String noun4 = "bike";
        String noun5 = "gym";
        String noun6 = "Beyonce";
        String name2 = "Tiffany";
        int number = 20;
        String place1 = "Paris";
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
