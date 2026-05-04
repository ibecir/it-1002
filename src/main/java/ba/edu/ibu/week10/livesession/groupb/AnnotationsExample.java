package ba.edu.ibu.week10.livesession.groupb;

class Parent {
    @Deprecated
    public String getName() {
        return "Parent";
    }
}
class Child extends Parent {
    @Override
    public String getName() {
        return "Child";
    }
}

class MainA {
    static void main(String[] args) {
        Parent p = new Parent();
        p.getName();
    }
}

