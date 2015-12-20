package com.kelebro63.magtoapp.model;

/**
 * Created by Kelebro63 on 20.12.2015.
 */
public class Journal {

    private boolean isNew = false;
    private int imageResources;
    private boolean leftTapeVisible = false;
    private boolean rightTapeVisible = false;

    public int getImageResources() {
        return imageResources;
    }

    public void setImageResources(int imageResources) {
        this.imageResources = imageResources;
    }

    public boolean isLeftTapeVisible() {
        return leftTapeVisible;
    }

    public void setLeftTapeVisible(boolean leftTapeVisible) {
        this.leftTapeVisible = leftTapeVisible;
    }

    public boolean isRightTapeVisible() {
        return rightTapeVisible;
    }

    public void setRightTapeVisible(boolean rightTapeVisible) {
        this.rightTapeVisible = rightTapeVisible;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
