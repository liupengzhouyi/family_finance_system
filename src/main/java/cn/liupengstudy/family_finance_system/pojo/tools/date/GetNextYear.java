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
 * @创建时间 2019/12/8 - 11:11 下午
 * @修改人和其它信息
 */
@ApiModel(value = "获取一个日期的下一年的日期")
public class GetNextYear {

    public GetNextYear() {
    }

    public GetNextYear(String stringDate) {
        // setting this string type date
        this.stringDate = stringDate;
        // string type date to date
        StringToDate stringToDate = new StringToDate(this.stringDate);
        // setting date type date
        this.setDate(stringToDate.getDate());
        // setting next date type date
        this.setNextYearDate();
        // date type next date to string type next date
        DateToString dateToString = new DateToString(this.getNextYearDate());
        // setting string type next date
        this.setStringNextYearDate(dateToString.getStringTypeDate());
    }
    
    @ApiModelProperty(value = "String type date")
    private String stringDate;

    @ApiModelProperty(value = "String type next month date")
    private String stringNextYearDate;

    @ApiModelProperty(value = "Date type date")
    private Date date;

    @ApiModelProperty(value = "Date type next month Date")
    private Date nextYearDate;

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public String getStringNextYearDate() {
        return stringNextYearDate;
    }

    public void setStringNextYearDate(String stringNextYearDate) {
        this.stringNextYearDate = stringNextYearDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getNextYearDate() {
        return nextYearDate;
    }

    public void setNextYearDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.getDate());
        calendar.add(calendar.YEAR,1); //把日期往后增加一年,整数往后推,负数往前移动
        this.nextYearDate=calendar.getTime(); //这个时间就是日期往后推一年的结果
    }
}
