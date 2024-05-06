package Objects;

public class Child extends Human {

    public Child(String Name, String Gender, Double Height) {

        super(Name, Gender, Height);
    }
   // inheritance constructor
    @Override
    public void setName(String Name) {
        super.setName(Name);
    }

    public String getName(String Name) {
        return super.getName();
    }

}
