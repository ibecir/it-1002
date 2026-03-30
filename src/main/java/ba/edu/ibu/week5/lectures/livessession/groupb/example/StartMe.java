package ba.edu.ibu.week5.lectures.livessession.groupb.example;

public class StartMe {
    static void main(String[] args) {
        Engine engine = new Engine("2026-03-15", "12312312321dwe", Producer.BMW, 4.5, 300);
        System.out.println(engine);
        System.out.println(engine.componentAge());

        Gearbox gearbox = new Gearbox("2026-03-10", "21321321312", Producer.VW, 8);
        System.out.println(gearbox.componentAge());
    }
}
