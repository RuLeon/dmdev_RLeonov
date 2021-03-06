package oop.homework;

public class House {

    private int number;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("Номер дома " + number + "," + "количество этажей " + floors.length);
    }
}
