package com.preach.mentaldisorder.Models.Source.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/Repository/ServerDataSource;", "", "GetGeneralResponseCallback", "app_debug"})
public abstract interface ServerDataSource {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/preach/mentaldisorder/Models/Source/Repository/ServerDataSource$GetGeneralResponseCallback;", "Lcom/preach/mentaldisorder/Models/DataSource/BaseDataSource;", "onSuccess", "", "baseResponse", "Lcom/preach/mentaldisorder/Models/DataModels/UtilityModels/BaseResponse;", "app_debug"})
    public static abstract interface GetGeneralResponseCallback extends com.preach.mentaldisorder.Models.DataSource.BaseDataSource {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        com.preach.mentaldisorder.Models.DataModels.UtilityModels.BaseResponse baseResponse);
    }
}