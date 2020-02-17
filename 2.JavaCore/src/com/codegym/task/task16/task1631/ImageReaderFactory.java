package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

import java.io.File;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws NullPointerException {
        ImageReader reader = null;
        try {
            if (type.equals(ImageTypes.JPG)) {
                reader = new JpgReader();
            } else if (type.equals(ImageTypes.PNG)) {
                reader = new PngReader();
            } else if (type.equals(ImageTypes.BMP)) {
                reader = new BmpReader();
            }
        } catch (NullPointerException e) {
        }

        if (reader == null) {
            throw new IllegalArgumentException("Unknown image type");
        } else {
            return reader;
        }
    }
}
