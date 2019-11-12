package cn.liupengstudy.family_finance_system.service.Impl;

import cn.liupengstudy.family_finance_system.mapper.FatherOverheadItemsMapper;
import cn.liupengstudy.family_finance_system.pojo.FatherOverheadItems;
import cn.liupengstudy.family_finance_system.service.IFatherOverheadItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @文件名 cn.liupengstudy.family_finance_system.service
 * @描述 父消费明目
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/12 - 2:47 下午
 * @修改人和其它信息
 */
@Service
public class ImplFatherOverheadItemsService implements IFatherOverheadItems {

    @Autowired
    private FatherOverheadItemsMapper fatherOverheadItemsMapper;

    /**
     * @描述  get object which type is FatherOverheadItemsMapper
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.mapper.FatherOverheadItemsMapper
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:53 下午
     * @修改人和其它信息
     */
    public FatherOverheadItemsMapper getFatherOverheadItemsMapper() {
        return fatherOverheadItemsMapper;
    }

    /**
     * @描述  set object which type is FatherOverheadItemsMapper
     * @参数  [fatherOverheadItemsMapper]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:54 下午
     * @修改人和其它信息
     */
    public void setFatherOverheadItemsMapper(FatherOverheadItemsMapper fatherOverheadItemsMapper) {
        this.fatherOverheadItemsMapper = fatherOverheadItemsMapper;
    }

    /**
     * @描述  dalete a father overhead item by id
     * @参数  [id]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:52 下午
     * @修改人和其它信息
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getFatherOverheadItemsMapper().deleteByPrimaryKey(id);
    }

    /**
     * @描述  add a new father overhead item
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:52 下午
     * @修改人和其它信息
     */
    @Override
    public int insert(FatherOverheadItems record) {
        return this.getFatherOverheadItemsMapper().insert(record);
    }

    /**
     * @描述  add a new father overhead item
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:57 下午
     * @修改人和其它信息
     */
    @Override
    public int insertSelective(FatherOverheadItems record) {
        return this.getFatherOverheadItemsMapper().insertSelective(record);
    }

    /**
     * @描述  get a overhead item by id
     * @参数  [id]
     * @返回值  cn.liupengstudy.family_finance_system.pojo.FatherOverheadItems
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:58 下午
     * @修改人和其它信息
     */
    @Override
    public FatherOverheadItems selectByPrimaryKey(Integer id) {
        return this.selectByPrimaryKey(id);
    }

    /**
     * @描述  update a overhead item
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 2:59 下午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKeySelective(FatherOverheadItems record) {
        return this.getFatherOverheadItemsMapper().updateByPrimaryKeySelective(record);
    }

    /**
     * @描述  update a overhead item
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/12 - 3:00 下午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKey(FatherOverheadItems record) {
        return this.getFatherOverheadItemsMapper().updateByPrimaryKey(record);
    }
}
