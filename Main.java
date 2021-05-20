public class Main {
   
        public static void tower (int n, char sourcepole, char destinationpole,char auxiliarypole){
            if(n==0){
                return;
            }
            tower(n-1, sourcepole, destinationpole, auxiliarypole);
            System.out.println("move the disk"+n+"from"+sourcepole+"to"+destinationpole);
    
            tower(n-1, auxiliarypole,destinationpole, sourcepole);
        }
        public static void main(String[]args){
            tower(10, 's', 'd', 'a');
        }
        
    }
    

