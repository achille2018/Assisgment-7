// Author : Achille Sagang Tanwouo


// we create the Main class where we add all the objects.
public class Main {
   //in this class we add the object n and then the source of our object ,destination and auxilary
        public static void tower (int n, char sourcepole, char destinationpole,char auxiliarypole){
            //if n==0 we return our object like  we go to the bick so the source or our the first collection  and then we comtimues 
            //and then we have the different movent is depens of the auxilary 
            if(n==0){
                return;
            }
            tower(n-1, sourcepole, destinationpole, auxiliarypole);
            System.out.println("move the disk"+n+"from"+sourcepole+"to"+destinationpole);
    
            tower(n-1, auxiliarypole,destinationpole, sourcepole);
        }

// in this place 10 represente n on the Main class  s,d and a represente the different position  of our object
        public static void main(String[]args){
            tower(10, 's', 'd', 'a');
        }
        
    }
    

