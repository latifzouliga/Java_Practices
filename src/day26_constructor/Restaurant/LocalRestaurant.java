package day26_constructor.Restaurant;


import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restOwner = new Restaurant("Abdellatif", "Pittsburgh", 5);

        // servers info
        Server server1 = new Server("Khalid", 154, 15, true, LocalDate.of(2015, 1, 24));
        Server server2 = new Server("Hamid", 25, 15, false, LocalDate.of(2018, 6, 14));
        Server server3 = new Server("Morad", 47, 15, true, LocalDate.of(2018, 11, 4));
        Server server4 = new Server("Khadija", 78, 15, true, LocalDate.of(2019, 3, 12));
        Server server5 = new Server("Najat", 93, 15, false, LocalDate.of(2018, 8, 3));
        Server server6 = new Server("Karima", 82, 15, true, LocalDate.of(2018, 9, 2));

        // chefs info
        Server chef1 = new Server("Ahmad", 104, 20, true, LocalDate.of(2016, 3, 3));
        Server chef2 = new Server("Maryam", 124, 22, true, LocalDate.of(2017, 6, 4));
        Server chef3 = new Server("Karim", 141, 25, true, LocalDate.of(2015, 11, 11));

        // list of servers
        Server[] serversList = {server1, server2, server3, server4, server5, server6};
        // list of chefs
        Server[] chefList = {chef1,chef2,chef3};


        // hiring new server
        restOwner.hireServer(new Server("Latif", 223, 14, true, LocalDate.of(2017, 7, 12)));
        // hiring couple  servers
        restOwner.hireServers(serversList);

        //hiring couple  chefs
        restOwner.hireChefs(chefList);

        // hiring another chef
        restOwner.hireChef(new Server("Khalid",321,17,true,LocalDate.of(2020,12,12)));

        // all the servers
        System.out.println("All the servers");
        for (Server each : restOwner.Servers) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        // all the chefs
        System.out.println("All the chefs");
        for (Server each : restOwner.chefs) {
            System.out.println(each);
        }
        // firing one chef

        restOwner.terminateChef(104);

        // firing couple servers
        //restOwner.Servers.removeIf(p -> p.id == 25 || p.id == 78 || p.id == 82);
        restOwner.terminateServer(25);
        restOwner.terminateServer(78);
        restOwner.terminateServer(82);

        System.out.println("-----------------------------------------------------------------------------------------");

        // the owner name and all restaurant employees
        System.out.println("The owner is: "+restOwner.owner);

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Number of servers: "+restOwner.Servers.size());

        for (Server each : restOwner.Servers) {
            System.out.println(each.name);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Number of chefs: "+restOwner.chefs.size());

        for (Server each : restOwner.chefs) {
            System.out.println(each.name);
        }
        // servers actions
        server6.takeOrder();
        server2.cleanTable();
        server2.paidBy(restOwner.owner);


    }


}

/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object

	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList
	        	of Servers in the Restaurant object

	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of
	             Chefs in the Restaurant object

	            - Print your whole restaurants information
 */