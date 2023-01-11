package day31_practices.statesTask;

public class TestStateObjects {

    public static void main(String[] args) {

        States states = new States("yy","bbbb","eee","rrr","Mike",2000000,12);

        System.out.println(states);

        States s2 = new States();

        System.out.println(s2);
        s2.setSenators("John John");
        System.out.println(s2);

        California california = new California("CA","Republican party","Desantos","John $ Mike",20000000,26);
        Florida florida = new Florida("FL","Democratic party","Neil","Keith & James",40000000,30);
        Texas texas = new Texas("TX","Republican party","Lucy","Ruby",10000000,20);
        Virginia virginia = new Virginia("VA","Democratic party","Hanna","Murata $ Nelson",2500000,15);

        System.out.println(california);
        System.out.println(florida);
        System.out.println(texas);
        System.out.println(virginia);

    }
}
