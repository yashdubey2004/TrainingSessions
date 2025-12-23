public class Bus extends Thread{
    int available = 5;
    int passengers;
    Bus(int seats){
        passengers = seats;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available>=passengers){
            System.out.println(name + " booked " + passengers + " seats booked successfully");
            available = available - passengers;
            System.out.println("Seats left: " + available);
        }
        else{
            System.out.println(name + " could not book seats. Seats not available");
        }
    }
    }

