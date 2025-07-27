package oops;

import java.util.*;

// Abstract Class (Abstraction)
abstract class Order {
    private String orderId;
    private String date;
    private String status;
    private int itemCount;
    private double baseAmount;

    public Order(String orderId, String date, String status, int itemCount, double baseAmount) {
        this.orderId = orderId;
        this.date = date;
        this.status = status;
        this.itemCount = itemCount;
        this.baseAmount = baseAmount;
    }

    public abstract double calculateTotal(); // Polymorphism

    public void displayOrder() {
        if (itemCount == 0) {
            System.out.println("Order ID: " + orderId + " | No items in this order.");
            return;
        }
        System.out.println("Order ID     : " + orderId);
        System.out.println("Date         : " + date);
        System.out.println("Status       : " + status);
        System.out.println("Item Count   : " + itemCount);
        System.out.println("Base Amount  : ₹" + baseAmount);
        System.out.printf("Total Amount : ₹%.2f\n", calculateTotal());
        System.out.println("----------------------------------");
    }

    public String getOrderId() {
        return orderId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getBaseAmount() {
        return baseAmount;
    }
}

// Online Order (Inheritance)
class OnlineOrder extends Order {
    public OnlineOrder(String orderId, String date, String status, int itemCount, double baseAmount) {
        super(orderId, date, status, itemCount, baseAmount);
    }

    public double calculateTotal() {
        double itemTotal = getItemCount() * getBaseAmount();
        double deliveryCharge = 0.10 * itemTotal;
        double gst = 0.05 * (itemTotal + deliveryCharge);
        return itemTotal + deliveryCharge + gst;
    }
}

// In-Store Order (Inheritance)
class InStoreOrder extends Order {
    public InStoreOrder(String orderId, String date, String status, int itemCount, double baseAmount) {
        super(orderId, date, status, itemCount, baseAmount);
    }

    public double calculateTotal() {
        double itemTotal = getItemCount() * getBaseAmount();
        double discount = 0.15 * itemTotal;
        double gst = 0.05 * (itemTotal - discount);
        return itemTotal - discount + gst;
    }
}

// Subscription Order (Inheritance)
class SubscriptionOrder extends Order {
    public SubscriptionOrder(String orderId, String date, String status, int itemCount, double baseAmount) {
        super(orderId, date, status, itemCount, baseAmount);
    }

    public double calculateTotal() {
        return getItemCount() * 100;
    }
}

// Customer Class (Encapsulation + CRUD)
class Customer {
    private String customerId;
    private String name;
    private String email;
    private ArrayList<Order> orders;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = isValidEmail(email) ? email : "invalid@example.com";
        this.orders = new ArrayList<>();
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public void addOrder(Order order) {
        if (order.getItemCount() > 10) {
            System.out.println("❌ Booking Failed: Cannot order more than 10 items.");
        } else {
            orders.add(order);
            System.out.println("✅ Order added successfully.");
        }
    }
    public void displayAllOrders() {
        System.out.println("\n======= Customer Details =======");
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Name          : " + name);
        System.out.println("Email         : " + email);

        if (orders.isEmpty()) {
            System.out.println("No Orders Found.");
        } else {
            System.out.println("------- Order History ---------");
            for (Order order : orders) {
                order.displayOrder();
            }
        }
        System.out.println("=================================\n");
    }

    public void updateOrder(String orderId, Scanner sc) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                System.out.print("Enter new status: ");
                String status = sc.nextLine();
                System.out.print("Enter new item count: ");
                int count = sc.nextInt();
                sc.nextLine(); // flush newline

                if (count <= 10) {
                    order.setStatus(status);
                    order.setItemCount(count);
                    System.out.println("✅ Order updated.");
                } else {
                    System.out.println("❌ Cannot update. Item count > 10.");
                }
                return;
            }
        }
        System.out.println("❌ Order ID not found.");
    }

    public void deleteOrder(String orderId) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderId().equals(orderId)) {
                iterator.remove();
                System.out.println("✅ Order deleted.");
                return;
            }
        }
        System.out.println("❌ Order ID not found.");
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Main App (Interface + Menu)
public class CustomerOrderCRUDApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Customer> customers = new HashMap<>();

        while (true) {
            System.out.println("===== Customer Order System =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Order");
            System.out.println("3. Display Customer Orders");
            System.out.println("4. Update Order");
            System.out.println("5. Cancel Order");
            System.out.println("6. Exit");
            System.out.println("7. Show All Customers");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String cid = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    customers.put(cid, new Customer(cid, name, email));
                    System.out.println("✅ Customer added.");
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    cid = sc.nextLine();
                    Customer customer = customers.get(cid);
                    if (customer == null) {
                        System.out.println("❌ Customer not found.");
                        break;
                    }

                    System.out.print("Enter Order ID: ");
                    String oid = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    System.out.print("Enter Item Count: ");
                    int count = sc.nextInt();
                    System.out.print("Enter Base Amount: ");
                    double base = sc.nextDouble();
                    sc.nextLine(); // flush

                    System.out.print("Enter Order Type (1: Online, 2: InStore, 3: Subscription): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    Order order = null;
                    if (type == 1) order = new OnlineOrder(oid, date, status, count, base);
                    else if (type == 2) order = new InStoreOrder(oid, date, status, count, base);
                    else if (type == 3) order = new SubscriptionOrder(oid, date, status, count, base);
                    else {
                        System.out.println("❌ Invalid Order Type.");
                        break;
                    }
                    customer.addOrder(order);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    cid = sc.nextLine();
                    customer = customers.get(cid);
                    if (customer != null)
                        customer.displayAllOrders();
                    else
                        System.out.println("❌ Customer not found.");
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    cid = sc.nextLine();
                    customer = customers.get(cid);
                    if (customer != null) {
                        System.out.print("Enter Order ID to update: ");
                        String updateId = sc.nextLine();
                        customer.updateOrder(updateId, sc);
                    } else
                        System.out.println("❌ Customer not found.");
                    break;

                case 5:
                    System.out.print("Enter Customer ID: ");
                    cid = sc.nextLine();
                    customer = customers.get(cid);
                    if (customer != null) {
                        System.out.print("Enter Order ID to delete: ");
                        String deleteId = sc.nextLine();
                        customer.deleteOrder(deleteId);
                    } else
                        System.out.println("❌ Customer not found.");
                    break;

                case 6:
                    System.out.println("👋 Exiting. Thank you!");
                    sc.close();
                    System.exit(0);

                case 7:
                    if (customers.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        System.out.println("\n===== All Customers =====");
                        for (Customer c : customers.values()) {
                            System.out.println("Customer ID : " + c.getCustomerId());
                            System.out.println("Name        : " + c.getName());
                            System.out.println("Email       : " + c.getEmail());
                            System.out.println("------------------------------");
                        }
                        System.out.println("Total Customers: " + customers.size());
                        System.out.println("=============================\n");
                    }
                    break;

                default:
                    System.out.println("❌ Invalid option.");
            }
        }
    }
}
