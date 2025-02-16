import java.lang.Thread;

// class A implements Runnable
// {
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// // class B extends Thread
// class B implements Runnable
// {
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Team");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

class Multi_threading{
    public static void main (String a[]){
        Runnable obj = () -> {
                for(int i=0;i<10;i++){
                    System.out.println("Hi");
                    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
                }
            };
        Runnable obj1 = () -> {
                for(int i=0;i<10;i++){
                    System.out.println("Team");
                    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
                }
            };

        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj1);

        // obj1.setPriority(7);
        // System.out.println(obj1.getPriority()); 
        
        
        t.start();


        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {e.printStackTrace();}
        
        
        t1.start();


    }
}