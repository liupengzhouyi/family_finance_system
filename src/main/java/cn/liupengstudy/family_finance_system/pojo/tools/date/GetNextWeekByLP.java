package cn.liupengstudy.family_finance_system.pojo.tools.date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools.date
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/7 - 5:10 下午
 * @修改人和其它信息
 */
@ApiModel(value = "获取一个日期的下一个week")
public class GetNextWeekByLP {

    public GetNextWeekByLP() {
    }

    public GetNextWeekByLP(String stringDate) {
        // setting this string type date
        this.stringDate = stringDate;
        // string type date to date
        StringToDate stringToDate = new StringToDate(this.stringDate);
        // setting date type date
        this.setDate(stringToDate.getDate());
        // setting next date type date
        this.setNextWeekDate();
        // date type next date to string type next date
        DateToString dateToString = new DateToString(this.getNextWeekDate());
        // setting string type next date
        this.setStringNextWeekDate(dateToString.getStringTypeDate());
    }

    @ApiModelProperty(value = "String type date")
    private String stringDate;

    @ApiModelProperty(value = "String type next week date")
    private String stringNextWeekDate;

    @ApiModelProperty(value = "Date type date")
    private Date date;

    @ApiModelProperty(value = "Date type next week Date")
    private Date nextWeekDate;

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public String getStringNextWeekDate() {
        return stringNextWeekDate;
    }

    public void setStringNextWeekDate(String stringNextWeekDate) {
        this.stringNextWeekDate = stringNextWeekDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getNextWeekDate() {
        return nextWeekDate;
    }

    public void setNextWeekDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.getDate());
        calendar.add(calendar.DATE,7); //把日期往后增加7天,整数往后推,负数往前移动
        this.nextWeekDate=calendar.getTime(); //这个时间就是日期往后推一天的结果
    }
}
