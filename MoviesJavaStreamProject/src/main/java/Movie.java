
/**
 * Created by Ronney
 */

public class Movie implements Comparable {
    public int slno;
    public int id;
    public String title;
    public int year;
    public String age;
    public float imdbRatings;
    public String rottenTomatoesReviews;
    public int netflix;
    public int hulu;
    public int primeVideo;
    public int disneyplus;
    public int type;
    public String directors;
    public String genres;
    public int runtime;
    public String country;
    public String language;

    public Movie(int slno, int id, String title, int year, String age, float imdbRatings, String rottenTomatoesReviews, int netflix, int hulu, int primeVideo, int disneyplus, int type, String directors, String genres, String country, String language, int runtime) {
        this.slno = slno;
        this.id = id;
        this.title = title;
        this.year = year;
        this.age = age;
        this.imdbRatings = imdbRatings;
        this.rottenTomatoesReviews = rottenTomatoesReviews;
        this.netflix = netflix;
        this.hulu = hulu;
        this.primeVideo = primeVideo;
        this.disneyplus = disneyplus;
        this.type = type;
        this.directors = directors;
        this.genres = genres;
        this.country = country;
        this.language = language;
        this.runtime = runtime;
    }





    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getImdbRatings() {
        return imdbRatings;
    }

    public void setImdbRatings(float imdbRatings) {
        this.imdbRatings = imdbRatings;
    }

    public String getRottenTomatoesReviews() {
        return rottenTomatoesReviews;
    }

    public void setRottenTomatoesReviews(String rottenTomatoesReviews) {
        this.rottenTomatoesReviews = rottenTomatoesReviews;
    }

    public int getNetflix() {
        return netflix;
    }

    public void setNetflix(int netflix) {
        this.netflix = netflix;
    }

    public int getHulu() {
        return hulu;
    }

    public void setHulu(int hulu) {
        this.hulu = hulu;
    }

    public int getPrimeVideo() {
        return primeVideo;
    }

    public void setPrimeVideo(int primeVideo) {
        this.primeVideo = primeVideo;
    }

    public int getDisneyplus() {
        return disneyplus;
    }

    public void setDisneyplus(int disneyplus) {
        this.disneyplus = disneyplus;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public Movie(String [] s){
        if(!s[0].isEmpty()) {
            this.slno = Integer.parseInt(s[0]);
        }
        if(!s[1].isEmpty()) {
            this.id = Integer.parseInt(s[1]);
        }
        this.title = s[2];
        if(!s[3].isEmpty()) {
            this.year = Integer.parseInt(s[3]);
        }
        this.age =  s[4];
        if(!s[5].isEmpty()) {
            this.imdbRatings = Float.parseFloat(s[5]);
        }
        this.rottenTomatoesReviews = s[6];

        if(!s[7].isEmpty()) {
            this.netflix = Integer.parseInt(s[7]);
        }
        if(!s[8].isEmpty()) {
            this.hulu = Integer.parseInt(s[8]);

        }
        if(!s[9].isEmpty()) {
            this.primeVideo = Integer.parseInt(s[9]);

        }
        if(!s[10].isEmpty()) {
            this.disneyplus = Integer.parseInt(s[10]);

        }
        if(!s[11].isEmpty()) {
            this.type = Integer.parseInt(s[11]);
        }
        this.directors = s[12];
        this.genres = s[13];
        this.country = s[14];
        this.language = s[15];
        if(!s[16].isEmpty()) {
            this.runtime = Integer.parseInt(s[16]);
        }

    }


    public int compareTo(Object o) {
        Movie otherMovie = (Movie) o;
        return Integer.compare(this.year,otherMovie.year);
    }

    @Override
    public String toString() {
        return "Movie{" +
                " country='" + country + '\'' +
                ",slno=" + slno +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", age='" + age + '\'' +
                ", imdbRatings=" + imdbRatings +
                ", rottenTomatoesReviews='" + rottenTomatoesReviews + '\'' +
                ", netflix=" + netflix +
                ", hulu=" + hulu +
                ", primeVideo=" + primeVideo +
                ", disneyplus=" + disneyplus +
                ", type=" + type +
                ", directors='" + directors + '\'' +
                ", genres='" + genres + '\'' +
                ", runtime=" + runtime +
                ", language='" + language + '\'' +
                '}';
    }

    public boolean hasRatings(float imdbRatings) {
        boolean flag = false;
        if(this.imdbRatings >= imdbRatings){
            flag = true;
        }
        return flag;
    }
}
