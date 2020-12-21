package com.preach.mentaldisorder.Models.Source.ServerConnection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "context", "getContext", "()Landroid/content/Context;", "setContext", "httpClient", "Lokhttp3/OkHttpClient$Builder;", "retrofit", "Lretrofit2/Retrofit;", "getLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getService", "Lcom/preach/mentaldisorder/Models/Source/ServerConnection/ApiService;", "initRetrofit", "", "AuthenticationInterceptor", "Companion", "app_debug"})
public final class RetrofitClientInstance {
    private retrofit2.Retrofit retrofit;
    private final okhttp3.OkHttpClient.Builder httpClient = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "http://mashghol.com/smartseve-api/public/api/v1/";
    @org.jetbrains.annotations.Nullable()
    private static com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance singleInstance;
    public static final com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    public final void initRetrofit() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Models.Source.ServerConnection.ApiService getService() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor getLoggingInterceptor() {
        return null;
    }
    
    public RetrofitClientInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance$AuthenticationInterceptor;", "Lokhttp3/Interceptor;", "authToken", "", "context", "Landroid/content/Context;", "(Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;Ljava/lang/String;Landroid/content/Context;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
    public final class AuthenticationInterceptor implements okhttp3.Interceptor {
        private final java.lang.String authToken = null;
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain chain) throws java.io.IOException {
            return null;
        }
        
        public AuthenticationInterceptor(@org.jetbrains.annotations.NotNull()
        java.lang.String authToken, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance$Companion;", "", "()V", "singleInstance", "Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;", "getSingleInstance", "()Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;", "setSingleInstance", "(Lcom/preach/mentaldisorder/Models/Source/ServerConnection/RetrofitClientInstance;)V", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance getSingleInstance() {
            return null;
        }
        
        public final void setSingleInstance(@org.jetbrains.annotations.Nullable()
        com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.preach.mentaldisorder.Models.Source.ServerConnection.RetrofitClientInstance getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}