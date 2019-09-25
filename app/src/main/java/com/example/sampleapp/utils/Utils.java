package com.example.sampleapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;


import com.example.sampleapp.R;
import com.yarolegovich.lovelydialog.LovelyStandardDialog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Akhil on 20/2/2018.
 */

public class Utils {


    public static final byte[] UNICODE_TEXT = new byte[]{0x23, 0x23, 0x23,
            0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23,
            0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23, 0x23,
            0x23, 0x23, 0x23};


    public static final byte[] UNICODE_DOTED_LINE = new byte[]{
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d,
            0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d, 0x2d};


    public static final byte[] UNICODE_LINE = new byte[]{
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f,
            0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f};

    private static String hexStr = "0123456789ABCDEF";
    private static String[] binaryArray = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};

    public static final void infoDialogue(Context context, String message) {


        new LovelyStandardDialog(context, LovelyStandardDialog.ButtonLayout.VERTICAL)
                .setTopColorRes(R.color.orange)
                .setButtonsColorRes(R.color.orange)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("For Your Information")
                .setMessage(message)
                .setPositiveButton("Close", null)
                .show();
    }public static final void infoDialogue(Context context, String title, String message) {


        new LovelyStandardDialog(context, LovelyStandardDialog.ButtonLayout.VERTICAL)
                .setTopColorRes(R.color.orange)
                .setButtonsColorRes(R.color.orange)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Close", null)
                .show();
    }


    public static final void errorDialogue(Context context, String message) {


        new LovelyStandardDialog(context, LovelyStandardDialog.ButtonLayout.VERTICAL)
                .setTopColorRes(R.color.darkred)
                .setButtonsColorRes(R.color.darkred)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Something Went Wrong")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, null)
                .show();
    }


    public static final void sucessDialogue(Context context, String message) {
        // Create Alert using Builder
        new LovelyStandardDialog(context, LovelyStandardDialog.ButtonLayout.VERTICAL)
                .setTopColorRes(R.color.d2d_pink)
                .setButtonsColorRes(R.color.d2d_pink)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("For Your Information")
                .setMessage(message)
                .setPositiveButton("Close", null)
                .show();
    }


    public static Float getTotalPrice(float unitPrice, float qty, float productTax, float productDiscount) {
        float total = 0.0f;
        float totalAmount = unitPrice * qty;
        double discount = (Double.parseDouble(String.valueOf(productDiscount)) / 100) * totalAmount;
        float netTotal = totalAmount - Float.parseFloat(String.valueOf(discount));
        double tax = (Double.parseDouble(String.valueOf(productTax)) / 100) * netTotal;
        total = netTotal + Float.parseFloat(String.valueOf(tax));
        String roundedAmount = String.format("%.3f", total);
        return Float.valueOf(roundedAmount);

    }


    public static Float getNetPrice(float unitPrice, float qty, float productDiscount) {
        float total = 0.0f;
        float totalAmount = unitPrice * qty;
        double discount = (Double.parseDouble(String.valueOf(productDiscount)) / 100) * totalAmount;
        float netTotal = totalAmount - Float.parseFloat(String.valueOf(discount));
        String roundedAmount = String.format("%.2f", netTotal);
        return Float.valueOf(roundedAmount);

    }


    public static byte[] decodeBitmap(Bitmap bmp) {
        int bmpWidth = bmp.getWidth();
        int bmpHeight = bmp.getHeight();

        List<String> list = new ArrayList<String>(); //binaryString list
        StringBuffer sb;


        int bitLen = bmpWidth / 8;
        int zeroCount = bmpWidth % 8;

        String zeroStr = "";
        if (zeroCount > 0) {
            bitLen = bmpWidth / 8 + 1;
            for (int i = 0; i < (8 - zeroCount); i++) {
                zeroStr = zeroStr + "0";
            }
        }

        for (int i = 0; i < bmpHeight; i++) {
            sb = new StringBuffer();
            for (int j = 0; j < bmpWidth; j++) {
                int color = bmp.getPixel(j, i);

                int r = (color >> 16) & 0xff;
                int g = (color >> 8) & 0xff;
                int b = color & 0xff;

                // if color close to white，bit='0', else bit='1'
                if (r > 160 && g > 160 && b > 160)
                    sb.append("0");
                else
                    sb.append("1");
            }
            if (zeroCount > 0) {
                sb.append(zeroStr);
            }
            list.add(sb.toString());
        }

        List<String> bmpHexList = binaryListToHexStringList(list);
        String commandHexString = "1D763000";
        String widthHexString = Integer
                .toHexString(bmpWidth % 8 == 0 ? bmpWidth / 8
                        : (bmpWidth / 8 + 1));
        if (widthHexString.length() > 2) {
            Logger.e(" width is too large");
            return null;
        } else if (widthHexString.length() == 1) {
            widthHexString = "0" + widthHexString;
        }
        widthHexString = widthHexString + "00";

        String heightHexString = Integer.toHexString(bmpHeight);
        if (heightHexString.length() > 2) {
            Logger.e(" height is too large");
            return null;
        } else if (heightHexString.length() == 1) {
            heightHexString = "0" + heightHexString;
        }
        heightHexString = heightHexString + "00";

        List<String> commandList = new ArrayList<String>();
        commandList.add(commandHexString + widthHexString + heightHexString);
        commandList.addAll(bmpHexList);

        return hexList2Byte(commandList);
    }


    public static List<String> binaryListToHexStringList(List<String> list) {
        List<String> hexList = new ArrayList<String>();
        for (String binaryStr : list) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < binaryStr.length(); i += 8) {
                String str = binaryStr.substring(i, i + 8);

                String hexString = myBinaryStrToHexString(str);
                sb.append(hexString);
            }
            hexList.add(sb.toString());
        }
        return hexList;

    }

    public static String myBinaryStrToHexString(String binaryStr) {
        String hex = "";
        String f4 = binaryStr.substring(0, 4);
        String b4 = binaryStr.substring(4, 8);
        for (int i = 0; i < binaryArray.length; i++) {
            if (f4.equals(binaryArray[i]))
                hex += hexStr.substring(i, i + 1);
        }
        for (int i = 0; i < binaryArray.length; i++) {
            if (b4.equals(binaryArray[i]))
                hex += hexStr.substring(i, i + 1);
        }

        return hex;
    }

    public static byte[] hexList2Byte(List<String> list) {
        List<byte[]> commandList = new ArrayList<byte[]>();

        for (String hexStr : list) {
            commandList.add(hexStringToBytes(hexStr));
        }
        byte[] bytes = sysCopy(commandList);
        return bytes;
    }

    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    public static byte[] sysCopy(List<byte[]> srcArrays) {
        int len = 0;
        for (byte[] srcArray : srcArrays) {
            len += srcArray.length;
        }
        byte[] destArray = new byte[len];
        int destLen = 0;
        for (byte[] srcArray : srcArrays) {
            System.arraycopy(srcArray, 0, destArray, destLen, srcArray.length);
            destLen += srcArray.length;
        }
        return destArray;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }


    public static void gettimediff(String message, long startTime, long endTime) {
        System.out.println("*********message************ " + (endTime - startTime) + " ns");
        System.out.println("*********message************ " + (endTime - startTime) / 0.000001 + " ms");

    }

    public static long getCurrentTIme() {
        return System.nanoTime();
    }


    public static float stockMuliple(float qty, double uom) {

        return (float) (qty * uom);
    }

    public static float stockPriceMuliple(float price, float qty, double uom) {

        return (float) (qty * uom);
    }

    public static float stockMuliple(float qty, float uom) {

        return (qty * uom);
    }


    public static String removeNull(String data) {
        String vaule = "";
        if (!TextUtils.isEmpty(data)) {
            vaule = data;
        }
        return vaule;
    }


  /*  public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();


    }*/


    public static void setListViewHeightBasedOnChildren(ListView listView) {

        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter != null) {

            int numberOfItems = listAdapter.getCount();

            // Get total height of all items.
            int totalItemsHeight = 0;
            for (int itemPos = 0; itemPos < numberOfItems; itemPos++) {
                View item = listAdapter.getView(itemPos, null, listView);
                float px = 500 * (listView.getResources().getDisplayMetrics().density);
                item.measure(View.MeasureSpec.makeMeasureSpec((int) px, View.MeasureSpec.AT_MOST), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                totalItemsHeight += item.getMeasuredHeight();
            }

            // Get total height of all item dividers.
            int totalDividersHeight = listView.getDividerHeight() * (numberOfItems - 1);
            // Get padding
            int totalPadding = listView.getPaddingTop() + listView.getPaddingBottom();

            // Set list height.
            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalItemsHeight + totalDividersHeight + totalPadding;
            listView.setLayoutParams(params);
            listView.requestLayout();


        } else {

        }

    }


    public static void setListViewHeightBasedOnChildren(GridView listView, int rows) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        if (listAdapter.getCount() <= 0) {
            // pre-condition
            return;
        }

        int countList = Math.round(listAdapter.getCount() / rows) + 1;

        int totalHeight = 0;
        for (int i = 0; i < countList; i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getHorizontalSpacing() * (countList - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    public static int getCurrentDay(String stringdate) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD");
        try {
            date = simpleDateFormat.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int id = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String dayOfTheWeek = sdf.format(date);
        switch (dayOfTheWeek) {
            case "Monday":
                id = 1;
                break;

            case "Tuesday":
                id = 2;
                break;

            case "Wednesday":
                id = 3;
                break;

            case "Thursday":
                id = 4;
                break;

            case "Friday":
                id = 5;
                break;

            case "Saturday":
                id = 6;
                break;

            case "Sunday":
                id = 7;
                break;
        }


        return id;
    }


//    public static int getCustomerStatus(Date lastSaleDate) {
//
//
//        Calendar lastSaleDatecalendar = Calendar.getInstance();
//        lastSaleDatecalendar.setTime(lastSaleDate);
//
//        long msDiff = Calendar.getInstance().getTimeInMillis() - lastSaleDatecalendar.getTimeInMillis();
//        long daysDiff = TimeUnit.MILLISECONDS.toDays(msDiff);
//
//        if (msDiff <= 7) {
//            return CustomerDaoModel.LOW;
//        } else if (msDiff <= 15) {
//            return CustomerDaoModel.NORMAL;
//        } else {
//            return CustomerDaoModel.HIGH;
//        }
//    }


}
