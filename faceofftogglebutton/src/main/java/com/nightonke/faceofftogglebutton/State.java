package com.nightonke.faceofftogglebutton;

/**
 * Created by Weiping on 2016/5/21.
 */

public enum State {

    LEFT(0),
    LEFT_TO_RIGHT(1),
    RIGHT(2),
    RIGHT_TO_LEFT(3);

    int v;

    State(int v) {
        this.v = v;
    }
}
