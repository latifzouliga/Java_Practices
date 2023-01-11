package day26_practices.Restaurant;


import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> Servers = new ArrayList<>();
    public ArrayList<Server> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    } // constructor

    public void hireServer(Server server) {
        this.Servers.add(server);
    } // add a server to the servers ArrayList

    public void hireServers(Server[] servers) {

        this.Servers.addAll(Arrays.asList(servers));
    } // add array list of servers to the ArrayList

    public void hireChef(Server Chef) {
        chefs.add(Chef);
    } // add chef to the chefs ArrayList

    public void hireChefs(Server[] Chefs) {
        this.chefs.addAll(Arrays.asList(Chefs));
    } // add an array of chefs to the ArrayList


    public void terminateChef(int EmployeeId) {
        chefs.removeIf(p -> p.id == EmployeeId);
    } // remove a chef from the ArrayList using the ID number


    public void terminateServer(int EmployeeId) {
        Servers.removeIf(p -> p.id == EmployeeId);
    } // remove a server from the ArrayList using his ID number

}

/*
4.3 Create a class called Restaurant


        Attributes:
        Owner (String), Location (String), numberOfStars (int)
        Servers (ArrayList of Server objects)
        Chefs (ArrayList of Chef objects)

        Add a constructor that sets the owner, location, and number of stars.

        Actions: (all void methods)

        hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
        hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

        hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

        hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

        terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

        terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

        toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of

         Servers or Chefs. Print the number of Servers and Chefs along side the other information


 */
