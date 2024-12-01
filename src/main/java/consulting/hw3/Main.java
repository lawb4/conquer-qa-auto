package consulting.hw3;

import consulting.hw3.objects.Customer;
import consulting.hw3.objects.Item;
import consulting.hw3.objects.Order;

/*Интернет-магазин:
1. Товары
2. Корзина
3. Клиент
4. Заказ

Взаимодействие:
Клиент - добавляет в корзину товары, удаляет из корзины
Клиент - формирование заказа, оплата (из корзины)
Заказ - переход в статус «Оплачен»

Отношение:
Товары - отдельная сущность
Корзина - множество товаров (измененное) при трансформации из Корзины в заказ - корзина обнуляется
Клиент: корзина, множество заказов, после обнуления корзины (оплаты заказа) добавляется заказ.*/
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Aleksandr");
        System.out.println(customer);

        Item item1 = new Item("Хлеб чёрный зернистый 0.5кг", 1.75);
        Item item2 = new Item("Молоко 3.6% 0.9л", 2.16);
        Item item3 = new Item("Cгущёнка 'Егорка' 0.2кг", 4.99);

        System.out.println("\nAdding items to cart...");
        customer.addItem(item1, 1);
        customer.addItem(item2, 2);
        customer.addItem(item3, 1);

        System.out.println("Items added. Here's the items in the cart:");
        customer.printCartItems();

        System.out.printf("\nActually, we don't need this '%s' item. Let's remove it!", item3.getName());
        System.out.printf("\nRemoving 1 '%s'...\n", item3.getName());
        customer.removeItem(item3, 1);

        System.out.println("\nHere's the updated list of items in the cart:");
        customer.printCartItems();

        System.out.println("\nCreating an order and calculating the total price...");
        Order order = customer.createOrder();
        System.out.printf("Order: %s, status: %s\n", order.getId(), order.getStatus());
        System.out.printf("Total price is: %.2f\n", order.getTotalPrice());

        System.out.println("\nPaying the order...");
        customer.payOrder(order);
        System.out.print("Order is paid: ");
        System.out.printf("Order: %s, status: %s\n", order.getId(), order.getStatus());
    }
}
