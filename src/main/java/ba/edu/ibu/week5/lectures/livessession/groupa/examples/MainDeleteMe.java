package ba.edu.ibu.week5.lectures.livessession.groupa.examples;

public class MainDeleteMe {
    static void main(String[] args) {
        Engine engine = new Engine("1.9 TDI", 2015, "DI Crveno", Producer.VW, 1.9, FuelType.DIESEL);

        Gearbox gearbox = new Gearbox("1.9 TDI", 2015, "DI Crveno", Producer.VW, 8, "Manual");

        System.out.println(engine);
        System.out.println(engine.getComponentAge());
        System.out.println(gearbox.getComponentAge());
    }
}
