package web.model;

public class Car {
    private String model;
    private String series;
    private int yearRelease;

    public Car(String model, String series, int yearRelease) {
        this.model = model;
        this.series = series;
        this.yearRelease = yearRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
