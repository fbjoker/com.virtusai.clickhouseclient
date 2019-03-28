package com.virtusai.clickhouseclient.produer;

public class MthreadProducer2 {
    public static void main(String[] args) {


        MyckproducerRunnable p1= new MyckproducerRunnable();
        p1.setRowNum(100000);
        p1.setTableName("aaa");
        Thread thread1 = new Thread(p1);
        thread1.start();

        Thread thread2 = new Thread(p1);
        thread2.start();
        Thread thread3 = new Thread(p1);
        thread3.start();
        Thread thread4 = new Thread(p1);
        thread4.start();
        Thread thread5 = new Thread(p1);
        thread5.start();
        Thread thread6 = new Thread(p1);
        thread6.start();
        Thread thread7 = new Thread(p1);
        thread7.start();
        Thread thread8 = new Thread(p1);
        thread8.start();
        Thread thread9 = new Thread(p1);
        thread9.start();
        Thread thread10 = new Thread(p1);
        thread10.start();
        Thread thread11 = new Thread(p1);
        thread11.start();



    }
}
