package com.preach.mentaldisorder.Utils.GeneralUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\u000fJ\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010&\u001a\u00020\u001fJ\u0006\u0010\'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fJ\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010.\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010\u000fJ\u000e\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u0012J\u000e\u00102\u001a\u00020+2\u0006\u0010&\u001a\u00020\u001fJ\u0010\u00103\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010\u000fJ\u0010\u00104\u001a\u00020+2\b\u00105\u001a\u0004\u0018\u00010\u000fJ\u0010\u00106\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000fJ\u0015\u00108\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020+2\b\u0010<\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010=\u001a\u00020+2\b\u0010<\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010>\u001a\u00020+2\u0006\u0010\'\u001a\u00020\u001fJ\u0010\u0010?\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010@\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010A\u001a\u00020+2\u0006\u00101\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010D\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010F\u001a\u00020+2\u0006\u00101\u001a\u00020\u001fJ\u000e\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020\u001fJ\u000e\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020\u000fJ\u0010\u0010K\u001a\u00020+2\b\u0010L\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010M\u001a\u00020+2\u0006\u0010J\u001a\u00020\u000fJ\u000e\u0010N\u001a\u00020+2\u0006\u0010J\u001a\u00020\u000fJ\u000e\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u00020+2\u0006\u0010J\u001a\u00020\u000fJ\u0010\u0010S\u001a\u00020+2\b\u0010T\u001a\u0004\u0018\u00010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006U"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "pref", "Landroid/content/SharedPreferences;", "getPref", "()Landroid/content/SharedPreferences;", "setPref", "(Landroid/content/SharedPreferences;)V", "getAddress", "", "getAuthToken", "getBiometric", "", "getEmail", "getFCMToken", "getFirstName", "getLat", "getLng", "getLocale", "getMobileNumber", "getName", "getNotificationEnable", "getPhoneNumber", "getPicture", "getRestaurant", "", "getRestaurantId", "getStripeCustomer", "getTableId", "getUniqueCode", "getUserId", "getUserStatus", "isDeliverySelected", "isLoggedIn", "isProfileCompleted", "isReOrder", "logout", "", "setAddress", "address", "setAuthToken", "email", "setBiometric", "value", "setDeliverySelected", "setEmail", "setFCMToken", "token", "setFirstName", "name", "setInfoStatus", "status", "(Ljava/lang/Integer;)V", "setLat", "lat", "setLng", "setLoggedIn", "setMobileNumber", "setName", "setNotificationEnable", "setPhoneNumber", "phone_num", "setPicture", "imageString", "setReOrder", "setRestaurant", "isRestaurant", "setRestaurantId", "id", "setStripeCustomer", "stripe_customer", "setTableId", "setUniqueCode", "setUser", "user", "Lcom/preach/mentaldisorder/Models/DataModels/GeneralModels/UserModel;", "setUserId", "setUserStatus", "user_status", "app_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences pref;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void setLoggedIn(boolean isLoggedIn) {
    }
    
    public final boolean isDeliverySelected() {
        return false;
    }
    
    public final void setDeliverySelected(boolean isDeliverySelected) {
    }
    
    public final boolean isReOrder() {
        return false;
    }
    
    public final void setReOrder(boolean value) {
    }
    
    public final boolean getRestaurant() {
        return false;
    }
    
    public final void setRestaurant(boolean isRestaurant) {
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setTableId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTableId() {
        return null;
    }
    
    public final void setRestaurantId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurantId() {
        return null;
    }
    
    public final void setUniqueCode(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueCode() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.Nullable()
    java.lang.String lat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    public final void setLng(@org.jetbrains.annotations.Nullable()
    java.lang.String lat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLng() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String phone_num) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.Nullable()
    java.lang.String imageString) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPicture() {
        return null;
    }
    
    public final void setBiometric(int value) {
    }
    
    public final int getBiometric() {
        return 0;
    }
    
    public final void setNotificationEnable(int value) {
    }
    
    public final int getNotificationEnable() {
        return 0;
    }
    
    public final void setFCMToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFCMToken() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setUserStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String user_status) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserStatus() {
        return null;
    }
    
    public final void setStripeCustomer(@org.jetbrains.annotations.Nullable()
    java.lang.String stripe_customer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStripeCustomer() {
        return null;
    }
    
    public final void setInfoStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer status) {
    }
    
    public final boolean isProfileCompleted() {
        return false;
    }
    
    public final void setAuthToken(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthToken() {
        return null;
    }
    
    public final void logout() {
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Models.DataModels.GeneralModels.UserModel user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocale() {
        return null;
    }
    
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}