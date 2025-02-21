package com.codegym.task.task13.task1307;

/* 
Parameterized interface

*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject  {
        @Override
        public SimpleObject<String> getInstance() {
            StringObject instance = new StringObject();
            return instance;
        }
    }
}