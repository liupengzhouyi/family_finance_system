package cn.liupengstudy.family_finance_system.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/20 - 12:35 下午
 * @修改人和其它信息
 */
public class DatetimeType {

    private String datetime1;

    private String datetime2;

    public DatetimeType() {
    }

    public String getDatetime1() {
        return datetime1;
    }

    public void setDatetime1(String datetime1) {
        this.datetime1 = datetime1;
    }

    public String getDatetime2() {
        return datetime2;
    }

    public void setDatetime2(String datetime2) {
        this.datetime2 = datetime2;
    }

    /*public DatetimeType(Date datetime1) {
        this.datetime1 = datetime1;
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(this.datetime1);
        rightNow.add(Calendar.DAY_OF_YEAR, 1);
        this.setDatetime2(rightNow.getTime());
    }*/



    /*public String getStringDatetime1() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
        return ft.format(this.getDatetime1());
    }

    public String getStringDatetime2() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
        return ft.format(this.getDatetime2());
    }*/
}
