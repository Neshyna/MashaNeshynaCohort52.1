package homework3_Neshyna_12September;

public class Task3 {


    /*
    Task 3 * (Опционально)
Пусть цена товара A составляет 1000 Euro,
а товара B составляет 500 Euro.

Если клиент покупает товары вместе,
то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной,
которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки
для этой покупки (в деньгах).
     */
    public static void main(String[] args) {

        double priceA = 1000;
        double priceB = 500;

        int discount = 10; //%

        double discountMoney = (priceA + priceB) * discount / 100;

        double priceWithDiscount = priceA + priceB - discountMoney;

        System.out.println("discountMoney:" +discountMoney);
        System.out.println("priceWithDiscount:"+ priceWithDiscount);

    }
}
