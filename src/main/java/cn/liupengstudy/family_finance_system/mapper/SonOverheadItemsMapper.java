package cn.liupengstudy.family_finance_system.mapper;

import cn.liupengstudy.family_finance_system.pojo.SonOverheadItems;
import org.apache.ibatis.annotations.Param;

public interface SonOverheadItemsMapper {
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
    int insert(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int insertSelective(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    SonOverheadItems selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RunningAccount
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SonOverheadItems record);

    /**
     * @描述  通过消费明目获取消费明目的ID
     * @参数  [name]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/20 - 8:40 下午
     * @修改人和其它信息
     */
    int getIDByName(@Param("name")String name);
}