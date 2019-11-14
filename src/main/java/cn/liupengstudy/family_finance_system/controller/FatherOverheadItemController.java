package cn.liupengstudy.family_finance_system.controller;

import cn.liupengstudy.family_finance_system.pojo.FatherOverheadItems;
import cn.liupengstudy.family_finance_system.pojo.IntegerTpyeId;
import cn.liupengstudy.family_finance_system.service.Impl.ImplFatherOverheadItemsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private ImplFatherOverheadItemsService implFatherOverheadItemsService;

    @ApiOperation(value = "获取父级消费项目业务操作对象")
    public ImplFatherOverheadItemsService getImplFatherOverheadItemsService() {
        return implFatherOverheadItemsService;
    }

    @ApiOperation(value = "设置父级消费项目业务操作对象")
    public void setImplFatherOverheadItemsService(ImplFatherOverheadItemsService implFatherOverheadItemsService) {
        this.implFatherOverheadItemsService = implFatherOverheadItemsService;
    }

    @ApiOperation(value="测试I", notes="返回Hello World")
    @RequestMapping("/test")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @ApiOperation(value = "新增父级消费项目接口")
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String add(@RequestBody FatherOverheadItems fatherOverheadItems) {
        this.getImplFatherOverheadItemsService().insert(fatherOverheadItems);
        return "success";
    }

    @ApiOperation(value = "通过ID获取父级消费项目接口")
    @ResponseBody
    @RequestMapping(value = "/getByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FatherOverheadItems getByID(@RequestBody IntegerTpyeId integerTpyeId) {
        FatherOverheadItems fatherOverheadItems = this.getImplFatherOverheadItemsService().selectByPrimaryKey(integerTpyeId.getId());
        System.out.println(fatherOverheadItems.toString());
        return fatherOverheadItems;
    }


}
