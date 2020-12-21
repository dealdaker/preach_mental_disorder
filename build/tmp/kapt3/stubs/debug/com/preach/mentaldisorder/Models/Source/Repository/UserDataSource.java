package com.preach.mentaldisorder.Models.Source.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/Repository/UserDataSource;", "", "OnValidationCallback", "app_debug"})
public abstract interface UserDataSource {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&\u00a8\u0006\n"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/Repository/UserDataSource$OnValidationCallback;", "", "onApplied", "", "isFormValid", "", "values", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface OnValidationCallback {
        
        public abstract void onApplied(boolean isFormValid, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> values);
    }
}