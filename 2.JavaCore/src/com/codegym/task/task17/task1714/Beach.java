package com.codegym.task.task17.task1714;

/* 
Comparable

*/

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("Sunset", (float) 2.2, 8);
        Beach beach2 = new Beach("Miami", (float) 2.2, 10);
        Beach beach3 = new Beach("Hawaii", (float) 4.7, 10);
        System.out.println(beach2.compareTo(beach1));
        System.out.println(beach2.compareTo(beach3));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int magnitude = (this.getQuality() - o.getQuality()) - (int) (this.getDistance() - o.getDistance());
        return magnitude;
    }
}
