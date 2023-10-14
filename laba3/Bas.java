public class Bus {
    private int seats;
    private int price;
    private int occupiedSeats;
    private int id;

    public Bus(){
        this.seats = 0;
        this.price = 0;
        this.occupiedSeats = 0;
        this.id = 0;
    }

    public Bus(int seats, int price, int id){
        this.seats = seats;
        this.price = price;
        this.occupiedSeats = 0;
        this.id = id;
    }

    public Bus(Bus anotherBus, int id){
        this.seats = anotherBus.seats;
        this.price = anotherBus.price;
        this.occupiedSeats = anotherBus.occupiedSeats;
        this.id = id;
    }

    public int getSeats(){
        return this.seats;
    }

    public void setSeats(int updatedSeats){
        if(updatedSeats >= 0){
            this.seats = updatedSeats;
        }
    }
    public int getId(){
        return this.id;
    }

    public void setId(int updateId){
        this.id = id;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int updatedPrice){
        if(updatedPrice >= 0){
            this.price = updatedPrice;
        }
    }

    public int getOccupiedSeats(){
        return this.occupiedSeats;
    }

    public void setOccupiedSeats(int updatedOccupiedSeats){
        if(updatedOccupiedSeats >= 0){
            this.occupiedSeats = updatedOccupiedSeats;
        }
    }

    public int getFreeSeats(){
        return getSeats() - getOccupiedSeats();
    }

    public boolean isFull(){
        int freeSeats = getFreeSeats();
        return freeSeats == 0;
    }

    public int getCostOfOccupiedSeats(){
        return getOccupiedSeats() * getPrice();
    }

}
