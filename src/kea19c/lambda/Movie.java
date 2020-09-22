package kea19c.lambda;

public class Movie {
    private String name;
    private int likes;
    private int productionYear;
    private int duration;

    public Movie() {
    }

    public Movie(String name, int likes, int productionYear, int duration) {
        this.name = name;
        this.likes = likes;
        this.productionYear = productionYear;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[" +
                "Name='" + name + '\'' +
                ", likes=" + likes +
                ", productionYear=" + productionYear +
                ", duration=" + duration +
                ']';
    }

}
