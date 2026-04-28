package ba.edu.ibu.week9.livesession.groupa;

import java.util.Optional;

record Wolf(String name) { }

class MainRunMePlease {
    static void main(String[] args) {
        Optional<Wolf> vucko = MainRunMePlease.getInstance();

        if (vucko.isPresent())
            System.out.println(vucko.get().name());
    }

    public static Optional<Wolf> getInstance() {
        return Optional.ofNullable(null);
    }
}
