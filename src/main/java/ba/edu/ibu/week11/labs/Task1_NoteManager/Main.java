package ba.edu.ibu.week11.labs.Task1_NoteManager;

public class Main {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();

        manager.saveNote("Prepare Java lab materials.");
        manager.saveNote("");
        manager.saveNote(null);
        manager.saveNote("OK");

        String[] notes = {
                "Review iterator examples.",
                "",
                "Prepare file manipulation exercise.",
                null,
                "Create JUnit tests."
        };

        manager.saveAllNotes(notes);

        System.out.println("Saved notes:");
        manager.printAllNotes();
        System.out.println("Total notes: " + manager.countNotes());
    }
}
