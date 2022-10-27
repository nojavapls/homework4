public class task_zadanie_3_3 {
    public static void main(String[] args) {
        int one = 287;
        int two = 122;
        int three = 9914;
        if (one > two && one > three)
            System.out.println(one + " - самое большое число");
        else if (two > one && two > three)
            System.out.println(two + " - самое большое число");
        else if (three > two && three > two)
            System.out.println(three + " - самое большое число");
    }
}
