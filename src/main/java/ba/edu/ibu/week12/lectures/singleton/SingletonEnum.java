package ba.edu.ibu.week12.lectures.singleton;

public enum SingletonEnum {
    INSTANCE("");

    private String connectionString = "";

    SingletonEnum(String connectionString) {
        this.connectionString = connectionString;
    }

    public SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
