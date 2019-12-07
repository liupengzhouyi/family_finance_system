package cn.liupengstudy.family_finance_system.pojo.tools;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/6 - 10:44 下午
 * @修改人和其它信息
 */
@ApiModel(value = "获取一个日期的下一个日期")
public class GetNextDay {

    @ApiModelProperty(value = "String type date")
    private String stringDate;

    @ApiModelProperty(value = "String type next date")
    private String stringNextDate;

    @ApiModelProperty(value = "Date type date")
    private Date date;

    @ApiModelProperty(value = "Date type nextDate")
    private Date nextDate;

    public GetNextDay() {
    }

    public GetNextDay(String stringDate) {
        this.stringDate = stringDate;
    }

    // 2019-12-12
    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public String getStringNextDate() {
        return stringNextDate;
    }

    public void setStringNextDate(String stringNextDate) {
        this.stringNextDate = stringNextDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.getDate());
        calendar.add(calendar.DATE,1); //把日期往后增加一天,整数往后推,负数往前移动
        this.nextDate=calendar.getTime(); //这个时间就是日期往后推一天的结果
    }
}
