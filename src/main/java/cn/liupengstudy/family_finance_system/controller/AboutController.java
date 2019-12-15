package cn.liupengstudy.family_finance_system.controller;

import cn.liupengstudy.family_finance_system.pojo.about.AboutInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名 cn.liupengstudy.family_finance_system.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/15 - 1:18 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping(value = "/about")
@Api(tags = "关于控制器", description = "获取关于信息")
public class AboutController {

    @ApiOperation(value = "获取about信息")
    @ResponseBody
    @RequestMapping(value = "/getAboutInformatioon", produces = "application/json;charset=UTF-8")
    public AboutInformation getInformation() {
        AboutInformation aboutInformation = new AboutInformation("liupeng","记账软件","liupeng","liupeng.0@outlook.com","2019-12-14");
        return aboutInformation;
    }

}