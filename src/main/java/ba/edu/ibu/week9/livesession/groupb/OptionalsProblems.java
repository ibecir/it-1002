package ba.edu.ibu.week9.livesession.groupb;

import java.util.Optional;

class OptionalsProblems {
    static void main(String[] args) {
        Wolf vucko = OptionalsProblems.getWolfByName("Vucko");
        if (vucko != null) // Ugly code
            System.out.println(vucko.name());

        Optional<Wolf> maybeWolf = OptionalsProblems.getWolfByNameOptional("Vucko");
        if(maybeWolf.isPresent())
            maybeWolf.get().name();

        if(!maybeWolf.isEmpty())
            maybeWolf.get().age();
    }

    public static Wolf getWolfByName(String name){
        return null;
    }

    public static Optional<Wolf> getWolfByNameOptional(String name){
        return Optional.of(new Wolf("Becir", 123));
    }
}

record Wolf(String name, int age) { }
