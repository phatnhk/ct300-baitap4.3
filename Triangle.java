public class Triangle {
    // Thuộc tính của tam giác
    private double a;
    private double b;
    private double c;

    // Constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức kiểm tra tam giác hợp lệ
    public boolean isValidTriangle() {
        return (a + b > c && a + c > b && b + c > a);
    }

    // Phương thức kiểm tra tam giác cân
    public boolean isIsoscelesTriangle() {
        if (isValidTriangle()) {
            return (a == b || b == c || a == c);
        }
        return false;
    }

    // Getter cho thông tin tam giác
    @Override
    public String toString() {
        return "Triangle(" + a + ", " + b + ", " + c + ")";
    }
}
