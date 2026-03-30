package ba.edu.ibu.week5.lectures.livessession.groupb;

class Recap {
    private String date;

    public String getDate() {
        return this.date;
    }
    public void setDate(String dateSetVariable) {
        this.date = dateSetVariable;
    }

    public Recap() {
        this.date = "2026-03-30";
    }
    public Recap(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "You called me!";
    }
}

class RunMe {
    static void main(String[] args) {
        Recap recap = new Recap();
        System.out.println(recap);
    }
}
