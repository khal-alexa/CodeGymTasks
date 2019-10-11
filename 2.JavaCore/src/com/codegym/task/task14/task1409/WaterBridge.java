package com.codegym.task.task14.task1409;

public class WaterBridge implements Bridge {
    private static int waterBridgeCounter = 0;

    public WaterBridge () {
        waterBridgeCounter++;
    }

    @Override
    public int getCarsCount() {
        return 55;
    }
}
