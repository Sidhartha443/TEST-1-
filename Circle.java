// class Circle {
//     private double radius;

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public double getArea() {
//         return Math.PI * radius * radius;
//     }

//     public double getCircumference() {
//         return 2 * Math.PI * radius;
//     }

//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.setRadius(6.0);
//         System.out.println("Radius: " + c.getRadius());
//         System.out.println("Area: " + c.getArea());
//         System.out.println("Circumference: " + c.getCircumference());
//     }
// }

// class SimpleInterest {
//     private double principal, time, rate;

//     public void setPrincipal(double principal) {
//         this.principal = principal;
//     }

//     public void setTime(double time) {
//         this.time = time;
//     }

//     public void setRate(double rate) {
//         this.rate = rate;
//     }

//     public double getPrincipal() {
//         return principal;
//     }

//     public double getTime() {
//         return time;
//     }

//     public double getRate() {
//         return rate;
//     }

//     // Method to calculate Simple Interest
//     public double calculateInterest() {
//         return (principal * time * rate) / 100;
//     }

//     public static void main(String[] args) {
//         SimpleInterest si = new SimpleInterest();
//         si.setPrincipal(4000);
//         si.setTime(6);
//         si.setRate(10);

//         System.out.println("Principal: " + si.getPrincipal());
//         System.out.println("Time: " + si.getTime());
//         System.out.println("Rate: " + si.getRate());
//         System.out.println("Simple Interest: " + si.calculateInterest());
//     }
// }



// class Book {
//     private String title;
//     private String author;
//     private int year;
//     private boolean available;

//     public Book(String title, String author, int year) {
//         this.title = title;
//         this.author = author;
//         this.year = year;
//         this.available = true;
//     }

//     public boolean isAvailable() {
//         return available;
//     }

//     public void borrowBook() {
//         if (available) available = false;
//     }

//     public void returnBook() {
//         available = true;
//     }

//     public String getDetails() {
//         return title + " by " + author + " (" + year + ")";
//     }

//     public static void main(String[] args) {
//         Book b = new Book("Atomic Habits", "James Clear", 2018);
//         System.out.println(b.getDetails() + " - Available: " + b.isAvailable());
//         b.borrowBook();
//         System.out.println("After Borrowing - Available: " + b.isAvailable());
//     }
// }




// class Employee {
//     private String name;
//     private String jobTitle;
//     private double salary;

//     public Employee(String name, String jobTitle, double salary) {
//         this.name = name;
//         this.jobTitle = jobTitle;
//         this.salary = salary;
//     }

//     public void updateSalary(double amount) {
//         if (amount > 0) {
//             salary += amount;
//         }
//     }

//     public void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Job Title: " + jobTitle);
//         System.out.println("Salary: " + salary);
//     }

//     public static void main(String[] args) {
//         Employee emp = new Employee("Sidhartha Sah", "Ai Engineer", 600000);
//         emp.updateSalary(6000);
//         emp.displayDetails();
//     }
// }



// ENCAPSULATION TASKS

// class Product {
//     private String productName;
//     private String productId;
//     private double price;
//     private int stockQuantity;

  
//     public Product(String productName, String productId, double price, int stockQuantity) {
//         this.productName = productName;
//         this.productId = productId;
//         setPrice(price); 
//         this.stockQuantity = stockQuantity;
//     }


//     public String getProductName() {
//         return productName;
//     }

//     public String getProductId() {
//         return productId;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getStockQuantity() {
//         return stockQuantity;
//     }


//     public void setProductName(String productName) {
//         this.productName = productName;
//     }

//     public void setProductId(String productId) {
//         this.productId = productId;
//     }

//     public void setPrice(double price) {
//         if (price >= 0) {
//             this.price = price;
//         } else {
//             System.out.println("Error: Price cannot be negative.");
//         }
//     }

//     public void purchaseProduct(int quantity) {
//         if (quantity <= 0) {
//             System.out.println("Error: Quantity must be positive.");
//         } else if (quantity > stockQuantity) {
//             System.out.println("Error: Not enough stock available.");
//         } else {
//             stockQuantity -= quantity;
//             System.out.println("Purchase Successfully. " + quantity + " units sold.");
//         }
//     }

//     public void restockProduct(int quantity) {
//         if (quantity <= 0) {
//             System.out.println("Error: Restock quantity must be positive.");
//         } else {
//             stockQuantity += quantity;
//             System.out.println("Restocked Successfully. " + quantity + " units added.");
//         }
//     }


//     public void displayProductInfo() {
//         System.out.println("Product Name: " + productName);
//         System.out.println("Product ID: " + productId);
//         System.out.println("Price: $" + price);
//         System.out.println("Stock Quantity: " + stockQuantity);
//     }

  
//     public static void main(String[] args) {
//         Product product = new Product("ACER PREDATOR", "E4739GH8930", 200000, 10);

//         product.displayProductInfo();

   
//         product.purchaseProduct(5);
//         product.purchaseProduct(15); 

       
//         product.restockProduct(20);

      
//         product.setPrice(-10); 
//         product.setPrice(157000);

//         System.out.println("\n... Final Product Info ...");
//         product.displayProductInfo();
//     }
// }


// class BankAccount {
//     private String accountNumber;
//     private String accountHolderName;
//     private double accountBalance;

    
//     public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         if (initialBalance >= 0) {
//             this.accountBalance = initialBalance;
//         } else {
//             System.out.println("Initial balance cannot be negative. Setting to 0.");
//             this.accountBalance = 0;
//         }
//     }

//     public double getAccountBalance() {
//         return accountBalance;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public void setAccountHolderName(String accountHolderName) {
//         this.accountHolderName = accountHolderName;
//     }

   
//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             accountBalance += amount;
//             System.out.println("Deposited $" + amount + " successfully.");
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= accountBalance) {
//             accountBalance -= amount;
//             System.out.println("Withdrew $" + amount + " successfully.");
//         } else {
//             System.out.println("Invalid or insufficient funds for withdrawal.");
//         }
//     }

//     public void displayAccountInfo() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolderName);
//         System.out.println("Account Balance: $" + accountBalance);
//     }


//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("ECC378399", "Suraj Sah", 111500.0);

//         account.displayAccountInfo();

//         account.deposit(10000.0);
//         account.withdraw(1500.0);
//         account.withdraw(800.0); 

//         System.out.println("\n--- Updated Account Info ---");
//         account.displayAccountInfo();
//     }
// }


// class Book {
//     private String title;
//     private String author;
//     private int publicationYear;
//     private boolean isAvailable;  
//     public Book(String title, String author, int year) {
//         this.title = title;
//         this.author = author;
//         this.publicationYear = year;
//         this.isAvailable = true; 
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public int getPublicationYear() {
//         return publicationYear;
//     }

//     public void setPublicationYear(int year) {
//         this.publicationYear = year;
//     }

//     public boolean isAvailable() {
//         return isAvailable;
//     }

//     public void borrowBook() {
//         if (isAvailable) {
//             isAvailable = false;
//             System.out.println("You have successfully borrowed \"" + title + "\".");
//         } else {
//             System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
//         }
//     }

//     public void returnBook() {
//         isAvailable = true;
//         System.out.println("Thank you for returning \"" + title + "\".");
//     }

//     public void displayInfo() {
//         System.out.println("Book: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Year: " + publicationYear);
//         System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
//     }

//     public static void main(String[] args) {
//         Book book = new Book("Atomic Habits", "James Clear", 2015);
//         book.displayInfo();

//         book.borrowBook(); 
//         book.displayInfo(); 

//         book.borrowBook(); 

//         book.returnBook(); 
//         book.displayInfo(); 
//     }
// }


// class Student {
//     private String name;
//     private String idNumber;
//     private double gpa;  

//     public Student(String name, String idNumber, double gpa) {
//         this.name = name;
//         this.idNumber = idNumber;
//         this.gpa = gpa;
//     }


//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getIdNumber() {
//         return idNumber;
//     }

//     public void setIdNumber(String idNumber) {
//         this.idNumber = idNumber;
//     }

//     public double getGpa() {
//         return gpa;
//     }

//     public void displayStudentInfo() {
//         System.out.println("Student Name: " + name);
//         System.out.println("ID Number: " + idNumber);
//         System.out.println("GPA: " + gpa);
//     }

//     public static void main(String[] args) {
//         Student student = new Student("Suraj sah", "w89494", 4.00);

//         student.displayStudentInfo();

        
//         student.setName("Sidhartha Sah");
//         student.setIdNumber("240583");
        
//         System.out.println("\n... Updated Information ...");
//         student.displayStudentInfo();

    
//     }
// }


// class Employee {
//     private String name;
//     private String employeeId;
//     private double salary;
//     public Employee(String name, String employeeId, double salary) {
//         this.name = name;
//         this.employeeId = employeeId;
//         if (salary >= 0) {
//             this.salary = salary;
//         } else {
//             System.out.println("Invalid  salary. Setting salary to 0.");
//             this.salary = 0;
//         }
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmployeeId() {
//         return employeeId;
//     }

//     public void setEmployeeId(String employeeId) {
//         this.employeeId = employeeId;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void adjustSalary(double amount) {
//         if (salary + amount >= 0) {
//             salary += amount;
//             System.out.println("Salary Adjust Successfully. New salary: " + salary);
//         } else {
//             System.out.println("Error: Salary cannot be negative. Adjustment Canceled.");
//         }
//     }

//     public void displayEmployeeInfo() {
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee ID: " + employeeId);
//         System.out.println("Salary: " + salary);
//     }

//     public static void main(String[] args) {
//         Employee emp = new Employee("Aayush Kharel", "E98383", 150000.0);

//         emp.displayEmployeeInfo();

//         emp.setName("Aayush Kharrel");
//         emp.setEmployeeId("E98383");

//         emp.adjustSalary(15000);   
//         emp.adjustSalary(-6000); 

//         System.out.println("\n... Updated Employee Information ...");
//         emp.displayEmployeeInfo();
//     }
// }


// class Car {
//     private final String make;               
//     private final String model;              
//     private double rentalPricePerDay;
//     private boolean isAvailable;

//     public Car(String make, String model, double rentalPricePerDay) {
//         this.make = make;
//         this.model = model;
//         this.rentalPricePerDay = rentalPricePerDay;
//         this.isAvailable = true;  
//     }
//     public String getMake() {
//         return make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public double getRentalPricePerDay() {
//         return rentalPricePerDay;
//     }

//     public boolean isAvailable() {
//         return isAvailable;
//     }

//     public void setRentalPricePerDay(double rentalPricePerDay) {
//         if (rentalPricePerDay >= 0) {
//             this.rentalPricePerDay = rentalPricePerDay;
//         } else {
//             System.out.println("Rental price cannot be negative.");
//         }
//     }

//     public void rentCar() {
//         if (isAvailable) {
//             isAvailable = false;
//             System.out.println("Car Rented Successfully.");
//         } else {
//             System.out.println("Car is already rented.");
//         }
//     }

//     public void returnCar() {
//         if (!isAvailable) {
//             isAvailable = true;
//             System.out.println("Car Returned Successfully.");
//         } else {
//             System.out.println("Car is already available.");
//         }
//     }


//     public void displayCarInfo() {
//         System.out.println("Car Make: " + make);
//         System.out.println("Car Model: " + model);
//         System.out.println("Rental Price per Day: " + rentalPricePerDay);
//         System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
//     }


//     public static void main(String[] args) {
//         Car car = new Car("BMW", "Sedan", 10000);

//         car.displayCarInfo();

       
//         car.rentCar();
//         car.rentCar(); 

        
//         car.returnCar();
//         car.returnCar(); 

//         System.out.println("\n... Final Car Status ...");
//         car.displayCarInfo();
//     }
// }


