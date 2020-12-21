package com.preach.mentaldisorder.ViewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0004J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J\b\u0010\u0019\u001a\u00020\u0012H\u0004J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0004J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000fH\u0004R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/preach/mentaldisorder/ViewModels/BaseAndroidViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/preach/mentaldisorder/Utils/GeneralUtils/OneShotEvent;", "Lcom/preach/mentaldisorder/Models/DataModels/UtilityModels/ErrorResponse;", "getErrorResponse", "()Landroidx/lifecycle/MutableLiveData;", "loader", "", "getLoader", "progressBar", "getProgressBar", "snackbarMessage", "", "getSnackbarMessage", "handleErrorType", "", "error", "Lcom/preach/mentaldisorder/Utils/NetworkUtils/ResultWrapper;", "", "isSuccess", "result", "Lcom/preach/mentaldisorder/Models/DataModels/UtilityModels/BaseResponse;", "showNetworkError", "showProgressBar", "show", "showSnackbarMessage", "message", "app_debug"})
public class BaseAndroidViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.String>> snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<com.preach.mentaldisorder.Models.DataModels.UtilityModels.ErrorResponse>> errorResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.Boolean>> progressBar = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.Boolean>> loader = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<com.preach.mentaldisorder.Models.DataModels.UtilityModels.ErrorResponse>> getErrorResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.Boolean>> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.preach.mentaldisorder.Utils.GeneralUtils.OneShotEvent<java.lang.Boolean>> getLoader() {
        return null;
    }
    
    protected final void showSnackbarMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected final void showNetworkError() {
    }
    
    protected final void handleErrorType(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Utils.NetworkUtils.ResultWrapper<? extends java.lang.Object> error) {
    }
    
    protected final boolean isSuccess(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Models.DataModels.UtilityModels.BaseResponse result) {
        return false;
    }
    
    protected final void showProgressBar(boolean show) {
    }
    
    public BaseAndroidViewModel() {
        super();
    }
}