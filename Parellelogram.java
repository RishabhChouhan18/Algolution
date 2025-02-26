class Parellelogram{
    
    static void print(int r){    
       for(int i=0; i<r; i++){              
           
           for(int j =0; j<r-i; j++){      
               System.out.print(" ");
           }
           
           for(int k = 0; k<r; k++){
                System.out.print("*");
           }
            System.out.println();
       }
        
    }
    public static void main(String[] args){
        int r = 5;
       
        print(r);
    }
}
