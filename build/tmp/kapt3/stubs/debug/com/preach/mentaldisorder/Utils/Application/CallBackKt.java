package com.preach.mentaldisorder.Utils.Application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0010\u001a\u00020\rH\u0016J$\u0010\u0019\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR9\u0010\f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR.\u0010\u0013\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/preach/mentaldisorder/Utils/Application/CallBackKt;", "T", "Lretrofit2/Callback;", "()V", "onErrorResponse", "Lkotlin/Function1;", "", "", "getOnErrorResponse", "()Lkotlin/jvm/functions/Function1;", "setOnErrorResponse", "(Lkotlin/jvm/functions/Function1;)V", "onFailure", "", "Lkotlin/ParameterName;", "name", "t", "getOnFailure", "setOnFailure", "onSucessResponse", "Lretrofit2/Response;", "getOnSucessResponse", "setOnSucessResponse", "call", "Lretrofit2/Call;", "onResponse", "response", "app_debug"})
public final class CallBackKt<T extends java.lang.Object> implements retrofit2.Callback<T> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super retrofit2.Response<T>, kotlin.Unit> onSucessResponse;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onErrorResponse;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onFailure;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<retrofit2.Response<T>, kotlin.Unit> getOnSucessResponse() {
        return null;
    }
    
    public final void setOnSucessResponse(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super retrofit2.Response<T>, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnErrorResponse() {
        return null;
    }
    
    public final void setOnErrorResponse(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getOnFailure() {
        return null;
    }
    
    public final void setOnFailure(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
    }
    
    public CallBackKt() {
        super();
    }
}