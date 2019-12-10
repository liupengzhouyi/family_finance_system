package cn.liupengstudy.family_finance_system.pojo.tools.datetime;

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
 * @创建时间 2019/12/6 - 10:55 下午
 * @修改人和其它信息
 */
@ApiModel(value = "String类型日期转换成Date类型日期")
public class StringToDateTime {

    @ApiModelProperty(value = "String类型的日期")
    private String stringTypeDate;

    @ApiModelProperty(value = "Date类型日期")
    private Date date;

    public StringToDateTime() {
    }

    public StringToDateTime(String stringTypeDate) {
        this.stringTypeDate = stringTypeDate;
        this.setDate();
    }

    public String getStringTypeDate() {
        return stringTypeDate;
    }

    public void setStringTypeDate(String stringTypeDate) {
        this.stringTypeDate = stringTypeDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        String dateStr = this.getStringTypeDate();
        //String dateStr = "2010/05/04 12:34:23";
        Date date = new Date();
        //注意format的格式要与日期String的格式相匹配
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(dateStr);
            this.date = date;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
