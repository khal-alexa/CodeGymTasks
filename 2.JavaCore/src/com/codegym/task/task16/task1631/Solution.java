package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.ImageReader;
import com.codegym.task.task16.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) throws NullPointerException {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
