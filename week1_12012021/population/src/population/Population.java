package population;
public class Population {
    public static void main(String[] args) {
        long brith=7,death=13,immigrant=45,citizenbrith,citizendeath,citizenimmigrant;
        long  population = 312032486;
        long  time = 365*24*60*60;
        
       citizenbrith = time/brith;
       citizendeath = time/death;
       citizenimmigrant = time/immigrant;
        //print population 5 year
            for(int i=1; i<6; i++){
               population=population+citizenbrith-citizendeath+citizenimmigrant;
               System.out.println("Population "+i+" year "+population);
           }
        }
 }
