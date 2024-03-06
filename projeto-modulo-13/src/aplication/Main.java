package aplication;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String clientName = scan.nextLine();

        System.out.print("Email: ");
        String clientEmail = scan.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = scan.next();

        Client client = new Client(
                clientName,
                clientEmail,
                LocalDate.parse(
                        clientBirthDate,
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                )
        );

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String orderStatus = scan.next();

        Order order = new Order(
                LocalDateTime.now(),
                OrderStatus.valueOf(
                        orderStatus.toUpperCase()
                )
        );

        System.out.print("How many items to this order? ");
        int itemsOrder = scan.nextInt();

        for (int i = 0; i < itemsOrder; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            scan.nextLine();

            System.out.print("Product name: ");
            String productName = scan.nextLine();

            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();

            System.out.print("Product quantity: ");
            int productQuantity = scan.nextInt();

            OrderItem orderItem = new OrderItem(
                new Product(productName, productPrice),
                productQuantity
            );

            order.addItem(orderItem);
        }

        client.clientOrder(order);

        System.out.println();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("ORDER SUMMARY");
        System.out.printf("Order momment: %s\n",
                client.getOrder().getMoment().format(format1)
        );
        System.out.println("Order status: " + client.getOrder().getStatus());
        System.out.printf("Client: %s (%s) - %s\n",
                client.getName(),
                client.getBirthDate().format(format2),
                client.getEmail()
        );
        System.out.println("Order items:");
        for (
            int i = 0;
            i < client.getOrder().getOrderItems().size();
            i++
        ) {
            System.out.println(client.getOrder().getOrderItems().get(i));
        }

        System.out.printf("Total price: $%.2f", client.getOrder().total());

        scan.close();
    }
}