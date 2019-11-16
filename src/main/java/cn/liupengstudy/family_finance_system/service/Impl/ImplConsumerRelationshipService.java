package cn.liupengstudy.family_finance_system.service.Impl;

import cn.liupengstudy.family_finance_system.mapper.ConsumerRelationshipMapper;
import cn.liupengstudy.family_finance_system.pojo.ConsumerRelationship;
import cn.liupengstudy.family_finance_system.service.IConsumerRelationship;
import org.springframework.stereotype.Service;

/**
 * @文件名 cn.liupengstudy.family_finance_system.service.Impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/17 - 5:53 上午
 * @修改人和其它信息
 */
@Service
public class ImplConsumerRelationshipService implements IConsumerRelationship {

    // 数据库映射操作类
    private ConsumerRelationshipMapper consumerRelationshipMapper;

    /**
     * @描述  获取数据库映射操作类
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.pojo.ConsumerRelationship
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:54 上午
     * @修改人和其它信息
     */
    public ConsumerRelationshipMapper getConsumerRelationshipMapper() {
        return consumerRelationshipMapper;
    }

    /**
     * @描述  设置数据库映射操作类
     * @参数  [consumerRelationship]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:54 上午
     * @修改人和其它信息
     */
    public void setConsumerRelationshipMapper(ConsumerRelationshipMapper consumerRelationshipMapper) {
        this.consumerRelationshipMapper = consumerRelationshipMapper;
    }

    /**
     * @描述
     * @参数  [id]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:55 上午
     * @修改人和其它信息
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getConsumerRelationshipMapper().deleteByPrimaryKey(id);
    }

    /**
     * @描述  添加关系
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:57 上午
     * @修改人和其它信息
     */
    @Override
    public int insert(ConsumerRelationship record) {
        return this.getConsumerRelationshipMapper().insert(record);
    }

    /**
     * @描述  添加关系
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:57 上午
     * @修改人和其它信息
     */
    @Override
    public int insertSelective(ConsumerRelationship record) {
        return this.getConsumerRelationshipMapper().insertSelective(record);
    }

    /**
     * @描述  通过关系的ID查询关系
     * @参数  [id]
     * @返回值  cn.liupengstudy.family_finance_system.pojo.ConsumerRelationship
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:57 上午
     * @修改人和其它信息
     */
    @Override
    public ConsumerRelationship selectByPrimaryKey(Integer id) {
        return this.getConsumerRelationshipMapper().selectByPrimaryKey(id);
    }

    /**
     * @描述  更新消费目名的关系
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:57 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKeySelective(ConsumerRelationship record) {
        return this.getConsumerRelationshipMapper().updateByPrimaryKeySelective(record);
    }

    /**
     * @描述  更新消费目名的关系
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/17 - 5:57 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKey(ConsumerRelationship record) {
        return this.getConsumerRelationshipMapper().updateByPrimaryKey(record);
    }
}
