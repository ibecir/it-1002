package ba.edu.ibu.week12.lectures.singleton;

public enum SingletonEnum {
    INSTANCE;

    public SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
