package com.preach.mentaldisorder.Views.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0016J\u001c\u0010\"\u001a\u00020\u001b*\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$Holder;", "onItemClicker", "Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$OnItemClicker;", "itemList", "", "", "layoutResId", "", "type", "", "(Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$OnItemClicker;Ljava/util/List;ILjava/lang/String;)V", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "getOnItemClicker", "()Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$OnItemClicker;", "setOnItemClicker", "(Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$OnItemClicker;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "bind", "Landroid/view/View;", "item", "Holder", "OnItemClicker", "app_debug"})
public abstract class BaseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.preach.mentaldisorder.Views.adapters.BaseAdapter.Holder> {
    @org.jetbrains.annotations.NotNull()
    private com.preach.mentaldisorder.Views.adapters.BaseAdapter.OnItemClicker onItemClicker;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Object> itemList;
    private final int layoutResId = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.preach.mentaldisorder.Views.adapters.BaseAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Views.adapters.BaseAdapter.Holder holder, int position) {
    }
    
    protected void bind(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bind, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Views.adapters.BaseAdapter.OnItemClicker getOnItemClicker() {
        return null;
    }
    
    public final void setOnItemClicker(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Views.adapters.BaseAdapter.OnItemClicker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<java.lang.Object> getItemList() {
        return null;
    }
    
    protected final void setItemList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    com.preach.mentaldisorder.Views.adapters.BaseAdapter.OnItemClicker onItemClicker, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> itemList, int layoutResId, @org.jetbrains.annotations.Nullable()
    java.lang.String type) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/preach/mentaldisorder/Views/adapters/BaseAdapter$OnItemClicker;", "", "onItemClick", "", "position", "", "data", "type", "", "app_debug"})
    public static abstract interface OnItemClicker {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String type);
    }
}