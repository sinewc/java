public class ComparableTriangle extends Triangle implements Comparable {

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
         if(this.getArea()==((Circle) obj).getArea()){
             return true;
         }
         else{
             return false;
         }
     }

    
    
}
