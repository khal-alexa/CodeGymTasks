package com.codegym.task.task13.task1301;

/* 
Beer

*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
            System.out.println("More beer please");
        }

        @Override
        public void sayThankYou() {
            System.out.println("Thank you");
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("Hrrrrr");
        }
    }
}