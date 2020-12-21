package com.preach.mentaldisorder.Utils.GeneralUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0003J6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/NotificationHelper;", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "notificationManager", "Landroid/app/NotificationManager;", "cancelNotification", "notificationId", "", "createChannels", "", "createNotificationBuilder", "Landroid/app/Notification$Builder;", "title", "", "body", "cancelAble", "", "pendingIntent", "Landroid/app/PendingIntent;", "channelId", "deleteChannel", "makeNotification", "builder", "Companion", "app_debug"})
public final class NotificationHelper extends android.content.ContextWrapper {
    private final android.app.NotificationManager notificationManager = null;
    private static final java.lang.String MESSAGE_NOTIFICATION_TITLE = "Message Notification Channel";
    private static final java.lang.String COMMENT_NOTIFICATION_TITLE = "Comment Notification Channel";
    private static final java.lang.String DEFAULT_NOTIFICATION_TITLE = "Application Notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_NOTIFICATION_CHANNEL = "com.uds.Kidcap.Utils.message_channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMENT_NOTIFICATION_CHANNEL = "com.uds.Kidcap.Utilse.comment_channel";
    private static final java.lang.String DEFAULT_NOTIFICATION_CHANNEL = "com.uds.Kidcap.Utils.default_channel";
    public static final com.preach.mentaldisorder.Utils.GeneralUtils.NotificationHelper.Companion Companion = null;
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    private final void createChannels() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification.Builder createNotificationBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body, boolean cancelAble, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pendingIntent, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    public final com.preach.mentaldisorder.Utils.GeneralUtils.NotificationHelper deleteChannel(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Utils.GeneralUtils.NotificationHelper makeNotification(@org.jetbrains.annotations.NotNull()
    android.app.Notification.Builder builder, int notificationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.preach.mentaldisorder.Utils.GeneralUtils.NotificationHelper cancelNotification(int notificationId) {
        return null;
    }
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/NotificationHelper$Companion;", "", "()V", "COMMENT_NOTIFICATION_CHANNEL", "", "COMMENT_NOTIFICATION_TITLE", "DEFAULT_NOTIFICATION_CHANNEL", "DEFAULT_NOTIFICATION_TITLE", "MESSAGE_NOTIFICATION_CHANNEL", "MESSAGE_NOTIFICATION_TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}