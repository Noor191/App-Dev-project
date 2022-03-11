
package javaapplication33;
public class Vehicle
{
  private String make; 
  private String color; 
  private int year;      
  private String model;   


  public Vehicle(String make, String color, int year, String model) {
    this.make = make;
    this.color = color;
    this.year = year;  
    this.model = model; 
  }

  public void printDetails() {
    System.out.println("Manufacturer: " + make);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
    System.out.println("Model: " + model);
  }
  
}


class Car extends Vehicle {

  private String bodyStyle;

  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() {  
    printDetails();         
    System.out.println("Body Style: " + bodyStyle);
  }
  
}
class Car extends Vehicle {

  private String bodyStyle;

  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model);  
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() {  
    printDetails();         
    System.out.println("Body Style: " + bodyStyle);
  }
  
}
class Boat extends Vehicle {

  private String bodyStyle;

  public Boat(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model); 
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() {  
    printDetails();         
    System.out.println("Body Style: " + bodyStyle);
  }
  
}

public class JavaApplication33
{
    public static void main(String[] args) {
      Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); 
    elantraSedan.carDetails();
    Car  sonataSedan = new Car("Sonata", "Red", 2019, "Sonata", "Sedan");
    sonataSedan.carDetails();
    }
    
}
