
class Exceptions{
    public static void main(String args[]){
        int i=2,j=0;
        try{
            i=i/j;
        }
        catch(Exception e){
            System.out.println("somthing went wrong");
        }
        System.out.println(i+" See you soon.");
    }
}