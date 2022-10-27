public class task_zadanie_3_2 {
    public static void main(String[] args) {
        int age = 2;
        int ageMin = 5;
        int ageMax = 14;
        if (age < ageMin)
            System.out.println("Если возраст человека равен " + age + " лет, то ему нельзя кататься на аттракционе.");
        else if (age >= ageMin && age < ageMax)
            System.out.println("Если возраст человека равен " + age + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        else if (age > ageMax)
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься без сопровождения взрослого.");
        }
}
