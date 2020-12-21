package com.preach.mentaldisorder.Models.Source.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010&\u001a\u00020\'R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006("}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/Repository/BaseRepository;", "", "ctx", "Landroid/content/Context;", "retroInstance", "Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;", "sessionManager", "Lcom/preach/mentaldisorder/Utils/GeneralUtils/SessionManager;", "(Landroid/content/Context;Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;Lcom/preach/mentaldisorder/Utils/GeneralUtils/SessionManager;)V", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "getRetroInstance", "()Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;", "setRetroInstance", "(Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;)V", "getSessionManager", "()Lcom/preach/mentaldisorder/Utils/GeneralUtils/SessionManager;", "setSessionManager", "(Lcom/preach/mentaldisorder/Utils/GeneralUtils/SessionManager;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getApiService", "Lcom/preach/mentaldisorder/Models/Source/ServerConnection/ApiService;", "app_debug"})
public class BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userId = "";
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    private com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance retroInstance;
    @org.jetbrains.annotations.NotNull()
    private com.preach.mentaldisorder.Utils.GeneralUtils.SessionManager sessionManager;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Models.Source.ServerConnection.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance getRetroInstance() {
        return null;
    }
    
    public final void setRetroInstance(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Utils.GeneralUtils.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Utils.GeneralUtils.SessionManager p0) {
    }
    
    public BaseRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance retroInstance, @org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Utils.GeneralUtils.SessionManager sessionManager) {
        super();
    }
}