package com.virtusai.clickhouseclient.produer;

public class MthreadProducer {
    public static void main(String[] args) {


        MyckproducerRunnable p1= new MyckproducerRunnable();
        p1.setRowNum(100000);
        p1.setTableName("aaa");
        Thread thread1 = new Thread(p1);
        thread1.start();

        MyckproducerRunnable p2= new MyckproducerRunnable();
        p2.setRowNum(100000);
        p2.setTableName("aaa");
        Thread thread2 = new Thread(p2);
        thread2.start();


        MyckproducerRunnable p3= new MyckproducerRunnable();
        p3.setRowNum(100000);
        p3.setTableName("aaa");
        Thread thread3 = new Thread(p3);
        thread3.start();

        MyckproducerRunnable p4= new MyckproducerRunnable();
        p4.setRowNum(100000);
        p4.setTableName("aaa");
        Thread thread4 = new Thread(p4);
        thread4.start();

        MyckproducerRunnable p5= new MyckproducerRunnable();
        p5.setRowNum(100000);
        p5.setTableName("aaa");
        Thread thread5 = new Thread(p5);
        thread5.start();

        MyckproducerRunnable p6= new MyckproducerRunnable();
        p6.setRowNum(100000);
        p6.setTableName("aaa");
        Thread thread6 = new Thread(p6);
        thread6.start();

        MyckproducerRunnable p7= new MyckproducerRunnable();
        p7.setRowNum(100000);
        p7.setTableName("aaa");
        Thread thread7 = new Thread(p7);
        thread7.start();

        MyckproducerRunnable p8= new MyckproducerRunnable();
        p8.setRowNum(100000);
        p8.setTableName("aaa");
        Thread thread8 = new Thread(p8);
        thread8.start();

        MyckproducerRunnable p9= new MyckproducerRunnable();
        p9.setRowNum(100000);
        p9.setTableName("aaa");
        Thread thread9 = new Thread(p9);
        thread9.start();

        MyckproducerRunnable p10= new MyckproducerRunnable();
        p10.setRowNum(100000);
        p10.setTableName("aaa");
        Thread thread10 = new Thread(p10);
        thread10.start();
    }
}
