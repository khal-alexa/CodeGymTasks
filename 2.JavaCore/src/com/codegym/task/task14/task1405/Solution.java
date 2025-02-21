package com.codegym.task.task14.task1405;

/* 
Food

*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        if (food instanceof Food) {
            food.onSelect();
            food.onEat();
        }
        else if (food instanceof Selectable) {
            food.onSelect();
        }
    }

    public static void selectableMethods(Selectable selectable) {
            selectable.onSelect();
        }


    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
