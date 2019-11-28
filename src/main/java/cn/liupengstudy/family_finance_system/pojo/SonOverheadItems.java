package cn.liupengstudy.family_finance_system.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "消费子明目实体")
public class SonOverheadItems {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SonOverheadItems.id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "消费子明目ID")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SonOverheadItems.name
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "消费子明目名称")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SonOverheadItems.datetime
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "消费子明目添加时间")
    private Date datetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SonOverheadItems.id
     *
     * @return the value of SonOverheadItems.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SonOverheadItems.id
     *
     * @param id the value for SonOverheadItems.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SonOverheadItems.name
     *
     * @return the value of SonOverheadItems.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SonOverheadItems.name
     *
     * @param name the value for SonOverheadItems.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SonOverheadItems.datetime
     *
     * @return the value of SonOverheadItems.datetime
     *
     * @mbggenerated
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SonOverheadItems.datetime
     *
     * @param datetime the value for SonOverheadItems.datetime
     *
     * @mbggenerated
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}