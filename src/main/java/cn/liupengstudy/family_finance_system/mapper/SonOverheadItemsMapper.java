package cn.liupengstudy.family_finance_system.mapper;

import cn.liupengstudy.family_finance_system.pojo.SonOverheadItems;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SonOverheadItemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    int insert(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    int insertSelective(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    SonOverheadItems selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SonOverheadItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SonOverheadItems
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SonOverheadItems record);
}