package cn.liupengstudy.family_finance_system.controller;

import cn.liupengstudy.family_finance_system.pojo.ConsumerRelationship;
import cn.liupengstudy.family_finance_system.pojo.IntegerTpyeId;
import cn.liupengstudy.family_finance_system.service.IConsumerRelationship;
import cn.liupengstudy.family_finance_system.service.Impl.ImplConsumerRelationshipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @文件名 cn.liupengstudy.family_finance_system.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/17 - 6:01 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping(value = "/consumerRelationship")
@Api(tags = "消费明目关系控制器", description = "提供消费明目关系控制器的增删改查方法")
public class ConsumerRelationshipController {


    // 消费明目关系控制器
    @Autowired
    private ImplConsumerRelationshipService implConsumerRelationshipService;

    @ApiOperation(value = "获取消费明目关系控制器")
    public ImplConsumerRelationshipService getImplConsumerRelationshipService() {
        return implConsumerRelationshipService;
    }

    @ApiOperation(value = "设置消费明目关系控制器")
    public void setImplConsumerRelationshipService(ImplConsumerRelationshipService implConsumerRelationshipService) {
        this.implConsumerRelationshipService = implConsumerRelationshipService;
    }

    @ApiOperation(value = "新增消费明目关系")
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addConsumerRelationship(@RequestBody ConsumerRelationship consumerRelationship) {
        int key = this.getImplConsumerRelationshipService().insert(consumerRelationship);
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除消费明目关系")
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String deleteConsumerRelationship(@RequestBody IntegerTpyeId integerTpyeId) {
        int key = this.getImplConsumerRelationshipService().deleteByPrimaryKey(integerTpyeId.getId());
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "更新消费明目关系")
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String updateConsumerRelationship(@RequestBody ConsumerRelationship consumerRelationship) {
        int key = this.getImplConsumerRelationshipService().updateByPrimaryKey(consumerRelationship);
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "查找消费明目关系")
    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ConsumerRelationship selectConsumerRelationship(@RequestBody IntegerTpyeId integerTpyeId) {
        return this.getImplConsumerRelationshipService().selectByPrimaryKey(integerTpyeId.getId());
    }

}
