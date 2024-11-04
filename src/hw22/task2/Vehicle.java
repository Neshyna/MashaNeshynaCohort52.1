package hw22.task2;
/*
Task 2
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */
public class Vehicle {

    public void startEngine(){
    }

    public void arrayVehicle(){

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bicycle bicycle = new Bicycle();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();
        vehicles[2] = new Bicycle();

        for(int i = 0; i < vehicles.length; i++){
            vehicles[i].startEngine();
        }

    }

}
