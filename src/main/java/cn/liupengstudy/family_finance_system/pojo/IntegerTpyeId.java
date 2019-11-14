package cn.liupengstudy.family_finance_system.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/14 - 11:04 上午
 * @修改人和其它信息
 */
@ApiModel(value = "传递Integer型参数专用")
public class IntegerTpyeId {

    @ApiModelProperty(value = "ID")
    private Integer id;

    /**
     * @描述  获取ID
     * @参数  []
     * @返回值  java.lang.Integer
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/14 - 11:05 上午
     * @修改人和其它信息
     */
    public Integer getId() {
        return id;
    }

    /**
     * @描述  设置ID
     * @参数  [id]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/14 - 11:05 上午
     * @修改人和其它信息
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
