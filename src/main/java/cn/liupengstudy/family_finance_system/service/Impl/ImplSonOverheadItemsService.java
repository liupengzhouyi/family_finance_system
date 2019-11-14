package cn.liupengstudy.family_finance_system.service.Impl;

import cn.liupengstudy.family_finance_system.mapper.SonOverheadItemsMapper;
import cn.liupengstudy.family_finance_system.pojo.SonOverheadItems;
import cn.liupengstudy.family_finance_system.service.ISonOverheadItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @文件名 cn.liupengstudy.family_finance_system.service.Impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/15 - 7:37 上午
 * @修改人和其它信息
 */
@Service
public class ImplSonOverheadItemsService implements ISonOverheadItems {

    @Autowired
    private SonOverheadItemsMapper sonOverheadItemsMapper;

    /**
     * @描述  获取子消费明目的数据库Mapper（数据库操作对象）
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.mapper.SonOverheadItemsMapper
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:39 上午
     * @修改人和其它信息
     */
    public SonOverheadItemsMapper getSonOverheadItemsMapper() {
        return sonOverheadItemsMapper;
    }

    /**
     * @描述  设置子消费明目的数据库Mapper（数据库操作对象）
     * @参数  [sonOverheadItemsMapper]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:40 上午
     * @修改人和其它信息
     */
    public void setSonOverheadItemsMapper(SonOverheadItemsMapper sonOverheadItemsMapper) {
        this.sonOverheadItemsMapper = sonOverheadItemsMapper;
    }


    /**
     * @描述  通过子消费目录的ID删除消费明目
     * @参数  [id]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:41 上午
     * @修改人和其它信息
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getSonOverheadItemsMapper().deleteByPrimaryKey(id);
    }

    /**
     * @描述  添加子消费明目
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:45 上午
     * @修改人和其它信息
     */
    @Override
    public int insert(SonOverheadItems record) {
        return this.getSonOverheadItemsMapper().insert(record);
    }

    /**
     * @描述  添加子消费明目
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:46 上午
     * @修改人和其它信息
     */
    @Override
    public int insertSelective(SonOverheadItems record) {
        return this.getSonOverheadItemsMapper().insertSelective(record);
    }

    /**
     * @描述  通过消费明目的ID查询消费明目
     * @参数  [id]
     * @返回值  cn.liupengstudy.family_finance_system.pojo.SonOverheadItems
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:47 上午
     * @修改人和其它信息
     */
    @Override
    public SonOverheadItems selectByPrimaryKey(Integer id) {
        return this.getSonOverheadItemsMapper().selectByPrimaryKey(id);
    }

    /**
     * @描述  更新子消费明目
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:48 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKeySelective(SonOverheadItems record) {
        return this.getSonOverheadItemsMapper().updateByPrimaryKeySelective(record);
    }

    /**
     * @描述  更新子消费明目
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/15 - 7:48 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKey(SonOverheadItems record) {
        return this.getSonOverheadItemsMapper().updateByPrimaryKey(record);
    }
}
