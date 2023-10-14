public class Main {

    static final int profitableAmount = 11000;

    public static void main(String[] args) {
        Bus bus1 = new Bus(54, 400, 1);
        Bus bus2 = new Bus(45, 500, 2);

        int group1 = 25;
        int group2 = 30;

        if(bus1.getSeats() > group1 && bus2.getSeats() > group2){
            bus1.setOccupiedSeats(group1);
            bus2.setOccupiedSeats(group2);
        }

        else if(bus1.getSeats() > group2 && bus2.getSeats() > group1){
            bus1.setOccupiedSeats(group2);
            bus2.setOccupiedSeats(group1);
        }

        checkIfRideIsProfit(bus1, profitableAmount);
        checkIfRideIsProfit(bus2, profitableAmount);
    }

    public static void checkIfRideIsProfit(Bus bus, int profitableAmount){
        int busCost = bus.getCostOfOccupiedSeats();

        System.out.println("Цена мест в автобусе № " + bus.getId() + ": " + busCost);

        if(busCost > profitableAmount){
            System.out.println("Поездка на автобусе №" + bus.getId() + " выгодная");
        }
        else{
            System.out.println("Поездка на автобусе №" + bus.getId() + " невыгодная");
        }
    }
}
