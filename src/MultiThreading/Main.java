package MultiThreading;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        Runnable r1 = new Runnable() {
//            int age=0;
//            @Override
//            public void run() {
//                for (int i = 0; i < 2000000000; i++) {
//                    System.out.println(Thread.currentThread().getName());
//                    System.out.println("*********");
//                }
//            }
//        };
//
//
//        Thread t1 = new Thread(r1);
//        t1.setName("T1");
//        t1.start();
//
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 2000000000; i++) {
//                    System.out.println(Thread.currentThread().getName());
//                    System.out.println("*********");
//                }
//            }
//        };
//
//        Thread t2 = new Thread(r2);
//        t2.setName("T2");
//        t2.start();


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        JButton btn1 = new JButton("print *");
        JButton btn2 = new JButton("print #");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(btn1);
        frame.add(btn2);
        btn1.addActionListener(e -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2000000000; i++) {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("*********");
                    }
                }
            }).start();
        });
        btn2.addActionListener(e -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2000000000; i++) {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("#########");
                    }
                }
            }).start();
        });


    }
}
