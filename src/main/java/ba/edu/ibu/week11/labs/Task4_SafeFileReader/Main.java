package ba.edu.ibu.week11.labs.Task4_SafeFileReader;

public class Main {
    public static void main(String[] args) {
        SafeFileReader reader = new SafeFileReader();
        reader.printFirstLine("sample.txt");
        reader.printAllLines("sample.txt");
        reader.printFirstLine("missing.txt");
        reader.printFirstLine(null);
        reader.printLength("Java file reading");
        reader.printLength(null);
        reader.printWordCount("Java is useful for backend development");
        reader.printWordCount("");
        reader.printWordCount(null);
    }
}
