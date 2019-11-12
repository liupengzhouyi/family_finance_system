package cn.liupengstudy.family_finance_system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名 cn.liupengstudy.family_finance_system.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/12 - 3:02 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping(value = "/fatherOverheadItems")
@Api(tags = "父消费明目控制器", description = "提供父级消费明目的增删改查方法")
public class FatherOverheadItemController  {

    @ApiOperation(value="测试I", notes="返回Hello World")
    @RequestMapping("/say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

}
