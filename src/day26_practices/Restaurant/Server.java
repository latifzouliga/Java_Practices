package day26_practices.Restaurant;

import java.time.LocalDate;

public class Server {


    public String name;
    public int id;
    public double hourlyRate ;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int id, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }


    public void cook(){
        System.out.println(name+ " is cooking food");
    }

    public void paidBy(String owner){


        System.out.println(owner + " paid "+ name);
    }


    public String toString() {


        return "Server(" +
                "name: " + name+","  +
                "  id: " + id+"," +
                "  hourlyRate: $" + hourlyRate +","+
                "  working: " + ((fullTime)?"fullTime":"partTime")+","+
                "  hire_date: " + hire_date +
                ')';
    }


}
/*
4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		4.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or
		                     "part-time"

 */