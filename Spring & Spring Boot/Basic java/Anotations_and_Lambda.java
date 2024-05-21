// @Deprecated
@FunctionalInterface
interface A{
    int checking(int i,int j);
}
// class B implements A{
//     // @Override
//     public void checking(){
//         System.out.println("in B checking");
//     }
// }   

class Anotations_and_Lambda{
    public static void main(String[] args) {
        A obj = (int i,int j) ->  i*j;
        System.out.println(obj.checking(19,7));
    }
}