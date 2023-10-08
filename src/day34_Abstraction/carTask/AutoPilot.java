package day34_Abstraction.carTask;


// autoPilot is a sub class of AutoPark interface
public interface AutoPilot extends AutoPark{

    boolean hasAutoPilot = true;   // access modifier and specifier are given implicitly

    void selfDrive(); // abstract method, access modifier and specifier are given implicitly

    @Override
    void autoPark();
}

    /*
3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
 */