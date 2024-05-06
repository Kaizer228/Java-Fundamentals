package Objects;

public class Human {

    private String Name;
    private String Gender;
    private Double Height;
    static boolean Player = true;
    

    public Human (String Name, String Gender, Double Height){
        this.Name = Name;
        this.Gender = Gender;
        this.Height = Height;        
    }

    public void setName (String Name) {
        this.Name = Name;
    }
    
    public String getName () {
        return Name;
    }
    public void setGender (String Gender) {
        this.Gender = Gender;
    }
    
    public String getGender () {
        return Gender;
    }
    public void setHeight (Double Height) {
        this.Height = Height;
    }
    
    public Double getHeight () {
        return Height;
    }

}
