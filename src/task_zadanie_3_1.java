public class task_zadanie_3_1 {
    public static void main(String[] args) {
        int age = 28;
        int kindergardenFinish = 6;
        int kindergadenStart = 2;
        int universityStart = 18;
        int universityFinish = 24;
        if (age >= kindergadenStart && age <= kindergardenFinish)
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в садик.");
        else if (age > kindergardenFinish && age <= universityStart)
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        else if (age > universityStart && age <= universityFinish)
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        else
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
    }
}