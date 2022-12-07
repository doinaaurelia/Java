public class Laptop {
    private int ram;
    private int hd;
    private String os;
    private String color;
    private String processor;
    private int size;
    private float mass;
    private float price;

    public Laptop() {
        this.ram = 8;
        this.hd = 128;
        this.size = 13;
        this.mass = 2.5f;
        this.price = 60000.0f;
        this.color = "black";
        this.processor = "Intel Core i5";
        this.os = "Windows 10";
    }

    public Laptop(int ram, int hd, String os, String color,
            String processor, int size, float mass, float price) {
        this.ram = ram;
        this.hd = hd;
        this.size = size;
        this.mass = mass;
        this.price = price;
        this.color = color;
        this.processor = processor;
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public int getHd() {
        return hd;
    }

    public int getSize() {
        return size;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getProcessor() {
        return processor;
    }

    public float getMass() {
        return mass;
    }

    public float getPrice() {
        return price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [ram = " + ram + ", hd = " + hd + ", os = " + os + ", color = " + color + ", processor = "
                + processor
                + ", size = " + size + ", mass = " + mass + ", price = " + price + "]";
    }

}