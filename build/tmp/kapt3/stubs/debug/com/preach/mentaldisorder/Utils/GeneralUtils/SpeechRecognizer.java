package com.preach.mentaldisorder.Utils.GeneralUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer;", "", "context", "Landroid/content/Context;", "callback", "Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$OnDataFetchCallback;", "(Landroid/content/Context;Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$OnDataFetchCallback;)V", "getCallback", "()Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$OnDataFetchCallback;", "setCallback", "(Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$OnDataFetchCallback;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "checkAudioPermissions", "", "startListeningWithoutDialog", "startSpeechRecognizer", "CustomRecognitionListener", "OnDataFetchCallback", "app_debug"})
public final class SpeechRecognizer {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.preach.mentaldisorder.Utils.GeneralUtils.SpeechRecognizer.OnDataFetchCallback callback;
    
    private final void checkAudioPermissions() {
    }
    
    public final void startSpeechRecognizer() {
    }
    
    private final void startListeningWithoutDialog() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Utils.GeneralUtils.SpeechRecognizer.OnDataFetchCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Utils.GeneralUtils.SpeechRecognizer.OnDataFetchCallback p0) {
    }
    
    public SpeechRecognizer(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Utils.GeneralUtils.SpeechRecognizer.OnDataFetchCallback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$CustomRecognitionListener;", "Landroid/speech/RecognitionListener;", "(Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer;)V", "TAG", "", "onBeginningOfSpeech", "", "onBufferReceived", "buffer", "", "onEndOfSpeech", "onError", "error", "", "onEvent", "eventType", "params", "Landroid/os/Bundle;", "onPartialResults", "partialResults", "onReadyForSpeech", "onResults", "results", "onRmsChanged", "rmsdB", "", "app_debug"})
    public final class CustomRecognitionListener implements android.speech.RecognitionListener {
        private final java.lang.String TAG = "RecognitionListener";
        
        @java.lang.Override()
        public void onReadyForSpeech(@org.jetbrains.annotations.NotNull()
        android.os.Bundle params) {
        }
        
        @java.lang.Override()
        public void onBeginningOfSpeech() {
        }
        
        @java.lang.Override()
        public void onRmsChanged(float rmsdB) {
        }
        
        @java.lang.Override()
        public void onBufferReceived(@org.jetbrains.annotations.NotNull()
        byte[] buffer) {
        }
        
        @java.lang.Override()
        public void onEndOfSpeech() {
        }
        
        @java.lang.Override()
        public void onError(int error) {
        }
        
        @java.lang.Override()
        public void onResults(@org.jetbrains.annotations.NotNull()
        android.os.Bundle results) {
        }
        
        @java.lang.Override()
        public void onPartialResults(@org.jetbrains.annotations.NotNull()
        android.os.Bundle partialResults) {
        }
        
        @java.lang.Override()
        public void onEvent(int eventType, @org.jetbrains.annotations.NotNull()
        android.os.Bundle params) {
        }
        
        public CustomRecognitionListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/SpeechRecognizer$OnDataFetchCallback;", "", "onContinueData", "", "data", "", "onErrorData", "error", "onFetchVoiceData", "app_debug"})
    public static abstract interface OnDataFetchCallback {
        
        public abstract void onFetchVoiceData(@org.jetbrains.annotations.NotNull()
        java.lang.String data);
        
        public abstract void onErrorData(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
        
        public abstract void onContinueData(@org.jetbrains.annotations.NotNull()
        java.lang.String data);
    }
}