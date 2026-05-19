package ba.edu.ibu.week12.lectures.builder;

class Car {
    // 1.
    private String brand;
    private int yearOfManufacturing;
    private boolean ac;
    private boolean sunRoof;
    private String selfDriving;

    // 2.
    public boolean isAc() {
        return ac;
    }
    public String getBrand() {
        return brand;
    }
    public String getSelfDriving() {
        return selfDriving;
    }
    public boolean isSunRoof() {
        return sunRoof;
    }
    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    // 6.a
    public Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.yearOfManufacturing = builder.yearOfManufacturing;
        this.ac = builder.ac;
        this.sunRoof = builder.sunRoof;
        this.selfDriving = builder.selfDriving;
    }

    // 3.
    public static class CarBuilder {
        private String brand;
        private int yearOfManufacturing;
        private boolean ac;
        private boolean sunRoof;
        private String selfDriving;

        // 4.
        public CarBuilder(String brand, int yearOfManufacturing) {
            this.brand = brand;
            this.yearOfManufacturing = yearOfManufacturing;
        }

        // 5.
        public CarBuilder setAc(boolean ac) {
            this.ac = ac;
            return this;
        }
        public CarBuilder setSelfDriving(String selfDriving) {
            this.selfDriving = selfDriving;
            return this;
        }
        public CarBuilder setSunRoof(boolean sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        // 6.b
        public Car build() {
            return new Car(this);
        }
    }
}

class MainRunMePlease {
    static void main(String[] args) {
        Car myCar = new Car.CarBuilder("BMW", 1994).build();
        Car farisBmw = new Car.CarBuilder("BMW", 2026)
                .setAc(true)
                .setSelfDriving("Latest one")
                .setSunRoof(true)
                .build();
    }
}
