package cn.liupengstudy.family_finance_system.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "父级消费明目")
public class FatherOverheadItems {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FatherOverheadItems.id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "父级消费明目ID")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FatherOverheadItems.name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "父级消费明目名称")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FatherOverheadItems.date
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "添加父级消费明目日期")
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FatherOverheadItems.time
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "添加父级消费明目时间")
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FatherOverheadItems.id
     *
     * @return the value of FatherOverheadItems.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FatherOverheadItems.id
     *
     * @param id the value for FatherOverheadItems.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FatherOverheadItems.name
     *
     * @return the value of FatherOverheadItems.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FatherOverheadItems.name
     *
     * @param name the value for FatherOverheadItems.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FatherOverheadItems.date
     *
     * @return the value of FatherOverheadItems.date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FatherOverheadItems.date
     *
     * @param date the value for FatherOverheadItems.date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FatherOverheadItems.time
     *
     * @return the value of FatherOverheadItems.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FatherOverheadItems.time
     *
     * @param time the value for FatherOverheadItems.time
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FatherOverheadItems{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}