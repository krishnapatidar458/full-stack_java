// class Myexception extends Exception{
//     Myexception(String message){
//         super(message);
//     }
// }


class testException{
    // public void Check(){
    //     int i=20,j=0;
    //     try{
    //         j=18/i;
    //         if(j==0)
    //             throw new Exception("Division by zero");  
    //             // throw new Myexception("Division by zero");  
    //     }
    //     catch(Exception e){
    //         System.out.println(i+" is default");
    //         System.out.println(e);
    //     }
    //     System.out.println(i+" \nSee you soon.");
    // }

    public void Check() throws Exception{
        Class.forName("krishna");
    }
}
class Exceptions{
    public static void main(String args[]){
        testException obj = new testException();
        try{
            obj.Check();
        }catch(Exception e){
            System.out.println(e+" this is by throws keyword");
        }
    }
}



