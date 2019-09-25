package com.example.sampleapp.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/**
 * Created by Akhil on 20/2/2018.
 */

public class AppPreferenceManager {


    Context context;

    public AppPreferenceManager(Context context) {

        this.context = context;
    }

    public void updateContext(Context context) {
        this.context = context;
    }


    public boolean getLoginStatus() {
        return ObjectFactory.getInstance(context).getAppPreference().isLogin();
    }

    public void setLoginStatus(boolean data) {
        ObjectFactory.getInstance(context).getAppPreference().setLoginStatus(data);
    }

    public int getVersionCode() {
        return ObjectFactory.getInstance(context).getAppPreference().getVersion();
    }


    public void setVersionCode(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setVersion(data);
    }


    public String getSalesmanName() {
        return ObjectFactory.getInstance(context).getAppPreference().getSalesmanName();
    }



    public void setRegion(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setRegion(data);
    }


    public String getRegion() {
        return ObjectFactory.getInstance(context).getAppPreference().getRegion();
    }


    public void setArea(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setArea(data);
    }


    public String getArea() {
        return ObjectFactory.getInstance(context).getAppPreference().getArea();
    }

    public void setBuilding(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setBuilding(data);
    }


    public String getBuilding (){
        return ObjectFactory.getInstance(context).getAppPreference().getBuilding();
    }




    public void setSalesmanName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setSalesmanName(data);
    }

    public int getSalesmanId() {
        return ObjectFactory.getInstance(context).getAppPreference().getSalesmanId();
    }

    public void setSalesmanId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setSalesmanId(data);
    }


    public String getVehicleName() {
        return ObjectFactory.getInstance(context).getAppPreference().getVehicleName();
    }

    public void setVehicleName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setVehicleName(data);
    }


    public int getVehicleId() {
        return ObjectFactory.getInstance(context).getAppPreference().getVehicleId();
    }

    public void setVehicleId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setVehicleId(data);
    }


    public String getDriverName() {
        return ObjectFactory.getInstance(context).getAppPreference().getDriverName();
    }

    public void setDriverName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setDriverName(data);
    }

    public int getDriverId() {
        return ObjectFactory.getInstance(context).getAppPreference().getDriverId();
    }

    public void setDriverId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setDriverId(data);
    }


    public String getRouteName() {
        return ObjectFactory.getInstance(context).getAppPreference().getRouteName();
    }

    public void setRouteName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setRouteName(data);
    }

    public String getRouteCode() {
        return ObjectFactory.getInstance(context).getAppPreference().getRouteCode();
    }

    public void setRouteCode(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setRouteCode(data);
    }

    public int getRouteId() {
        return ObjectFactory.getInstance(context).getAppPreference().getRouteId();
    }

    public void setRouteId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setRouteId(data);
    }


    public int getTripId() {
        return ObjectFactory.getInstance(context).getAppPreference().getTripId();
    }

    public void setTripId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setTripId(data);
    }


    public String getTripName() {
        return ObjectFactory.getInstance(context).getAppPreference().getTripName();
    }

    public void setTripName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setTripName(data);
    }


    public int getScheduleId() {
        return ObjectFactory.getInstance(context).getAppPreference().getScheduleId();
    }

    public void setScheduleId(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setScheduleId(data);
    }


    public String getScheduleName() {
        return ObjectFactory.getInstance(context).getAppPreference().getScheduleName();
    }

    public void setScheduleName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setScheduleName(data);
    }


    public String getScheduleDate() {
        return ObjectFactory.getInstance(context).getAppPreference().getScheduleDate();
    }

    public void setScheduleDate(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setScheduleDate(data);
    }

    public void setBlueToothDevice(BluetoothDevice blueToothDevice) {

        String data = "";
        if (blueToothDevice != null) {

            data = blueToothDevice.getAddress();
        }

        ObjectFactory.getInstance(context).getAppPreference().setSelectedBluetooth(data);


    }

    public String getBlueToothDevice() {
        String data = ObjectFactory.getInstance(context).getAppPreference().getSelectedBluetooth();
        return data;

    }


    public String getCompanyName() {
        return ObjectFactory.getInstance(context).getAppPreference().getCompanyName();
    }

    public void setCompanyName(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setCompanyName(data);
    }

    public int getNoOfDays() {
        return ObjectFactory.getInstance(context).getAppPreference().getNoOfDays();
    }

    public void setNoOfDays(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setNoOfDays(data);
    }

    public String getCompanyWeb() {
        return ObjectFactory.getInstance(context).getAppPreference().getCompanyWeb();
    }

    public void setCompanyWeb(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setCompanyWeb(data);
    }

    public String getFooter() {
        return ObjectFactory.getInstance(context).getAppPreference().getFooter();
    }

    public void setFooter(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setFooter(data);
    }


    public String getEmail() {
        return ObjectFactory.getInstance(context).getAppPreference().getEmail();
    }

    public void setEmail(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setEmail(data);
    }

    public String getAddress() {
        return ObjectFactory.getInstance(context).getAppPreference().getAddress();
    }

    public void setAddress(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setAddress(data);
    }


    public String getTrn() {
        return ObjectFactory.getInstance(context).getAppPreference().getTrn();
    }

    public void setTrn(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setTrn(data);
    }

    public String getKeyCustomercareNo() {
        return ObjectFactory.getInstance(context).getAppPreference().getKeyCustomercareNo();
    }

    public void setKeyCustomercareNo(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setKeyCustomercareNo(data);
    }

    public String getMobile() {
        return ObjectFactory.getInstance(context).getAppPreference().getMobile();
    }

    public void setMobile(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setMobile(data);
    }

    public String getPhone() {
        return ObjectFactory.getInstance(context).getAppPreference().getPhone();
    }

    public void setPhone(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setPhone(data);
    }

    public int getSort() {
        return ObjectFactory.getInstance(context).getAppPreference().getSort();
    }

    public void setSort(int data) {
        ObjectFactory.getInstance(context).getAppPreference().setSort(data);
    }

    public String getFCM() {
        return ObjectFactory.getInstance(context).getAppPreference().getFCM();
    }

    public void setFCM(String data) {
        ObjectFactory.getInstance(context).getAppPreference().setFCM(data);
    }

    public void setBillFooter(String companyname) {
        ObjectFactory.getInstance(context).getAppPreference().setBillFooter(companyname);

    }

    public String getBillFooter() {
        String data = ObjectFactory.getInstance(context).getAppPreference().getBillFooter();
        return data;

    }

}
