package com.codegym.task.task13.task1304;

/* 
Selectable and Updatable

*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {
            System.out.println("This screen is selected");
        }

        @Override
        public void refresh() {
            System.out.println("This screen is updated");
        }
    }
}
