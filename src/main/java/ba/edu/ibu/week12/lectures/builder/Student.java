package ba.edu.ibu.week12.lectures.builder;

class Hotel {
    // 1. attributes definition
    private String name;
    private String address;
    private boolean pool;
    private boolean spa;

    // 2. create getters
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public boolean isPool() {
        return pool;
    }
    public boolean isSpa() {
        return spa;
    }

    public Hotel(HotelBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.pool = builder.pool;
        this.spa = builder.spa;
    }

    // 3. inner static class with all of the attributes copied from outer class
    public static class HotelBuilder {
        private String name;
        private String address;
        private boolean pool;
        private boolean spa;

        // 4. set the mandatory attributes in the constructor
        public HotelBuilder(String address, String name) {
            this.address = address;
            this.name = name;
        }

        // 5. setters returning inner class
        public HotelBuilder setPool(boolean pool) {
            this.pool = pool;
            return this;
        }
        public HotelBuilder setSpa(boolean spa) {
            this.spa = spa;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }
}

class MyBuilder {
    static void main(String[] args) {
        Hotel my1StarHotel = new Hotel.HotelBuilder("Francuske revolucije bb", "My hotel").build();
        Hotel goodOne = new Hotel.HotelBuilder("SDFgdfghj", "Hollywood")
                .setSpa(true)
                .setPool(true)
                .build();
    }
}
