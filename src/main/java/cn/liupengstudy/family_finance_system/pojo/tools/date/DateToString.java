package cn.liupengstudy.family_finance_system.pojo.tools.date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/7 - 4:53 下午
 * @修改人和其它信息
 */
@ApiModel(value = "Date类型日期转换成String类型日期")
public class DateToString {

    @ApiModelProperty(value = "String类型的日期")
    private String stringTypeDate;

    @ApiModelProperty(value = "Date类型日期")
    private Date date;

    public DateToString() {
    }

    public DateToString(Date date) {
        this.date = date;
        this.setStringTypeDate();
    }

    public String getStringTypeDate() {
        return stringTypeDate;
    }

    public void setStringTypeDate() {
        Date date = this.getDate();
        //format的格式可以任意
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.stringTypeDate = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
