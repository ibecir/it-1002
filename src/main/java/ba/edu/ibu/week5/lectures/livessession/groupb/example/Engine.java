package ba.edu.ibu.week5.lectures.livessession.groupb.example;

class Engine extends Component{
    private double size;
    private int kw;

    public int getKw() {
        return kw;
    }
    public void setKw(int kw) {
        this.kw = kw;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public Engine(String date, String id, Producer producer, double size, int kw) {
        super(date, id, producer);
        this.size = size;
        this.kw = kw;
    }

    @Override
    public int componentAge() {
        return 15;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEngine{" +
                "kw=" + kw +
                ", size=" + size +
                '}';
    }
}
