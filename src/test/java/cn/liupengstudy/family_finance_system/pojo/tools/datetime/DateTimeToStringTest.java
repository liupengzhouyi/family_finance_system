package cn.liupengstudy.family_finance_system.pojo.tools.datetime;

import cn.liupengstudy.family_finance_system.pojo.tools.date.DateToString;
import cn.liupengstudy.family_finance_system.pojo.tools.date.StringToDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/7 - 4:56 下午
 * @修改人和其它信息
 */
public class DateTimeToStringTest {

    private StringToDate stringToDate;

    private DateTimeToString dateTimeToString;

    public StringToDate getStringToDate() {
        return stringToDate;
    }

    public void setStringToDate(StringToDate stringToDate) {
        this.stringToDate = stringToDate;
    }

    public DateTimeToString getDateTimeToString() {
        return dateTimeToString;
    }

    public void setDateTimeToString(DateTimeToString dateTimeToString) {
        this.dateTimeToString = dateTimeToString;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("----begin----");
        this.setStringToDate(new StringToDate("2019-12-07 12:09:23"));
        this.setDateTimeToString(new DateTimeToString(this.getStringToDate().getDate()));
        lpPrintln(this.getDateTimeToString().getStringTypeDate());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("----end----");
    }

    @Test
    public void getStringTypeDate() {
    }

    @Test
    public void setStringTypeDate() {
    }

    @Test
    public void getDate() {
    }

    @Test
    public void setDate() {
    }

    public void lpPrintln(String string){
        System.out.println(string);
    }
}