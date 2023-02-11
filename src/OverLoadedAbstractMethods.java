

public abstract class OverLoadedAbstractMethods {


    public abstract int count();
    public abstract int count(int num);
    public abstract int count(int num1, int num2);
    public abstract int count(String str, int num2);
    public abstract int count(double num1);


}

class latif extends OverLoadedAbstractMethods {

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(int num) {
        return 0;
    }

    @Override
    public int count(int num1, int num2) {
        return 0;
    }

    @Override
    public int count(String str, int num2) {
        return 0;
    }

    @Override
    public int count(double num1) {
        return 0;
    }
}

class nazar extends latif{

}