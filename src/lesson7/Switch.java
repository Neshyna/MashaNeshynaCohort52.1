package lesson7;

public class Switch {
    public static void main(String[] args) {

        int x = 7;

        if(x == 5){
            System.out.println("if: x = 5 ");
        }
        else if (x == 7) {
            System.out.println("if-else: x = 7");
        }
        else {
            System.out.println("smth different");
        }


        //compare variable with other variables
        switch (x){
            case 5:
                System.out.println("switch: x = 5");
                break;
            case 7:
                System.out.println("switch: x = 7");
                break;
            case 11:
                System.out.println("switch: x = 11");
                break;
            default:
                System.out.println("switch: smth different");
                //to execute only one case
                //если есть предопределенный список тогда лучше использовать напр дни недели
                //when break is not mentioned all true case and default are printed
        }
    }
}
