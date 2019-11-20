package cn.liupengstudy.family_finance_system.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/20 - 8:08 下午
 * @修改人和其它信息
 */
public class ADatetimeType {

    private String datetime1;

    public String getDatetime1() {
        return datetime1;
    }

    public void setDatetime1(String datetime1) {
        this.datetime1 = datetime1;
    }

    public String getDatetime2() {
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(this.getDatetime1());
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(date);
            rightNow.add(Calendar.DAY_OF_YEAR, 1);
            date = rightNow.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf2.format(date);
    }
}


