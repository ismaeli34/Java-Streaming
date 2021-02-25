/**
 * Created by Ronney
 */

public class Heroes implements Comparable {
    public int id;
    public String name;
    public String gender;
    public String eyecolor;
    public String race;
    public String haircolor;
    public float height;
    public String publisher;
    public String skincolor;
    public String alignment;
    public float weight;


    public Heroes(String []s){

        this.id = Integer.parseInt(s[0]);
        this.name = s[1];
        this.gender = s[2];
        this.eyecolor = s[3];
        this.race = s[4];
        this.haircolor = s[5];
        //to check if its empty string
        if(!s[6].isEmpty()){
            this.height = Float.parseFloat(s[6]);
        }
        this.publisher = s[7];
        this.skincolor = s[8];
        this.alignment = s[9];
        //to check if its empty string
        if(!s[10].isEmpty()){
            this.weight = Float.parseFloat(s[10]);
        }
    }


    public Heroes(int id,String name, String gender, String eyecolor, String race, String haircolor, float height, String publisher, String skincolor, String alignment, float weight) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.eyecolor = eyecolor;
        this.race = race;
        this.haircolor = haircolor;
        this.height = height;
        this.publisher = publisher;
        this.skincolor = skincolor;
        this.alignment = alignment;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "weight='" + weight + '\'' +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", eyecolor='" + eyecolor + '\'' +
                ", race='" + race + '\'' +
                ", haircolor='" + haircolor + '\'' +
                ", height='" + height + '\'' +
                ", publisher='" + publisher + '\'' +
                ", skincolor='" + skincolor + '\'' +
                ", alignment='" + alignment + '\'' +

                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public  boolean  checkRaceAndWeight(String hero_race,float hero_weight){
        return race.equals(hero_race) && weight > hero_weight;
    }


    @Override
    public int compareTo(Object o) {
        Heroes otherHero = (Heroes) o;
        return Float.compare(this.weight,otherHero.weight);
    }

}
