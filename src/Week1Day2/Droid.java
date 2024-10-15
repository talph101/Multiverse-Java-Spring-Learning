package Week1Day2;

public class Droid {

        String name;
        int batteryLevel = 100;

        //constructor
        public Droid(String droidName){
            name = droidName;
        }

        //method
        public void performTask(String task){
            System.out.println(name+" is performing task: "+task);
        }

        public int level(){
            batteryLevel = batteryLevel - 10;
            return batteryLevel;
        }

        public String toString(){
            return "Hello, I'm the droid: " + name;
        }

        public static void main(String[] args){
            Droid firstDroid = new Droid("Codey");

            //printing the variable:
            System.out.println(firstDroid);
            //printing the name field;
            System.out.println(firstDroid.name);
            System.out.println("Battery level: " + firstDroid.batteryLevel);
            firstDroid.performTask("running");
            System.out.println("New battery level: " + firstDroid.level());
        }
    }

