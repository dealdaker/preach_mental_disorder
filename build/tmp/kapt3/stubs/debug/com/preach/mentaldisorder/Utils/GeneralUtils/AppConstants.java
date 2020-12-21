package com.preach.mentaldisorder.Utils.GeneralUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/AppConstants;", "", "()V", "Companion", "app_debug"})
public final class AppConstants {
    public static final int PHONE_CODE = 200;
    public static final int ADDRESS_CODE = 111;
    public static final int PAYMENT_CODE = 1919;
    public static final int LOCATION_CODE = 101;
    public static final int GPS_CODE = 100;
    @org.jetbrains.annotations.NotNull()
    private static final int[] REQUEST_CODES = {200, 111, 203, 1919, 101, 100};
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETURN_URL = "https://smartservetech.com/returns/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TERMS_AND_CONDITION_URL = "https://smartservetech.com/terms-and-conditions/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRIVACY_POLICY_URL = "https://smartservetech.com/privacy-policy/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STRIPE_PRODUCTION_KEY = "pk_live_HaHAZ4irTrIFlnzcV8b02OkS00zfjEq7zj";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STRIPE_TEST_KEY = "pk_test_KjgLslONR5EYBrV3nW5uxhYc00H4NgLpkY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HELP_FEEDBACK_URL = "https://smartservetech.com/support/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGNIN_API = "user/auth/authenticate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGNUP_API = "consumer/signup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGOUT_API = "user/auth/logout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_PASSWORD = "user/password/change";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGOT_PASSWORD = "user/password/forgot";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERIFY_CODE = "verify_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PASSWORD = "update_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PROFILE = "user/me";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PROFILE = "user/me";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_FCM = "update_fcm";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTAURANT_BY_CODE = "consumer/restaurant/code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_RESERVATION = "consumer/reservation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTAURANT_BY_LOCATION = "consumer/restaurant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_STRIPE_CUSTOMER = "consumer/stripe/customer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_STRIPE_CART = "consumer/stripe/customer/card";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_STRIPE_CART = "consumer/stripe/customer/card";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_PAYMENT = "consumer/stripe/payment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_REWARDS = "consumer/rewards";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REMOVE_FAV = "consumer/restaurant/{rest_id}/favourite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_FAV = "consumer/restaurant/{rest_id}/favourite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_RESTAURANT_REVIEWS = "consumer/reviews/restaurant/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_RESTAURANT_DETAIL = "consumer/restaurant/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_RESTAURANT_LIST = "consumer/restaurant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_FAV_RESTAURANT_LIST = "consumer/restaurant/favourite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_LOYALTY_POINTS = "consumer/points";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_ORDERS = "consumer/order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_REFERRAL = "user/referrals/restaurant/invite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_MESSAGE = "consumer/notification/message/send";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_BACK = "consumer/reviews/restaurant/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_LATEST_ORDER_INFO = "consumer/order/get/latest/order/info/{order_Id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_WAITER = "consumer/notification/smartcall/send";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHECK_PROMO_CODE = "consumer/rewards/promocode/redeem/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REDEEME_REWARD = "consumer/rewards/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REDEEM_REWARD = "consumer/points";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLACE_ORDER = "consumer/order/restaurant/{rest_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RE_ORDER = "consumer/order/reorder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PAYMENT_METHOD = "consumer/platform/payment/methods";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NAME = "GarageAppPrefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_LOGGED_IN = "isLoggedIn";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_DELIVERY_SELECTED = "IsDeliverySelected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_RE_ORDER = "is_re_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTAURANT = "restaurant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_AUTH = "auth";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE_PIC = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RES_ID = "uuid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BIOMETRIC_ENABLE = "biometric_enable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_ENABLE = "notification_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS = "address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_ID = "table_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTAURANT_ID = "restaurant_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIQUE_CODE = "unique_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_STATUS = "user_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STRIP_CUSTOMER = "stripe_customer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FCM_TOKEN = "fcm_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FRAGMENT_NAME = "fragment_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_URL = "web_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_NUMBER = "phone_num";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASSWORD = "password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_NAME = "first_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_NAME = "last_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PERMISSIONS = "key_permission";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFY_STATUS = "notify_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE_STATUS = "PROFILE_STATUS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANDROID = "android";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LATITUDE = "latitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LONGITUDE = "longitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROMO_CODE = "promocode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCAN_QR_CODE = "SCAN_QR_CODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ITEM_LIST = "ITEM_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR = "error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_RESULT = "PAYMENT_RESULT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_MODEL = "payment_model";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_AMOUNT = "PAYMENT_AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOBILE = "mobile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FRATGMENT_TAG = "TAG";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERIFIED = "Verified";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_ADDRESS = "Current Address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHARGE_TYPE = "Percentage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMILE = "smile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAD = "sad";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NORMAL = "normal";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY = "Category";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SORT_FILTER = "sort";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRICE_FILTER = "price";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIETARY_FILTER = "dietary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP = "Group";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REWARD_REVIEW_ADAPTER = "RewardReviewsList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPENING_TIMING_ADAPTER = "OpenTiming";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLLECTION_TYPE = "Collection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLLECTION_UUID = "048aaf25-0c68-4977-a521-04fd090c8357";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QR_CODE_TYPE = "QRCode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QR_CODE_UUID = "88976b38-1f17-4758-896a-42c9aeabebf3";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIVERY_TYPE = "Delivery";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIVERY_UUID = "eb0d5d43-2212-405a-84c4-a128ba575fb2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_TYPE = "Card";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_TYPE_UUID = "5c5f91a8-a8b9-46bc-a116-3856bc5a4521";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CARD_UUID = "cc1b82b0-0e4a-44d1-843d-66d8ad09d5d0";
    public static final com.preach.mentaldisorder.Utils.GeneralUtils.AppConstants.Companion Companion = null;
    
    public AppConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\bP\n\u0002\u0010\u0015\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010V\u001a\u00020W\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006x"}, d2 = {"Lcom/preach/mentaldisorder/Utils/GeneralUtils/AppConstants$Companion;", "", "()V", "ADDRESS", "", "ADDRESS_CODE", "", "ADD_FAV", "ADD_RESERVATION", "ANDROID", "BIOMETRIC_ENABLE", "CALL_WAITER", "CARD_UUID", "CATEGORY", "CHANGE_PASSWORD", "CHARGE_TYPE", "CHECK_PROMO_CODE", "COLLECTION_TYPE", "COLLECTION_UUID", "CREATE_PAYMENT", "CREATE_STRIPE_CART", "CREATE_STRIPE_CUSTOMER", "CURRENT_ADDRESS", "DELIVERY_TYPE", "DELIVERY_UUID", "DIETARY_FILTER", "EMAIL", "ERROR", "FCM_TOKEN", "FEED_BACK", "FIRST_NAME", "FORGOT_PASSWORD", "FRAGMENT_NAME", "FRATGMENT_TAG", "GET_FAV_RESTAURANT_LIST", "GET_LATEST_ORDER_INFO", "GET_LOYALTY_POINTS", "GET_ORDERS", "GET_PAYMENT_METHOD", "GET_PROFILE", "GET_RESTAURANT_DETAIL", "GET_RESTAURANT_LIST", "GET_RESTAURANT_REVIEWS", "GET_REWARDS", "GET_STRIPE_CART", "GPS_CODE", "GROUP", "HELP_FEEDBACK_URL", "IMAGE", "IS_DELIVERY_SELECTED", "IS_LOGGED_IN", "IS_RE_ORDER", "ITEM_LIST", "KEY_AUTH", "KEY_PERMISSIONS", "LAST_NAME", "LATITUDE", "LOCATION_CODE", "LOGOUT_API", "LONGITUDE", "MOBILE", "NORMAL", "NOTIFICATION_ENABLE", "NOTIFY_STATUS", "OPENING_TIMING_ADAPTER", "PASSWORD", "PAYMENT_AMOUNT", "PAYMENT_CODE", "PAYMENT_MODEL", "PAYMENT_RESULT", "PAYMENT_TYPE", "PAYMENT_TYPE_UUID", "PHONE_CODE", "PHONE_NUMBER", "PLACE_ORDER", "PREF_NAME", "PRICE_FILTER", "PRIVACY_POLICY_URL", "PROFILE_PIC", "PROFILE_STATUS", "PROMO_CODE", "QR_CODE_TYPE", "QR_CODE_UUID", "REDEEME_REWARD", "REDEEM_REWARD", "REMOVE_FAV", "REQUEST_CODES", "", "getREQUEST_CODES", "()[I", "RESTAURANT", "RESTAURANT_BY_CODE", "RESTAURANT_BY_LOCATION", "RESTAURANT_ID", "RES_ID", "RETURN_URL", "REWARD_REVIEW_ADAPTER", "RE_ORDER", "SAD", "SCAN_QR_CODE", "SEND_MESSAGE", "SEND_REFERRAL", "SIGNIN_API", "SIGNUP_API", "SMILE", "SORT_FILTER", "STRIPE_PRODUCTION_KEY", "STRIPE_TEST_KEY", "STRIP_CUSTOMER", "TABLE_ID", "TERMS_AND_CONDITION_URL", "UNIQUE_CODE", "UPDATE_FCM", "UPDATE_PASSWORD", "UPDATE_PROFILE", "USER_ID", "USER_STATUS", "VERIFIED", "VERIFY_CODE", "WEB_URL", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final int[] getREQUEST_CODES() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}