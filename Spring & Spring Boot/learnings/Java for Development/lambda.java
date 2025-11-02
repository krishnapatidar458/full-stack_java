// Lambda expressions in Java
// lambda expression is an annonymous function that can be used to provide the implementation of a functional interface (an interface with a single abstract method).
// classification of lambda expressions:
// 1. Not having any return type.
// 2. Not having any name.
// 3. Not having modifier like public, private, etc.

// function Interface:
// interface having exactly single abstract method but can have multiple default or static methods.
// we can invoke lambda expression using functional interface.

// @FunctionalInterface
// public interface Message{
//     public void show();

//     public default void display(){
//         System.out.println("default method in functional interface");
//     }

//     public static void print(){
//         System.out.println("static method in functional interface");
//     }
// }


public class lambda{

    
    private static void yashwamt(){
        System.out.println("Without lambda expression");
    }
    
    // steps tp make any function as lambda expression:
    // 1. Remove modifier.
    // 2. Remove the method name.
    // 3. Remove return type.
    // 4. place arrow -> between parameter and body.

    
 
    public static void main(String args[]){
        // lambda l = new lambda();
        // l.yashwamt();
        yashwamt();
        // () -> { System.out.println("lambda Expression") };
    }
}



