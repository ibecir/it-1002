package ba.edu.ibu.week9.lectures.lambdas.classes;

import ba.edu.ibu.week9.lectures.lambdas.interfaces.Printable;
import ba.edu.ibu.week9.lectures.lambdas.interfaces.Readable;

public class Engine extends Component implements Printable, Readable {
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void read() {
        System.out.println("VRNNN");
    }

    @Override
    public String printMe(String prefix) {
        return prefix.concat(" IN THE ENGINE");
    }
}
