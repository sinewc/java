
public class ComparableCircle extends Circle implements Comparable
{

    @Override
    public int compareTo(Object o) {
        if(this.getArea()>((Circle) o).getArea()){
           return 1;
        }
        else if(this.getArea()<((Circle) o).getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
     @Override
     public boolean equals(Object obj) {
         if(this.getRadius()==((Circle) obj).getRadius()){
             return true;
         }
         else{
             return false;
         }
     }

    
    
}