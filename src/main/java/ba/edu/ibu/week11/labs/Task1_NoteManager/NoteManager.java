package ba.edu.ibu.week11.labs.Task1_NoteManager;

import java.io.*;

public class NoteManager {
    private static final String FILE_NAME = "notes.txt";

    public void saveNote(String note) {
        if (isInvalidNote(note)) {
            System.out.println("Invalid note. A valid note must not be null, empty, or shorter than 3 characters.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(note.trim());
            writer.newLine();
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving note: " + e.getMessage());
        }
    }

    public void saveAllNotes(String[] notes) {
        if (notes == null) {
            System.out.println("Invalid notes array. Nothing was saved.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, false))) {
            for (String note : notes) {
                if (!isInvalidNote(note)) {
                    writer.write(note.trim());
                    writer.newLine();
                }
            }
            System.out.println("All valid notes saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving notes: " + e.getMessage());
        }
    }

    public void printAllNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int lineNumber = 1;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
                found = true;
            }
            if (!found) {
                System.out.println("No notes found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("The notes file does not exist yet.");
        } catch (IOException e) {
            System.out.println("Could not read notes: " + e.getMessage());
        }
    }

    public int countNotes() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Could not count notes: " + e.getMessage());
        }
        return count;
    }

    private boolean isInvalidNote(String note) {
        return note == null || note.trim().isEmpty() || note.trim().length() < 3;
    }
}
