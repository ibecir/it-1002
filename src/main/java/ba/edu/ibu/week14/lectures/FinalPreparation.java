package ba.edu.ibu.week14.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum CaseFormatter {
    ORDINARY,
    UPPER_CASE,
    LOWER_CASE
}
enum NumberFormatter {
    COMMA,
    PERCENTAGE
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface WriteConcerns {
    CaseFormatter case_format() default CaseFormatter.ORDINARY;
    NumberFormatter number_format() default NumberFormatter.COMMA;
}

class Population {
    private int rank;
    @WriteConcerns(case_format = CaseFormatter.UPPER_CASE)
    private String code;
    private String country;
    @WriteConcerns(case_format = CaseFormatter.LOWER_CASE)
    private String continent;
    @WriteConcerns(number_format = NumberFormatter.COMMA)
    private int population2023;
    @WriteConcerns(number_format = NumberFormatter.COMMA)
    private int population2022;
    private int population2020;
    private double area;
    private int density;
    @WriteConcerns(number_format = NumberFormatter.PERCENTAGE)
    private double growthRate;
    @WriteConcerns(number_format = NumberFormatter.PERCENTAGE)
    private double worldPercentage;

    public int getRank() {
        return this.rank;
    }
    public String getCode() {
        return this.code;
    }
    public String getCountry() {
        return this.country;
    }
    public String getContinent() {
        return this.continent;
    }
    public int getPopulation2023() {
        return this.population2023;
    }
    public int getPopulation2022() {
        return this.population2022;
    }
    public int getPopulation2020() {
        return this.population2020;
    }
    public double getArea() {
        return this.area;
    }
    public int getDensity() {
        return this.density;
    }
    public double getGrowthRate() {
        return this.growthRate;
    }
    public double getWorldPercentage() {
        return this.worldPercentage;
    }

    public Population(PopulationBuilder builder) {
        this.rank = builder.rank;
        this.code = builder.code;
        this.country = builder.country;
        this.continent = builder.continent;
        this.population2023 = builder.population2023;
        this.population2022 = builder.population2022;
        this.population2020 = builder.population2020;
        this.area = builder.area;
        this.density = builder.density;
        this.growthRate = builder.growthRate;
        this.worldPercentage = builder.worldPercentage;
    }

    public static class PopulationBuilder {
        private int rank;
        private String code;
        private String country;
        private String continent;
        private int population2023;
        private int population2022;
        private int population2020;
        private double area;
        private int density;
        private double growthRate;
        private double worldPercentage;

        public PopulationBuilder() {}

        public PopulationBuilder setRank(int rank) {
            this.rank = rank;
            return this;
        }
        public PopulationBuilder setCode(String code) {
            this.code = code;
            return this;
        }
        public PopulationBuilder setCountry(String country) {
            this.country = country;
            return this;
        }
        public PopulationBuilder setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public PopulationBuilder setPopulation2023(int population2023) {
            this.population2023 = population2023;
            return this;
        }
        public PopulationBuilder setPopulation2022(int population2022) {
            this.population2022 = population2022;
            return this;
        }
        public PopulationBuilder setPopulation2020(int population2020) {
            this.population2020 = population2020;
            return this;
        }
        public PopulationBuilder setArea(double area) {
            this.area = area;
            return this;
        }
        public PopulationBuilder setDensity(int density) {
            this.density = density;
            return this;
        }
        public PopulationBuilder setGrowthRate(double growthRate) {
            this.growthRate = growthRate;
            return this;
        }
        public PopulationBuilder setWorldPercentage(double worldPercentage) {
            this.worldPercentage = worldPercentage;
            return this;
        }
        public Population build() {
            return new Population(this);
        }
    }
}

class WrongFormatException extends RuntimeException {
    public WrongFormatException(String message) {
        super(message);
    }
    public WrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}

class SecondFinal {
    private List<Population> populations;

    public SecondFinal(String filename) {
        this.populations = loadPopulations(filename);
    }

    private static List<Population> loadPopulations(String filename) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(filename)
            );

            List<String> lines = reader.lines().collect(Collectors.toList());
            List<Population> populations = new ArrayList<>();
            for (int i = 1; i < lines.size(); i++) {
                String[] tmpLine = lines.get(i).split(";");
                if(tmpLine[0] == "" || tmpLine[1] == "" || tmpLine[2] == "")
                    throw new WrongFormatException("Values cannot be empty", new ClassCastException("Values are empty"));

                populations.add(
                        new Population.PopulationBuilder()
                                .setRank(Integer.parseInt(tmpLine[0]))
                                .setCode(tmpLine[1])
                                .setCountry(tmpLine[2])
                                .setContinent(tmpLine[3])
                                .setPopulation2023(Integer.parseInt(tmpLine[4]))
                                .setPopulation2022(Integer.parseInt(tmpLine[5]))
                                .setPopulation2020(Integer.parseInt(tmpLine[6]))
                                .setArea(Double.parseDouble(tmpLine[7]))
                                .setDensity(Integer.parseInt(tmpLine[8]))
                                .setGrowthRate(Double.parseDouble(tmpLine[9].substring(0, tmpLine[9].length() - 1)))
                                .setWorldPercentage(Double.parseDouble(tmpLine[10].substring(0, tmpLine[10].length() - 1)))
                            .build()
                );
            }
            return populations;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Population> getPopulations() {
        return this.populations;
    }
}

class CustomFileWriter {
    public static void writeReport(String outputFileName, List<Population> populations) {
        Class<?> clazz = Population.class;
        Field[] fields = clazz.getDeclaredFields();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            for(int i = 0; i < fields.length; i++) {
                writer.write(fields.length - 1 == i ?
                        fields[i].getName().toUpperCase().concat("\n") :
                        fields[i].getName().toUpperCase().concat(";"));
            }

            for (Population population : populations) {
                for (int i = 0; i < fields.length; i++) {
                    fields[i].setAccessible(true);
                    if(fields[i].isAnnotationPresent(WriteConcerns.class)){

                        if(fields[i].get(population) instanceof String) {
                            CaseFormatter format = fields[i].getAnnotation(WriteConcerns.class).case_format();
                            if(format == CaseFormatter.LOWER_CASE) {
                                writer.write(fields.length - 1 == i ?
                                        fields[i].get(population).toString().toLowerCase().concat("\n") :
                                        fields[i].get(population).toString().toLowerCase().concat(";"));
                            } else if(format == CaseFormatter.UPPER_CASE) {
                                writer.write(fields.length - 1 == i ?
                                        fields[i].get(population).toString().toUpperCase().concat("\n") :
                                        fields[i].get(population).toString().toUpperCase().concat(";"));
                            } else {
                                writer.write(fields.length - 1 == i ?
                                        fields[i].get(population).toString().concat("\n") :
                                        fields[i].get(population).toString().concat(";"));
                            }
                        } else {
                            NumberFormatter formatv2 = fields[i].getAnnotation(WriteConcerns.class).number_format();
                            if(formatv2 == NumberFormatter.PERCENTAGE) {
                                writer.write(fields.length - 1 == i ?
                                        fields[i].get(population).toString().concat("%\n") :
                                        fields[i].get(population).toString().concat("%;"));
                            } else {
                                DecimalFormat df = new DecimalFormat("#,###.##");
                                writer.write(fields.length - 1 == i ?
                                        df.format(fields[i].get(population)).concat("\n") :
                                        df.format(fields[i].get(population)).concat(";"));
                            }
                        }

                    } else {
                        writer.write(fields.length - 1 == i ?
                                fields[i].get(population).toString().concat("\n") :
                                fields[i].get(population).toString().concat(";"));
                    }
                }
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FinalPreparation {
    static void main(String[] args) {
        SecondFinal instance = new SecondFinal("second-group.csv");
        for (Population p : instance.getPopulations())
            System.out.println(p.getArea());

        CustomFileWriter.writeReport("becir.csv", instance.getPopulations());
    }
}
