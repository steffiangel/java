import java.util.*;

class Customer {
    int custid;
    String cname;
    String address;
    int contact;
    String prodpref; // Corrected variable name

    public Customer(int customerId, String name, String address, int contact, String pref) {
        this.custid = customerId;
        this.cname = name;
        this.address = address;
        this.contact = contact;
        this.prodpref = pref;
    }
}

class Product {
    int productid;
    String pname;
    int prating;

    public Product(int pid, String pname, int prate) {
        this.productid = pid;
        this.pname = pname;
        this.prating = prate;
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

class AmazonCRMSystem {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Order> orderList = new ArrayList<>();

        HashMap<String, Product> productMap = new HashMap<>();
        HashMap<Integer, Customer> customerMap = new HashMap<>(); // Changed key to Integer (custid)

        HashMap<Customer, HashSet<Product>> customerProductMap = new HashMap<>();

        Customer customer1 = new Customer(1, "Joel", "CHENNAI", 90234536, "BOOKS");
        customerList.add(customer1);
        customerMap.put(customer1.custid, customer1);

        Product product1 = new Product(1, "Laptop", 4);
        productList.add(product1);
        productMap.put(Integer.toString(product1.productid), product1);

        customerProductMap.put(customer1, new HashSet<>());
        customerProductMap.get(customer1).add(product1);

        Order order1 = new Order("O001", customer1);
        order1.addProduct(product1);
        orderList.add(order1);

        System.out.println("Customer Name: " + customerMap.get(1).cname); // Accessing customer by custid
        System.out.println("Product Name: " + productMap.get("1").pname); // Accessing product by productid
    }
}