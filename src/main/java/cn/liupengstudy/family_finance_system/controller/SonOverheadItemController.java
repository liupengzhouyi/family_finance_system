package cn.liupengstudy.family_finance_system.controller;

import cn.liupengstudy.family_finance_system.pojo.FatherOverheadItems;
import cn.liupengstudy.family_finance_system.pojo.IntegerTpyeId;
import cn.liupengstudy.family_finance_system.pojo.SonOverheadItems;
import cn.liupengstudy.family_finance_system.service.Impl.ImplSonOverheadItemsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @文件名 cn.liupengstudy.family_finance_system.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/15 - 7:50 上午
 * @修改人和其它信息
 */

@RestController
@RequestMapping(value = "/sonOverheadItems")
@Api(tags = "子消费明目控制器", description = "提供子级消费明目的增删改查方法")
public class SonOverheadItemController {

    @Autowired
    private ImplSonOverheadItemsService implSonOverheadItemsService;

    /**
     * @描述  获取子级消费目录的业务操作工具
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.service.Impl.ImplSonOverheadItemsService
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:53 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "获取子级消费目录的业务操作工具")
    public ImplSonOverheadItemsService getImplSonOverheadItemsService() {
        return implSonOverheadItemsService;
    }

    /**
     * @描述  设置子级消费目录的业务操作工具
     * @参数  [implSonOverheadItemsService]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:54 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "设置子级消费目录的业务操作工具")
    public void setImplSonOverheadItemsService(ImplSonOverheadItemsService implSonOverheadItemsService) {
        this.implSonOverheadItemsService = implSonOverheadItemsService;
    }

    /**
     * @描述  新增子级消费项目接口
     * @参数  [sonOverheadItems]
     * @返回值  java.lang.String
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:58 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "新增子级消费项目")
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addSonOverheadItem(@RequestBody SonOverheadItems sonOverheadItems) {
        int key = this.getImplSonOverheadItemsService().insert(sonOverheadItems);
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过ID获取子级消费项目")
    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public SonOverheadItems getSonOverheadItem(@RequestBody IntegerTpyeId integerTpyeId) {
        return this.getImplSonOverheadItemsService().selectByPrimaryKey(integerTpyeId.getId());
    }

}
