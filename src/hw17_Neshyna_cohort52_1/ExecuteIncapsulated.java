package hw17_Neshyna_cohort52_1;

public class ExecuteIncapsulated {
    public static void main(String[] args) {

        IncapsulatedArray incapsulatedArray = new IncapsulatedArray();

        incapsulatedArray.setMultipleValues(0,1,2,3,4,9,5,6,7,8,9);

        System.out.println(incapsulatedArray.getPrintedArray());

        incapsulatedArray.setValue(10);

        System.out.println(incapsulatedArray.getPrintedArray());

        System.out.println("get value by index: " + incapsulatedArray.getValue(4));

        System.out.println("get index by value: " + incapsulatedArray.getIndex(6));

        //set new value to an element
        incapsulatedArray.setNewValueToElement(13, 0);
        System.out.println(incapsulatedArray.getPrintedArray());

        System.out.println("get last index of the value: " + incapsulatedArray.getLastIndexOf(9));

        System.out.println("get first index of the value: " + incapsulatedArray.getFirstIndex(9));

        System.out.println("get size: " + incapsulatedArray.getSize());








    }
}
