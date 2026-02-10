class Task1 {
    static void saveUserAccount(String email, long phoneNum) {
        System.out.println("Email is: " + email);
        System.out.println("Number is: " + phoneNum);
    }
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome!");
    }
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
    static void multiplyNumbers(double x, double y) {
        double result = x * y;
        System.out.println(x + " × " + y + " = " + result);
    }
    static void checkAge(int age) {
        boolean isAdult = age >= 18;
        System.out.println("Age: " + age + ", Adult: " + isAdult);
    }
    static void displayFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
    static void calculateSquare(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }
    static void calculatePerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
    static void convertHoursToMinutes(int hours) {
        int minutes = hours * 60;
        System.out.println(hours + " hours = " + minutes + " minutes");
    }
    static void displayProduct(String productName, double price, int quantity) {
        double total = price * quantity;
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price + ", Quantity: " + quantity);
        System.out.println("Total: $" + total);
    }
    static void checkVotingEligibility(int age, boolean isCitizen) {
        boolean canVote = (age >= 18) && isCitizen;
        System.out.println("Can vote: " + canVote);
    }
    
    static void swapNumbers(int a, int b) {
        System.out.println("Before swap: a=" + a + ", b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a=" + a + ", b=" + b);
    }
    static void calculateDiscount(double originalPrice, double discountPercent) {
        double discountAmount = originalPrice * (discountPercent / 100);
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Original: $" + originalPrice);
        System.out.println("Discount: " + discountPercent + "% = $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);
    }
    static void displayStudentInfo(String name, int rollNo, String grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
    static void checkNumberSign(int number) {
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }
    
    public static void main(String[] args) {
        saveUserAccount("gunj@gmail.com", 8618913283L);
        greetUser("John");
        addNumbers(10, 20);
        multiplyNumbers(5.5, 2.0);
        checkAge(25);
        displayFullName("Alice", "Johnson");
        calculateSquare(8);
        calculatePerimeter(10, 5);
        convertHoursToMinutes(3);
        displayProduct("Laptop", 899.99, 2);
        checkVotingEligibility(20, true);
        swapNumbers(5, 10);
        calculateDiscount(100.0, 15.0);
        displayStudentInfo("Bob", 101, "A");
        checkNumberSign(-7);
    }
}