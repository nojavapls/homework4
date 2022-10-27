public class task2 {
    public static void main(String[] args) {
//      int age = 19;
//      int age = 7;
      int age = 26;
        if(age >= 7 && age < 18)
            System.out.println("Если тебе " + age + " лет, то ты школьник.");
        else if (age >= 18 && age < 24)
                System.out.println("Если тебе " + age + " лет, то ты уже закончил школу и можешь отправляться в университет.");
        else if (age >= 24)
                System.out.println("Если тебе " + age + " лет, то ты окончил университет и пора искать первую работу. ");
    }
}
