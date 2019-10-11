package com.codegym.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    private static int suspensionBridgeCounter = 0;

    public SuspensionBridge () {
        suspensionBridgeCounter++;
    }
    @Override
    public int getCarsCount() {
        return 25;
    }
}
