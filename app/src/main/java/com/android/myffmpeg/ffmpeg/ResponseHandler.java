package com.android.myffmpeg.ffmpeg;

/**
 * Created by sagar on 20-04-2017.
 */

abstract interface ResponseHandler {
    /**
     * on Start
     */
    public void onStart();

    /**
     * on Finish
     */
    public void onFinish();
}
