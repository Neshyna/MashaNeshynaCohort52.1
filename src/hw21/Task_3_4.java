package hw21;

public class Task_3_4 {

    /*
    Task 3 * (Опционально)
Переписать метод public String toString()в классе Autobus,
используя StringBuilder для формирования строки.


    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: ");
        sb.append("id: ").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append(", driver ").append(driver);
        sb.append(", autopilot ").append(autopilot);
        sb.append(" } ");
        return sb.toString();
    }

    Task 4 * (Опционально)
Написать метод высадки пассажира из автобуса boolean dropPassenger(Passenger passenger)

public boolean dropPassenger(Passenger passenger){
        if(passenger == null){
            return false;
        }
        if(countPassengers <= 0){
            System.out.printf("nobody is in the bus %d",this.id);
            return false;
        }
        if(countPassengers > 0){
            if(isPassengerInBus(passenger)){
                // Remove passenger from the array and decrease the count
                for(int i = 0; i < countPassengers; i++){
                    if(passengers[i].equals(passenger)){//Check for Matching Passenger
                        // Shift remaining passengers
                        for (int j = i; j < countPassengers - 1; j++) {
                            passengers[j] = passengers[j + 1];
                        }
                        passengers[countPassengers - 1] = null;// Clear the last passenger slot
                        countPassengers--;
                        System.out.printf("passenger %d is out of the bus with id %d" , passenger.getId(),this.id);
                        return true;// Passenger successfully dropped
                    }
                }
            }
            System.out.printf("there is no passenger %d in bus with id %d" , passenger.getId(),this.id);
            return false;
        }
        return true;
    }


    */
}
