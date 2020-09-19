package java09_19;

import com.sun.media.jfxmediaimpl.MetadataParserImpl;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:8:37
 **/
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            System.out.println("我是一个新线程");
        });
        t.start();
    }
    /*public static void main(String[] args) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("我是一个新线程");
           }
       };
      Thread thread = new Thread(runnable);
      thread.start();
    }*/
    //方法三使用Runnable接口
  /* static class MyRunnable implements Runnable{
       public void run(){
           System.out.println("我是一个新线程");
       }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable() {
        });
        thread.start();
    }*/

  /*  private static long count = 10_0000_0000;
    public static void main2(String[] args) {
    serial();
    parallel();
    }
    private static  void serial(){
      long beg = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }

    long end = System.currentTimeMillis();
        System.out.println("串行时间："+(end - beg)+ "ms");
    }
    private static  void parallel(){
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread(){

            public void run(){
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }

            }
        };
        Thread t2 = new Thread(){
          public void run(){
              int b = 0;
              for (int i = 0; i < count; i++) {
                  b++;
              }
          }
        };
        t1.start();
        try{
            t1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("并行时间："+(end - beg)+"ms");
    }*/
   /* public static void main1(String[] args) {

    }
    //创建线程的第一个方法：继承Thread接口，并且一定要重写run( )
   *//* static class MyThread extends Thread{
        public void run(){
            System.out.println("我是一个线程");
        }
    }
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

    }*/
}
