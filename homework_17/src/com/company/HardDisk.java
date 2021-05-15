package com.company;

public class HardDisk {
    private int memory;
    private int diskCount;

    public HardDisk(){

    }

    public HardDisk(int memory, int diskCount) {
        this.memory = memory;
        this.diskCount = diskCount;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskCount() {
        return diskCount;
    }

    public void setDiskCount(int diskCount) {
        this.diskCount = diskCount;
    }
}
