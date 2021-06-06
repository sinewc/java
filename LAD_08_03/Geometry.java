

public abstract class Geometry {

    String name = "";
    String color = "";
    

    public Geometry() {
    }

    public Geometry(String name,String color) {
        this.name = name;
        this.color = color;
    }

    

   
    public String getColor() {
         return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public abstract double getArea();
    

}
