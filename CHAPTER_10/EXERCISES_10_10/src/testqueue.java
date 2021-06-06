
public class testqueue {

    public static void main(String[] args) {
        int count=0;
        // Create a Queue object
		queue queue = new queue();

		// Adds 20 numbers from 1 to 20 into the queue
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
                    for (int j = 0; j < queue.size; j++) {
			System.out.print(queue.elements[j]+ " ");
                       
                    }
                    count++;
                    if(count==20){
                        System.out.println("\nMix"); 
                    }
                    System.out.println();
                    
		}
                 count=0;
                
                
             
		// Removes these numbers and displays them
		while (!queue.empty()) {
                        
			System.out.println(queue.dequeue() + " out ");
                         for (int j = 0; j < queue.size; j++) {
			System.out.print(queue.elements[j]+ " ");
                    }
                    System.out.println(); 
                    count++;
                    if(count==20){
                        System.out.println("empty");
                       
                    }
		}
		System.out.println(); 
                System.out.println(queue.dequeue() + " out ");
                
                
	}
}

    


