package com.preach.mentaldisorder.Utils.GoogleUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00188G\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GoogleUtils/PaymentsUtil;", "", "()V", "MICROS", "Ljava/math/BigDecimal;", "allowedCardAuthMethods", "Lorg/json/JSONArray;", "getAllowedCardAuthMethods", "()Lorg/json/JSONArray;", "allowedCardNetworks", "getAllowedCardNetworks", "baseCardPaymentMethod", "Lorg/json/JSONObject;", "getBaseCardPaymentMethod", "()Lorg/json/JSONObject;", "baseRequest", "getBaseRequest", "cardPaymentMethod", "getCardPaymentMethod", "directTokenizationSpecification", "getDirectTokenizationSpecification", "gatewayTokenizationSpecification", "getGatewayTokenizationSpecification", "isReadyToPayRequest", "Ljava/util/Optional;", "()Ljava/util/Optional;", "merchantInfo", "getMerchantInfo", "createPaymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "activity", "Landroid/app/Activity;", "getPaymentDataRequest", "price", "", "getTransactionInfo", "microsToString", "micros", "", "app_debug"})
public final class PaymentsUtil {
    private static final java.math.BigDecimal MICROS = null;
    public static final com.preach.mentaldisorder.Utils.GoogleUtils.PaymentsUtil INSTANCE = null;
    
    private final org.json.JSONObject getBaseRequest() throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.wallet.PaymentsClient createPaymentsClient(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
        return null;
    }
    
    private final org.json.JSONObject getGatewayTokenizationSpecification() throws org.json.JSONException {
        return null;
    }
    
    private final org.json.JSONObject getDirectTokenizationSpecification() throws org.json.JSONException, java.lang.RuntimeException {
        return null;
    }
    
    private final org.json.JSONArray getAllowedCardNetworks() {
        return null;
    }
    
    private final org.json.JSONArray getAllowedCardAuthMethods() {
        return null;
    }
    
    private final org.json.JSONObject getBaseCardPaymentMethod() throws org.json.JSONException {
        return null;
    }
    
    private final org.json.JSONObject getCardPaymentMethod() throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    public final java.util.Optional<org.json.JSONObject> isReadyToPayRequest() {
        return null;
    }
    
    /**
     * Provide Google Pay API with a payment amount, currency, and amount status.
     *
     * @return information about the requested payment.
     * @throws JSONException
     * @see [TransactionInfo](https://developers.google.com/pay/api/android/reference/object.TransactionInfo)
     */
    private final org.json.JSONObject getTransactionInfo(java.lang.String price) throws org.json.JSONException {
        return null;
    }
    
    private final org.json.JSONObject getMerchantInfo() throws org.json.JSONException {
        return null;
    }
    
    /**
     * An object describing information requested in a Google Pay payment sheet
     *
     * @return Payment data expected by your app.
     * @see [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/object.PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    public final java.util.Optional<org.json.JSONObject> getPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String price) {
        return null;
    }
    
    /**
     * Converts micros to a string format accepted by [PaymentsUtil.getPaymentDataRequest].
     *
     * @param micros value of the price.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String microsToString(long micros) {
        return null;
    }
    
    private PaymentsUtil() {
        super();
    }
}