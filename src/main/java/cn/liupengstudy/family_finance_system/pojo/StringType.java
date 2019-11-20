package cn.liupengstudy.family_finance_system.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/20 - 8:38 下午
 * @修改人和其它信息
 */
@ApiModel(value = "String实体")
public class StringType {

    @ApiModelProperty(value = "String")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
