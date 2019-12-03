package cn.liupengstudy.family_finance_system.service;

import cn.liupengstudy.family_finance_system.pojo.RunningAccount;
import cn.liupengstudy.family_finance_system.pojo.StringType;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.family_finance_system.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/16 - 8:38 上午
 * @修改人和其它信息
 */
public interface IRunningAccount {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int insert(RunningAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int insertSelective(RunningAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    RunningAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RunningAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RunningAccount record);

    /**
     * @描述  通过Date获取List<RunningAccount>
     * @参数  Date date
     * @返回值  List<RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/19 - 8:28 上午
     * @修改人和其它信息
     */
    List<RunningAccount> getRunningAccountByDate(String datatime1, String datetime2);

    /**
     * @描述  通过消费明目ID查询流水账
     * @参数  [id]
     * @返回值  java.util.List<cn.liupengstudy.family_finance_system.pojo.RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/20 - 9:53 下午
     * @修改人和其它信息
     */
    List<RunningAccount> getRunningAccountByID(@Param("id")StringType id);

    /**
     * @描述  查看所有必要消费
     * @参数  []
     * @返回值  java.util.List<cn.liupengstudy.family_finance_system.pojo.RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/30 - 11:28 下午
     * @修改人和其它信息
     */
    List<RunningAccount> selectAllNecessaryConsumption();

    /**
     * @描述  查看所有不必要消费
     * @参数  []
     * @返回值  java.util.List<cn.liupengstudy.family_finance_system.pojo.RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/30 - 11:28 下午
     * @修改人和其它信息
     */
    List<RunningAccount> selectAllNuNecessaryConsumption();

    /**
     * @描述  查看某天的必要消费
     * @参数  [datatime1]
     * @返回值  java.util.List<cn.liupengstudy.family_finance_system.pojo.RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/12/4 - 12:53 上午
     * @修改人和其它信息
     */
    List<RunningAccount> selectOneDayNecessaryConsumption(@Param("datetime1")String datatime1, @Param("datetime2")String datetime2);

    /**
     * @描述  查看某天的非必要消费
     * @参数  [datatime1]
     * @返回值  java.util.List<cn.liupengstudy.family_finance_system.pojo.RunningAccount>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/12/4 - 12:53 上午
     * @修改人和其它信息
     */
    List<RunningAccount> selectOneDayNuNecessaryConsumption(@Param("datetime1")String datatime1, @Param("datetime2")String datetime2);

}


