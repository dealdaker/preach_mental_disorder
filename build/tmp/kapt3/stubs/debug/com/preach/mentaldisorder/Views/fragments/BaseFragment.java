package com.preach.mentaldisorder.Views.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0006H&J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0006H\u0004J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0004\u00a8\u0006\u001b"}, d2 = {"Lcom/preach/mentaldisorder/Views/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "applyValidations", "", "viewList", "Ljava/util/ArrayList;", "Landroid/view/View;", "buttonView", "callback", "Lcom/preach/mentaldisorder/Models/Source/Repository/UserDataSource$OnValidationCallback;", "attachViewModel", "initViews", "navigateToFragment", "action", "bundle", "Landroid/os/Bundle;", "onBackPress", "onCreate", "savedInstanceState", "onViewCreated", "view", "setupGeneralViewModel", "generalViewModel", "Lcom/preach/mentaldisorder/ViewModels/BaseAndroidViewModel;", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void initViews();
    
    public abstract void attachViewModel();
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void applyValidations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.view.View> viewList, @org.jetbrains.annotations.NotNull()
    android.view.View buttonView, @org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Models.Source.Repository.UserDataSource.OnValidationCallback callback) {
    }
    
    public final void navigateToFragment(int action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    protected final void setupGeneralViewModel(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.ViewModels.BaseAndroidViewModel generalViewModel) {
    }
    
    protected final void onBackPress() {
    }
    
    public BaseFragment(int layoutId) {
        super();
    }
}