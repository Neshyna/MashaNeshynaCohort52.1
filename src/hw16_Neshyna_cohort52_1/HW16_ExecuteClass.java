package hw16_Neshyna_cohort52_1;

public class HW16_ExecuteClass {
    public static void main(String[] args) {

        HW16_Task0 hw16Task0 = new HW16_Task0();

       //add element
        hw16Task0.addElement(8);
        hw16Task0.addElement(7);
        hw16Task0.addElement(9);

        //print array
        System.out.println(hw16Task0.printArray(hw16Task0.array));

        //search index of an element by index
        int value = 9;
        int index = hw16Task0.indexOf(value, hw16Task0.array);

        if (index >= 0){
        System.out.println("index of the element with value: " + value + " is: " + index);
        } else {
            System.out.println("index not found");
        }

        //search value by index
        System.out.println("valueOf method: " + hw16Task0.valueOf(2));

        //current number of array elements
        System.out.println("current number of array elements: " + hw16Task0.currentNumberOfElements());


       //add multiple elements
        hw16Task0.addMultipleElements(5,3,2,8,3,5,10,2);
        System.out.println("multiple add: " + hw16Task0.printArray(hw16Task0.array));

        //create magic array
        hw16Task0.magicArray();
        System.out.println("magic array created");

        hw16Task0.addElement(1);
        System.out.println("print new magic array" + hw16Task0.printArray(hw16Task0.array));


        //delete by index
        hw16Task0.removeByIndex(3);

        //delete by value
        hw16Task0.removeByValue(9);

        //last index of
        System.out.println("last index of" + hw16Task0.lastIndexOf(2));
    }
}
