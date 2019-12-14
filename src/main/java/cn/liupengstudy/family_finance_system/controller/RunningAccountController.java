package cn.liupengstudy.family_finance_system.controller;

import cn.liupengstudy.family_finance_system.pojo.*;
import cn.liupengstudy.family_finance_system.pojo.tools.date.GetNextMonthByLP;
import cn.liupengstudy.family_finance_system.pojo.tools.date.GetNextYearByLP;
import cn.liupengstudy.family_finance_system.service.Impl.ImplRunningAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.family_finance_system.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/16 - 9:04 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping(value = "/runningAccount")
@Api(tags = "流水账控制器", description = "提供流水账的增删改查方法")
public class RunningAccountController {

    @Autowired
    private ImplRunningAccountService implRunningAccountService;

    /**
     * @描述  获取流水账业务层操作类
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.service.Impl.ImplRunningAccountService
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 9:14 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "获取流水账业务层操作类")
    public ImplRunningAccountService getImplRunningAccountService() {
        return implRunningAccountService;
    }

    /**
     * @描述  设置流水账业务层操作类
     * @参数  [implRunningAccountService]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 9:14 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "设置流水账业务层操作类")
    public void setImplRunningAccountService(ImplRunningAccountService implRunningAccountService) {
        this.implRunningAccountService = implRunningAccountService;
    }

    /**
     * @描述  新增流水账
     * @参数  []
     * @返回值  java.lang.String
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 9:14 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "新增流水账")
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addRunningAccount(@RequestBody RunningAccount runningAccount) {
        System.out.println(runningAccount.toString());
        int key = this.getImplRunningAccountService().insert(runningAccount);
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    /**
     * @描述  通过ID获取流水账
     * @参数  [integerTpyeId]
     * @返回值  cn.liupengstudy.family_finance_system.pojo.RunningAccount
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 9:20 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过ID获取流水账")
    @ResponseBody
    @RequestMapping(value = "/findByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public RunningAccount getRunningAccountByID(@RequestBody IntegerTpyeId integerTpyeId) {
        return this.getImplRunningAccountService().selectByPrimaryKey(integerTpyeId.getId());
    }

    /**
     * @描述  通过ID删除流水账
     * @参数  [integerTpyeId]
     * @返回值  java.lang.String
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 9:21 上午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过ID删除流水账")
    @ResponseBody
    @RequestMapping(value = "/deleteByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String deleteRunningAccountByID(@RequestBody IntegerTpyeId integerTpyeId) {
        int key = this.getImplRunningAccountService().deleteByPrimaryKey(integerTpyeId.getId());
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "更新流水账")
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String updateRunningAccountByID(@RequestBody RunningAccount runningAccount) {
        int key = this.getImplRunningAccountService().updateByPrimaryKey(runningAccount);
        String returnInformation = "error";
        if (key == 1){
            returnInformation = "success";
        }
        return returnInformation;
    }

    @ApiOperation(value = "获取一个时间段内的流水账")
    @ResponseBody
    @RequestMapping(value = "/getByTowDate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectRunningAccountByDateI(DatetimeType datetimeType) {
        System.out.println(datetimeType.getDatetime1() + datetimeType.getDatetime2());
        return this.getImplRunningAccountService().getRunningAccountByDate(datetimeType.getDatetime1(), datetimeType.getDatetime2());
    }

    @ApiOperation(value = "获取某一天流水账")
    @ResponseBody
    @RequestMapping(value = "/getByDate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectRunningAccountByDateII(ADatetimeType aDatetimeType) {
        return this.getImplRunningAccountService().getRunningAccountByDate(aDatetimeType.getDatetime1(), aDatetimeType.getDatetime2());
    }

    @ApiOperation(value = "通过消费明目ID查询流水账")
    @ResponseBody
    @RequestMapping(value = "/getRunningAccountByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectRunningAccountByID(StringType stringType) {
        return this.getImplRunningAccountService().getRunningAccountByID(stringType);
    }

    @ApiOperation(value = "通过消费明目查询流水账")
    @ResponseBody
    @RequestMapping(value = "/getRunningAccountBySonID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectRunningAccountBySonID(StringType stringType) {
        return this.getImplRunningAccountService().getRunningAccountByID(stringType);
    }

    @ApiOperation(value = "通过消费明目查询流水账")
    @ResponseBody
    @RequestMapping(value = "/getRunningAccountByFatherID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectRunningAccountByFatherID(StringType stringType) {
        return this.getImplRunningAccountService().getRunningAccountByID(stringType);
    }


    @ApiOperation(value = "查看所有必要消费")
    @ResponseBody
    @RequestMapping(value = "/getNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectAllNecessaryConsumption() {
        return this.getImplRunningAccountService().selectAllNecessaryConsumption();
    }


    @ApiOperation(value = "查看某天必要消费")
    @ResponseBody
    @RequestMapping(value = "/getOneDayNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneDayNecessaryConsumption(ADatetimeType aDatetimeType) {
        return this.getImplRunningAccountService().selectOneDayNecessaryConsumption(aDatetimeType.getDatetime1(), aDatetimeType.getDatetime2());
    }

    @ApiOperation(value = "查看所有不必要消费")
    @ResponseBody
    @RequestMapping(value = "/getNuNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectAllNuNecessaryConsumption() {
        return this.getImplRunningAccountService().selectAllNuNecessaryConsumption();
    }

    @ApiOperation(value = "查看所有不必要消费")
    @ResponseBody
    @RequestMapping(value = "/getOneDayNuNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneDayNuNecessaryConsumption(ADatetimeType aDatetimeType) {
        return this.getImplRunningAccountService().selectOneDayNuNecessaryConsumption(aDatetimeType.getDatetime1(), aDatetimeType.getDatetime2());
    }

    @ApiOperation(value = "查看某月所有消费")
    @ResponseBody
    @RequestMapping(value = "/getOneMonthConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneMonthConsumption(ADatetimeType aDatetimeType) {
        GetNextMonthByLP getNextMonthByLP = new GetNextMonthByLP(aDatetimeType.getDatetime1());
        String thisMonthDate = getNextMonthByLP.getStringDate();
        String nextMonthDate = getNextMonthByLP.getStringNextMonthDate();
        // System.out.println(thisMonthDate + nextMonthDate);
        return this.getImplRunningAccountService().selectOneMonthConsumption(thisMonthDate, nextMonthDate);
    }

    @ApiOperation(value = "查看某月所有必要消费")
    @ResponseBody
    @RequestMapping(value = "/getOneMonthNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneMonthNecessaryConsumption(ADatetimeType aDatetimeType) {
        GetNextMonthByLP getNextMonthByLP = new GetNextMonthByLP(aDatetimeType.getDatetime1());
        String thisMonthDate = getNextMonthByLP.getStringDate();
        String nextMonthDate = getNextMonthByLP.getStringNextMonthDate();
        // System.out.println(thisMonthDate + nextMonthDate);
        return this.getImplRunningAccountService().selectOneMonthNecessaryConsumption(thisMonthDate, nextMonthDate);
    }

    @ApiOperation(value = "查看某月所有不必要消费")
    @ResponseBody
    @RequestMapping(value = "/getOneMonthNuNecessaryConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneMonthNuNecessaryConsumption(ADatetimeType aDatetimeType) {
        GetNextMonthByLP getNextMonthByLP = new GetNextMonthByLP(aDatetimeType.getDatetime1());
        String thisMonthDate = getNextMonthByLP.getStringDate();
        String nextMonthDate = getNextMonthByLP.getStringNextMonthDate();
        // System.out.println(thisMonthDate + nextMonthDate);
        return this.getImplRunningAccountService().selectOneMonthNuNecessaryConsumption(thisMonthDate, nextMonthDate);
    }

    @ApiOperation(value = "查看某月所有消费")
    @ResponseBody
    @RequestMapping(value = "/getOneYearConsumption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectOneYearConsumption(ADatetimeType aDatetimeType) {
        GetNextYearByLP getNextYearByLP = new GetNextYearByLP(aDatetimeType.getDatetime1());
        String thisYearDate = getNextYearByLP.getStringDate();
        String nextYearDate = getNextYearByLP.getStringNextYearDate();
        // System.out.println(thisMonthDate + nextMonthDate);
        return this.getImplRunningAccountService().selectOneYearConsumption(thisYearDate, nextYearDate);
    }
    
    // 某天必要消费
    // 天/周/月/年
    // 时间段

    // 子类
    // 天/周/月/年
    // 时间段

    // 父类
    @ApiOperation(value = "根据父类查看所有消费")
    @ResponseBody
    @RequestMapping(value = "/selectConsumptionByFatherOverheadItem", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectConsumptionByFatherOverheadItem(StringType stringType) {
        return this.getImplRunningAccountService().selectConsumptionByFatherOverheadItem(stringType.getString());
    }

    @ApiOperation(value = "查看某一父类在某一天的所有消费")
    @ResponseBody
    @RequestMapping(value = "/selectConsumptionByFatherOverheadItemOneDay", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<RunningAccount> selectConsumptionByFatherOverheadItemOneDay(StringType stringType, ADatetimeType aDatetimeType) {
        return this.getImplRunningAccountService().selectConsumptionByFatherOverheadItemOneDay(stringType.getString(), aDatetimeType.getDatetime1(), aDatetimeType.getDatetime2());
    }
    // 天/周/月/年


}
