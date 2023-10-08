package day29_Encapsulation.employee;

public class Developer extends Employee{

    private String progLang;



    public void setInfo(String name, char gender, int age, String jobTitle,String progLang, double salary) {
        super.setInfo(name, gender, age, jobTitle, salary);
        setProgLang(progLang);
    }

    public String getProgLang(){
        return progLang;
    }
    public void setProgLang(String progLang){

        switch (progLang){
            case "Java": case "JavaScript": case "Python": case "Ruby": case "C#": case "C++": case "Swift":
                break;
            default:
                System.err.println("Invalid programming language");
                System.exit(1);
        }

        this.progLang = progLang;
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }


    public String toString() {
        return super.toString()+
                " progLang='" + getProgLang() + '\'' +
                '}';
    }
}
