package com.example.sampleapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Akhil on 10-08-2016.
 */
public class AppPreference {

    private Context context;
    private static final String KEY_LOGIN = "KEY_LOGIN";
    private static final String KEY_VERSION_NUMBER = "KEY_VERSION_NUMBER";
    private static final String KEY_SALESMAN_NAME = "KEY_SALESMAN_NAME";
    private static final String KEY_SALESMAN_ID = "KEY_SALESMAN_ID";
    private static final String KEY_LAT = "lat";
    private static final String KEY_LON = "lon";
    private static final String KEY_REGION = "region";
    private static final String KEY_AREA = "area";
    private static final String KEY_BUILDING = "building";
    private static final String KEY_VEHICLE_ID = "KEY_VEHICLE_ID";
    private static final String KEY_VEHICLE_NAME = "KEY_VEHICLE_NAME";
    private static final String KEY_DRIVER_ID = "KEY_DRIVER_ID";
    private static final String KEY_DRIVER_NAME = "KEY_DRIVER_NAME";
    private static final String KEY_ROUTE_ID = "KEY_ROUTE_ID";
    private static final String KEY_ROUTE_CODE = "KEY_ROUTE_CODE";
    private static final String KEY_ROUTE_NAME = "KEY_ROUTE_NAME";
    private static final String KEY_TRIP_ID = "KEY_TRIP_ID";
    private static final String KEY_TRIP_NAME = "KEY_TRIP_NAME";
    private static final String KEY_SCHEDULE_ID = "KEY_SCHEDULE_ID";
    private static final String KEY_SCHEDULE_NAME = "KEY_SCHEDULE_NAME";
    private static final String KEY_SCHEDULE_DATE = "KEY_SCHEDULE_DATE";
    private static final String KEY_BLUETOOTH_DEVICES = "KEY_BLUETOOTH_DEVICES";
    private static final String KEY_COMPANY_NAME = "KEY_COMPANY_NAME";
    private static final String KEY_NO_DAYS = "KEY_NO_DAYS";
    private static final String KEY_WEB = "KEY_WEB";
    private static final String KEY_FOOTER = "KEY_FOOTER";
    private static final String KEY_EMAIL = "KEY_EMAIL";
    private static final String KEY_ADDRESS = "KEY_ADDRESS";
    private static final String KEY_TRN = "KEY_TRN";
    private static final String KEY_CUSTOMERCARE_NO = "KEY_CUSTOMERCARE_NO";
    private static final String KEY_MOBILE = "KEY_MOBILE";
    private static final String KEY_PHONE = "KEY_PHONE";
    private static final String KEY_SORT = "KEY_SORT";
    private static final String KEY_FCM = "KEY_FCM";
    private static final String KEY_BILL_FOOTER = "KEY_BILL_FOOTER";

    public AppPreference(Context context) {

        this.context = context;
    }

    public void updateContext(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPreferences() {
        SharedPreferences pref = context.getApplicationContext().getSharedPreferences("MDSSALE", context.getApplicationContext().MODE_PRIVATE);
        return pref;
    }

    public boolean isLogin() {
        return getSharedPreferences().getBoolean(KEY_LOGIN, false);
    }

    public void setLoginStatus(boolean status) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putBoolean(KEY_LOGIN, status);
        editor.apply();
        editor.commit();
    }

    public void setVersion(int version) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_VERSION_NUMBER, version);
        editor.apply();
        editor.commit();
    }


    public int getVersion() {

        return getSharedPreferences().getInt(KEY_VERSION_NUMBER, -1);
    }

    public void setSalesmanName(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_SALESMAN_NAME, name);
        editor.apply();
        editor.commit();

    }

    public String getSalesmanName() {

        return getSharedPreferences().getString(KEY_SALESMAN_NAME, "");

    }

    public void setSalesmanId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_SALESMAN_ID, id);
        editor.apply();
        editor.commit();

    }
    public void setLat(String lat) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(lat, lat);
        editor.apply();
        editor.commit();
    } public void setLog(String log) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(log, log);
        editor.apply();
        editor.commit();
    }

    public String getLat(){
        return getSharedPreferences().getString(KEY_LAT,"no_data");

    }
    public String getLon(){
        return getSharedPreferences().getString(KEY_LON, "no_data");

    }
    public int getSalesmanId() {
        return getSharedPreferences().getInt(KEY_SALESMAN_ID, -1);

    }


    public void setVehicleName(String name) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_VEHICLE_NAME, name);
        editor.apply();
        editor.commit();

    }

    public void setRegion(String region) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_REGION, region);
        editor.apply();
        editor.commit();

    }

    public String getRegion() {
        return getSharedPreferences().getString(KEY_REGION, "");
    }

    public void setArea(String area) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_AREA, area);
        editor.apply();
        editor.commit();
    }

    public String getArea() {
        return getSharedPreferences().getString(KEY_AREA, "");
    }

    public void setBuilding(String building) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_BUILDING, building);
        editor.apply();
        editor.commit();
    }

    public String getBuilding() {

        return getSharedPreferences().getString(KEY_BUILDING, "");

    }



    public String getVehicleName() {

        return getSharedPreferences().getString(KEY_VEHICLE_NAME, "");

    }

    public void setVehicleId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_VEHICLE_ID, id);
        editor.apply();
        editor.commit();

    }

    public int getVehicleId() {

        return getSharedPreferences().getInt(KEY_VEHICLE_ID, -1);

    }


    public void setDriverName(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_DRIVER_NAME, name);
        editor.apply();
        editor.commit();

    }

    public String getDriverName() {

        return getSharedPreferences().getString(KEY_DRIVER_NAME, "");

    }

    public void setDriverId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_DRIVER_ID, id);
        editor.apply();
        editor.commit();

    }

    public int getDriverId() {

        return getSharedPreferences().getInt(KEY_DRIVER_ID, -1);

    }


    public void setRouteName(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_ROUTE_NAME, name);
        editor.apply();
        editor.commit();

    }

    public String getRouteName() {

        return getSharedPreferences().getString(KEY_ROUTE_NAME, "");

    }

    public void setRouteCode(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_ROUTE_CODE, name);
        editor.apply();
        editor.commit();

    }

    public String getRouteCode() {

        return getSharedPreferences().getString(KEY_ROUTE_CODE, "");

    }

    public void setRouteId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_ROUTE_ID, id);
        editor.apply();
        editor.commit();

    }

    public int getRouteId() {

        return getSharedPreferences().getInt(KEY_ROUTE_ID, -1);

    }


    public void setTripId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_TRIP_ID, id);
        editor.apply();
        editor.commit();

    }

    public int getTripId() {

        return getSharedPreferences().getInt(KEY_TRIP_ID, -1);

    }

    public void setTripName(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_TRIP_NAME, name);
        editor.apply();
        editor.commit();

    }

    public String getTripName() {

        return getSharedPreferences().getString(KEY_TRIP_NAME, "");

    }


    public void setScheduleId(int id) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_SCHEDULE_ID, id);
        editor.apply();
        editor.commit();

    }

    public int getScheduleId() {

        return getSharedPreferences().getInt(KEY_SCHEDULE_ID, -1);

    }


    public void setScheduleName(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_SCHEDULE_NAME, name);
        editor.apply();
        editor.commit();

    }

    public String getScheduleName() {

        return getSharedPreferences().getString(KEY_SCHEDULE_NAME, "");

    }


    public void setScheduleDate(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_SCHEDULE_DATE, name);
        editor.apply();
        editor.commit();

    }

    public String getScheduleDate() {

        return getSharedPreferences().getString(KEY_SCHEDULE_DATE, "");

    }


    public void setSelectedBluetooth(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_BLUETOOTH_DEVICES, data);
        editor.apply();
        editor.commit();
    }


    public String getSelectedBluetooth() {

        return getSharedPreferences().getString(KEY_BLUETOOTH_DEVICES, "");
    }


    public void setCompanyName(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_COMPANY_NAME, data);
        editor.apply();
        editor.commit();
    }


    public String getCompanyName() {

        return getSharedPreferences().getString(KEY_COMPANY_NAME, "");
    }


    public void setNoOfDays(int data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_NO_DAYS, data);
        editor.apply();
        editor.commit();
    }


    public int getNoOfDays() {

        return getSharedPreferences().getInt(KEY_NO_DAYS, -1);
    }


    public void setCompanyWeb(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_WEB, data);
        editor.apply();
        editor.commit();
    }


    public String getCompanyWeb() {

        return getSharedPreferences().getString(KEY_WEB, "");
    }

    public void setFooter(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_FOOTER, data);
        editor.apply();
        editor.commit();
    }


    public String getFooter() {

        return getSharedPreferences().getString(KEY_FOOTER, "");
    }


    public void setEmail(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_EMAIL, data);
        editor.apply();
        editor.commit();
    }


    public String getEmail() {

        return getSharedPreferences().getString(KEY_EMAIL, "");
    }


    public void setAddress(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_ADDRESS, data);
        editor.apply();
        editor.commit();
    }


    public String getAddress() {

        return getSharedPreferences().getString(KEY_ADDRESS, "");
    }

    public void setTrn(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_TRN, data);
        editor.apply();
        editor.commit();
    }

    public String getTrn() {

        return getSharedPreferences().getString(KEY_TRN, "");
    }


    public void setKeyCustomercareNo(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_CUSTOMERCARE_NO, data);
        editor.apply();
        editor.commit();
    }

    public String getKeyCustomercareNo() {

        return getSharedPreferences().getString(KEY_CUSTOMERCARE_NO, "");
    }

    public void setMobile(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_MOBILE, data);
        editor.apply();
        editor.commit();
    }

    public String getMobile() {

        return getSharedPreferences().getString(KEY_MOBILE, "");
    }

    public void setPhone(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_PHONE, data);
        editor.apply();
        editor.commit();
    }

    public String getPhone() {

        return getSharedPreferences().getString(KEY_PHONE, "");
    }

    public void setSort(int data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(KEY_SORT, data);
        editor.apply();
        editor.commit();
    }

    public int getSort() {

        return getSharedPreferences().getInt(KEY_SORT, 0);
    }


    public void setFCM(String name) {

        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_FCM, name);
        editor.apply();
        editor.commit();

    }

    public String getFCM() {

        return getSharedPreferences().getString(KEY_FCM, "");

    }


    public void setBillFooter(String data) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(KEY_BILL_FOOTER, data);
        editor.apply();
        editor.commit();
    }


    public String getBillFooter() {

        return getSharedPreferences().getString(KEY_BILL_FOOTER, "");
    }


}
