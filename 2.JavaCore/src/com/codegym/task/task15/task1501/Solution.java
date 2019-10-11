package com.codegym.task.task15.task1501;

/* 
OOP: Arrange interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public String getAllowedAction() {
            return "The clothes is discountable";
        }

        @Override
        public String getAllowedAction(String name) {
            return "The " + name + " is sellable";
        }
    }
}
