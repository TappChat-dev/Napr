package com.napr.ProectUtil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import com.napr.R;

public class ProjectUtil {
    public static final String ACESSCODE = "acesscode";
    public static final String ADDRESS = "address";
    public static final String CALLCENTERNUMBER = "callcenternumber";
    public static final String CITY = "city";
    public static final String CITYID = "cityid";
    public static final String DATE = "dateData";
    public static final String DEALERMOBILE = "dealermobile";
    public static final String DEALERNAME = "dealername";
    public static final String EMAILID = "emailid";
    public static final String ENGGID = "engid";
    public static final String ENGINEERNAME = "engineername";
    public static final String FIRSTNAME = "firstname";
    public static final String FULLNAME = "fullname";
    public static final String HAPPYCODE = "happycode";
    public static final String LANDMARK = "landmark";
    public static final String LASTNAME = "lastname";
    public static final String LATETITUDE = "latitude";
    public static final String LOCLITY = "locality";
    public static final String LOCLITYID = "localityid";
    public static final String LONGITUDE = "longitude";
    public static final String MESSAGE = "message";
    public static final String MOBILE = "mobile";
    public static final String NAME = "name";
    public static final String PINCODE = "pincode";
    public static final String QRVALUE = "qrvalue";
    public static final String ROLENAME = "rolename";
    public static final String SESSION = "session";
    public static final String STATE = "state";
    public static final String STATEID = "stateid";
    public static final String TITLE = "title";
    public static final String TOTALREGISTRATION = "totalregistration";
    public static final String USERID = "userid";
    public static final String USERTYPE = "usertype";
    public static final String VALUE = "value";
    public static final String WEBSITE = "website";
    public static final String WHATSAPP = "whatsapp";
    public static final String POINT = "point";
    public static final String ENTEREDID = "enteredid";
    public static final String ENTEREDTYPE = "enteredtype";
    public static final String DEALERID = "dealerid";

    public static String getDealerid(Context context) {
        return context.getSharedPreferences(DEALERID, 0).getString(DEALERID, "");
    }

    public static void setDealerid(Context context, String terminal_id) {
        context.getSharedPreferences(DEALERID, 0).edit().putString(DEALERID, terminal_id).commit();
    }


    public static String getEnteredtype(Context context) {
        return context.getSharedPreferences(ENTEREDTYPE, 0).getString(ENTEREDTYPE, "");
    }

    public static void setEnteredtype(Context context, String terminal_id) {
        context.getSharedPreferences(ENTEREDTYPE, 0).edit().putString(ENTEREDTYPE, terminal_id).commit();
    }

    public static String getEnteredid(Context context) {
        return context.getSharedPreferences(ENTEREDID, 0).getString(ENTEREDID, "");
    }

    public static void setEnteredid(Context context, String terminal_id) {
        context.getSharedPreferences(ENTEREDID, 0).edit().putString(ENTEREDID, terminal_id).commit();
    }


    public static String getPoint(Context context) {
        return context.getSharedPreferences(POINT, 0).getString(POINT, "");
    }

    public static void setPoint(Context context, String terminal_id) {
        context.getSharedPreferences(POINT, 0).edit().putString(POINT, terminal_id).commit();
    }


    public static String getDealername(Context context) {
        return context.getSharedPreferences(DEALERNAME, 0).getString(DEALERNAME, "");
    }

    public static void setDealername(Context context, String terminal_id) {
        context.getSharedPreferences(DEALERNAME, 0).edit().putString(DEALERNAME, terminal_id).commit();
    }

    public static String getDealermobile(Context context) {
        return context.getSharedPreferences(DEALERMOBILE, 0).getString(DEALERMOBILE, "");
    }

    public static void setDealermobile(Context context, String terminal_id) {
        context.getSharedPreferences(DEALERMOBILE, 0).edit().putString(DEALERMOBILE, terminal_id).commit();
    }

    public static String getTotalregistration(Context context) {
        return context.getSharedPreferences(TOTALREGISTRATION, 0).getString(TOTALREGISTRATION, "");
    }

    public static void setTotalregistration(Context context, String terminal_id) {
        context.getSharedPreferences(TOTALREGISTRATION, 0).edit().putString(TOTALREGISTRATION, terminal_id).commit();
    }

    public static String getMessage(Context context) {
        return context.getSharedPreferences(MESSAGE, 0).getString(MESSAGE, "");
    }

    public static void setMessage(Context context, String terminal_id) {
        context.getSharedPreferences(MESSAGE, 0).edit().putString(MESSAGE, terminal_id).commit();
    }

    public static String getGETOLDDATE(Context context) {
        return context.getSharedPreferences(DATE, 0).getString(DATE, "");
    }

    public static void setGETOLDDATE(Context context, String terminal_id) {
        context.getSharedPreferences(DATE, 0).edit().putString(DATE, terminal_id).commit();
    }

    public static String getRoleName(Context context) {
        return context.getSharedPreferences(ROLENAME, 0).getString(ROLENAME, "");
    }

    public static void setRoleName(Context context, String terminal_id) {
        context.getSharedPreferences(ROLENAME, 0).edit().putString(ROLENAME, terminal_id).commit();
    }

    public static String getAcessCode(Context context) {
        return context.getSharedPreferences(ACESSCODE, 0).getString(ACESSCODE, "");
    }

    public static void setAcessCode(Context context, String terminal_id) {
        context.getSharedPreferences(ACESSCODE, 0).edit().putString(ACESSCODE, terminal_id).commit();
    }

    public static String getENGGID(Context context) {
        return context.getSharedPreferences(ENGGID, 0).getString(ENGGID, "");
    }

    public static void setENGGID(Context context, String terminal_id) {
        context.getSharedPreferences(ENGGID, 0).edit().putString(ENGGID, terminal_id).commit();
    }

    public static String getUserid(Context context) {
        return context.getSharedPreferences(USERID, 0).getString(USERID, "");
    }

    public static void setUserid(Context context, String terminal_id) {
        context.getSharedPreferences(USERID, 0).edit().putString(USERID, terminal_id).commit();
    }

    public static String getFullname(Context context) {
        return context.getSharedPreferences(FULLNAME, 0).getString(FULLNAME, "");
    }

    public static void setFullname(Context context, String terminal_id) {
        context.getSharedPreferences(FULLNAME, 0).edit().putString(FULLNAME, terminal_id).commit();
    }

    public static String getLatitudu(Context context) {
        return context.getSharedPreferences(LATETITUDE, 0).getString(LATETITUDE, "");
    }

    public static void setLatitudu(Context context, String terminal_id) {
        context.getSharedPreferences(LATETITUDE, 0).edit().putString(LATETITUDE, terminal_id).commit();
    }

    public static String getLongitude(Context context) {
        return context.getSharedPreferences(LONGITUDE, 0).getString(LONGITUDE, "");
    }

    public static void setLongitude(Context context, String terminal_id) {
        context.getSharedPreferences(LONGITUDE, 0).edit().putString(LONGITUDE, terminal_id).commit();
    }

    public static String getHappyCode(Context context) {
        return context.getSharedPreferences(HAPPYCODE, 0).getString(HAPPYCODE, "");
    }

    public static void setHappyCode(Context context, String terminal_id) {
        context.getSharedPreferences(HAPPYCODE, 0).edit().putString(HAPPYCODE, terminal_id).commit();
    }

    public static String getName(Context context) {
        return context.getSharedPreferences(NAME, 0).getString(NAME, "");
    }

    public static void setName(Context context, String terminal_id) {
        context.getSharedPreferences(NAME, 0).edit().putString(NAME, terminal_id).commit();
    }

    public static String getEngName(Context context) {
        return context.getSharedPreferences(ENGINEERNAME, 0).getString(ENGINEERNAME, "");
    }

    public static void setEngName(Context context, String terminal_id) {
        context.getSharedPreferences(ENGINEERNAME, 0).edit().putString(ENGINEERNAME, terminal_id).commit();
    }

    public static String getSession(Context context) {
        return context.getSharedPreferences(SESSION, 0).getString(SESSION, "");
    }

    public static void setSession(Context context, String terminal_id) {
        context.getSharedPreferences(SESSION, 0).edit().putString(SESSION, terminal_id).commit();
    }

    public static String getTitle(Context context) {
        return context.getSharedPreferences(TITLE, 0).getString(TITLE, "");
    }

    public static void setTitle(Context context, String terminal_id) {
        context.getSharedPreferences(TITLE, 0).edit().putString(TITLE, terminal_id).commit();
    }

    public static String getUsertype(Context context) {
        return context.getSharedPreferences(USERTYPE, 0).getString(USERTYPE, "");
    }

    public static void setUsertype(Context context, String terminal_id) {
        context.getSharedPreferences(USERTYPE, 0).edit().putString(USERTYPE, terminal_id).commit();
    }

    public static String getFirstname(Context context) {
        return context.getSharedPreferences(FIRSTNAME, 0).getString(FIRSTNAME, "");
    }

    public static void setFirstname(Context context, String terminal_id) {
        context.getSharedPreferences(FIRSTNAME, 0).edit().putString(FIRSTNAME, terminal_id).commit();
    }

    public static String getLastname(Context context) {
        return context.getSharedPreferences(LASTNAME, 0).getString(LASTNAME, "");
    }

    public static void setLastname(Context context, String terminal_id) {
        context.getSharedPreferences(LASTNAME, 0).edit().putString(LASTNAME, terminal_id).commit();
    }

    public static String getMobile(Context context) {
        return context.getSharedPreferences(MOBILE, 0).getString(MOBILE, "");
    }

    public static void setMobile(Context context, String terminal_id) {
        context.getSharedPreferences(MOBILE, 0).edit().putString(MOBILE, terminal_id).commit();
    }

    public static String getAddress(Context context) {
        return context.getSharedPreferences(ADDRESS, 0).getString(ADDRESS, "");
    }

    public static void setAddress(Context context, String terminal_id) {
        context.getSharedPreferences(ADDRESS, 0).edit().putString(ADDRESS, terminal_id).commit();
    }

    public static String getLandmark(Context context) {
        return context.getSharedPreferences(LANDMARK, 0).getString(LANDMARK, "");
    }

    public static void setLandmark(Context context, String terminal_id) {
        context.getSharedPreferences(LANDMARK, 0).edit().putString(LANDMARK, terminal_id).commit();
    }

    public static String getPincode(Context context) {
        return context.getSharedPreferences(PINCODE, 0).getString(PINCODE, "");
    }

    public static void setPincode(Context context, String terminal_id) {
        context.getSharedPreferences(PINCODE, 0).edit().putString(PINCODE, terminal_id).commit();
    }

    public static String getCallcenternumber(Context context) {
        return context.getSharedPreferences(CALLCENTERNUMBER, 0).getString(CALLCENTERNUMBER, "");
    }

    public static void setCallcenternumber(Context context, String terminal_id) {
        context.getSharedPreferences(CALLCENTERNUMBER, 0).edit().putString(CALLCENTERNUMBER, terminal_id).commit();
    }

    public static String getEmailid(Context context) {
        return context.getSharedPreferences(EMAILID, 0).getString(EMAILID, "");
    }

    public static void setEmailid(Context context, String terminal_id) {
        context.getSharedPreferences(EMAILID, 0).edit().putString(EMAILID, terminal_id).commit();
    }

    public static String getWebsite(Context context) {
        return context.getSharedPreferences(WEBSITE, 0).getString(WEBSITE, "");
    }

    public static void setWebsite(Context context, String terminal_id) {
        context.getSharedPreferences(WEBSITE, 0).edit().putString(WEBSITE, terminal_id).commit();
    }

    public static String getState(Context context) {
        return context.getSharedPreferences(STATE, 0).getString(STATE, "");
    }

    public static void setState(Context context, String terminal_id) {
        context.getSharedPreferences(STATE, 0).edit().putString(STATE, terminal_id).commit();
    }

    public static String getStateid(Context context) {
        return context.getSharedPreferences(STATEID, 0).getString(STATEID, "");
    }

    public static void setStateid(Context context, String terminal_id) {
        context.getSharedPreferences(STATEID, 0).edit().putString(STATEID, terminal_id).commit();
    }

    public static String getCity(Context context) {
        return context.getSharedPreferences(CITY, 0).getString(CITY, "");
    }

    public static void setCity(Context context, String terminal_id) {
        context.getSharedPreferences(CITY, 0).edit().putString(CITY, terminal_id).commit();
    }

    public static String getCityid(Context context) {
        return context.getSharedPreferences(CITYID, 0).getString(CITYID, "");
    }

    public static void setCityid(Context context, String terminal_id) {
        context.getSharedPreferences(CITYID, 0).edit().putString(CITYID, terminal_id).commit();
    }

    public static String getLoclity(Context context) {
        return context.getSharedPreferences(LOCLITY, 0).getString(LOCLITY, "");
    }

    public static void setLoclity(Context context, String terminal_id) {
        context.getSharedPreferences(LOCLITY, 0).edit().putString(LOCLITY, terminal_id).commit();
    }

    public static String getLoclityid(Context context) {
        return context.getSharedPreferences(LOCLITYID, 0).getString(LOCLITYID, "");
    }

    public static void setLoclityid(Context context, String terminal_id) {
        context.getSharedPreferences(LOCLITYID, 0).edit().putString(LOCLITYID, terminal_id).commit();
    }

    public static String getValue(Context context) {
        return context.getSharedPreferences(VALUE, 0).getString(VALUE, "");
    }

    public static void setValue(Context context, String terminal_id) {
        context.getSharedPreferences(VALUE, 0).edit().putString(VALUE, terminal_id).commit();
    }

    public static String getQrvalue(Context context) {
        return context.getSharedPreferences(QRVALUE, 0).getString(QRVALUE, "");
    }

    public static void setQrvalue(Context context, String terminal_id) {
        context.getSharedPreferences(QRVALUE, 0).edit().putString(QRVALUE, terminal_id).commit();
    }

    public static String getWhatsapp(Context context) {
        return context.getSharedPreferences(WHATSAPP, 0).getString(WHATSAPP, "");
    }

    public static void setWhatsapp(Context context, String terminal_id) {
        context.getSharedPreferences(WHATSAPP, 0).edit().putString(WHATSAPP, terminal_id).commit();
    }

    public static String getCurrentTime() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+05:30"));
        return String.format("%02d", new Object[]{Integer.valueOf(c.get(11))}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(c.get(12))}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(c.get(13))});
    }

    public static String cureentDate1() {
        Calendar c = Calendar.getInstance();
        PrintStream printStream = System.out;
        printStream.println("Current time => " + c.getTime());
        return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(c.getTime());
    }

    public static String cureentDate() {
        Calendar c = Calendar.getInstance();
        c.add(5, -15);
        PrintStream printStream = System.out;
        printStream.println("Current time => " + c.getTime());
        return new SimpleDateFormat("MM/dd/yyyy").format(c.getTime());
    }

    public static void customToast(Context context, String message) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_tost, (ViewGroup) null);
        ((TextView) view.findViewById(R.id.txt_message)).setText(message);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(80, 0, 0);
        toast.setView(view);
        toast.show();
    }
}
