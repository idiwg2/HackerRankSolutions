
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    
    */
    
    public long power(int n,int p) throws Exception{
        
            if(n<0 || p<0){
              throw new Exception("n or p should not be negative.");  
            }
            else if(p==0 && n==0){
                throw new Exception("n and p should not be zero.");
            }
            else{
                return (long)Math.pow(n,p);
            }
            
        }
       
     
    
    
    
    
}
