package app;

public class Customer {

    private final String name;
    private final String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public String toString() {
        return "Customer: " + name +
                ", phone " + phone;
    }
}
