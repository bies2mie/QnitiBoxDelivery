package com.badrul.qnitiboxdelivery;

public class Config {

    public static final String PROFILE = "https://qnitibox.qniti.com/apps/deliverer/getdelivererinfo.php?delivererEmail=";

    public static final String EMPTY_JOB = "https://qnitibox.qniti.com/apps/deliverer/emptyjobdisplay.php?orderLocation=";

    public static final String ACTIVE_STATUS = "https://qnitibox.qniti.com/apps/deliverer/activestatus.php";

    public static final String ACCEPT_JOB_URL = "https://qnitibox.qniti.com/apps/deliverer/acceptjob.php";

    public static final String ACCEPT_ORDER_URL = "https://qnitibox.qniti.com/apps/deliverer/acceptorder.php";

    public static final String CANCEL_ORDER_URL = "https://qnitibox.qniti.com/apps/deliverer/cancelorder.php";

    public static final String ORDER_STATUS_PROCESSING = "https://qnitibox.qniti.com/apps/deliverer/orderstatusprocessing.php?delivererID=";

    public static final String ORDER_STATUS_COMPLETE = "https://qnitibox.qniti.com/apps/deliverer/orderstatuscomplete.php?delivererID=";


    public static final String SHARED_PREF_NAME = "jimatBox";

    public static final String USER_TOKEN = "userToken";

    public static final String ORDER_ID = "orderid";
    public static final String SELLER_NAME = "sellerName";
    public static final String SELLER_LOCATION = "sellerLocation";
    public static final String SELLER_PHONE = "sellerPhone";
    public static final String RECEIVER_NAME = "receiverName";
    public static final String RECEIVER_LOCATION = "receiverLocation";
    public static final String RECEIVER_PHONE = "receiverPhone";
    public static final String FOOD_TYPE = "foodType";
    public static final String FOOD_PRICE = "foodPrice";
    public static final String ORDER_STATUS = "orderStatus";
    public static final String ORDER_DELIVER_ID = "orderDeliverID";

    //For User
    public static final String DE_ID2 = "dID2";
    public static final String DE_NAME2 = "dName";
    public static final String DE_EMAIL = "dEmail";
    public static final String DE_LOCATION = "dLocation";
    public static final String DE_PHONE = "dPhone";
    public static final String DE_ACTIVE = "dActive";

    /*
    public static final String MENU_TYPE = "menuType";
    public static final String MENU_DAY = "menuDay";
    public static final String ORDER_DATE = "orderDate";
    public static final String ORDER_TIME = "orderTime";

    public static final String ACCEPT_ORDER_URL = "https://qnitibox.qniti.com/apps/seller/acceptorder.php";

    public static final String CANCEL_ORDER_URL = "https://qnitibox.qniti.com/apps/seller/cancelorder.php";


    public static final String FEEDBACK_URL = "https://qnitibox.qniti.com/apps/admin/feedback.php";

    public static final String TOTAL_FOOD_PRICE = "totalfoodPrice";

    public static final String SCANNER_URL = "https://qnitibox.qniti.com/apps/seller/scanner.php?orderID=";

    public static final String ORDER_STATUS_COMPLETE = "https://qnitibox.qniti.com/apps/seller/orderstatuscomplete.php?orderLocation=";
    public static final String ORDER_STATUS_PROCESSING = "https://qnitibox.qniti.com/apps/seller/orderstatusprocessing.php?orderLocation=";
    public static final String PROFILE = "https://qnitibox.qniti.com/apps/seller/getsellerinfo.php?sellerUserName=";

    public static final String PROCESSING_CHECK_TODAY_QTT = "https://qnitibox.qniti.com/apps/seller/gettodayqttprocessing.php?currentDate=";
    public static final String COMPLETE_CHECK_TODAY_QTT = "https://qnitibox.qniti.com/apps/seller/gettodayqttcomplete.php?currentDate=";
    //FOR ORDER
    public static final String ORDER_ID = "orderid";
    public static final String CARD_ID = "cardID";
    public static final String NAME_ID = "nameID";
    public static final String PHONE_ID = "phoneID";
    public static final String EMAIL_ID = "emailID";
    public static final String MATRIX_ID = "matrixID";
    public static final String ORDER_TYPE = "orderType";
    public static final String ORDER_DAY = "orderDay";
    public static final String ORDER_DATE2 = "orderDate2";
    public static final String ORDER_TIME2 = "orderTime2";
    public static final String ORDER_COMPLETEDATE = "CompleteDate";
    public static final String ORDER_COMPLETETIME = "CompleteTime";
    public static final String ORDER_QTT = "orderQTT";
    public static final String ORDER_USERTYPE = "orderUserType";
    public static final String PICKUP_LOCATION = "puLocation";
    public static final String PICKUP_TIME = "puTime";

    public static final String FROM_SCANNER = "frScanner";

    public static final String COMPLETE_DATE = "completeDate";
    public static final String COMPLETE_TIME = "completeTime";
    public static final String ORDER_STATUS = "orderStatus";



    //For User
    public static final String S_ID2 = "sID2";
    public static final String SELLER_ID2 = "sellerID2";
    public static final String SELLER_NAME2 = "snameID2";
    public static final String SELLER_PHONE2 = "sphoneID2";
    public static final String SELLER_LOCATION = "slocationID";

    */
    public static final String LOGIN_URL = "https://qnitibox.qniti.com/apps/deliverer/logindeliverer.php";
    public static final String REGISTER_URL = "https://qnitibox.qniti.com/apps/deliverer/registerdeliverer.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
//public static final String KEY_ID = "userIC";
    public static final String KEY_PASSWORD = "delivererPass";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //This would be used to store the phone number of current logged in user
    public static final String ID_SHARED_PREF = "userID";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";


}
