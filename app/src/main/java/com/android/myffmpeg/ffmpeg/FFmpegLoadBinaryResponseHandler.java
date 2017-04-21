package com.android.myffmpeg.ffmpeg;

/**
 * Created by sagar on 20-04-2017.
 */

interface FFmpegLoadBinaryResponseHandler extends ResponseHandler {
    /**
     * on Fail
     */
    void onFailure();

    /**
     * on Success
     */
    void onSuccess();
}
