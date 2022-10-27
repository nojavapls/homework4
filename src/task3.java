public class task3 {
    public static void main(String[] args) {
        int seatsInTotal = 120;
        int currentPeopleAmount = 78;
        int comfortSeats = 60;
        if (currentPeopleAmount <= comfortSeats)
            System.out.println("Есть сидячие места");
        else if (currentPeopleAmount > comfortSeats && currentPeopleAmount <= seatsInTotal)
            System.out.println("Есть стоячие места");
        else
            System.out.println("Мест нет");
    }
}
