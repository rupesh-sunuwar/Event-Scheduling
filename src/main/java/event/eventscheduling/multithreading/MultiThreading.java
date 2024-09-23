package event.eventscheduling.multithreading;

public class MultiThreading {

    public static void main(String args[]) {

        ThreadCount C = new ThreadCount();

        try {

            while (C.isAlive()) {

                System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");

                Thread.sleep(2500); //Sleep method

            }

        } catch (InterruptedException e) {

            System.out.println("Main Method thread is interrupted");

        }

        System.out.println("Main Method's thread run is terminated");

    }

}
