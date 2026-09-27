class Complex {
    double real;
    double imaginary;

    // Constructor to initialize complex number
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        Complex temp = new Complex(0, 0);
        temp.real = this.real + c.real;
        temp.imaginary = this.imaginary + c.imaginary;
        return temp;
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two complex objects
        Complex c1 = new Complex(3.5, 2.5);
        Complex c2 = new Complex(1.5, 4.5);

        // Adding them and storing result in another object
        Complex c3 = c1.add(c2);

        // Display all objects
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum of Complex Numbers: ");
        c3.display();
    }
}