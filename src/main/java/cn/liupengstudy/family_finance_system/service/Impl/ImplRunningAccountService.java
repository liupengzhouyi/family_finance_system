package cn.liupengstudy.family_finance_system.service.Impl;

import cn.liupengstudy.family_finance_system.mapper.RunningAccountMapper;
import cn.liupengstudy.family_finance_system.pojo.RunningAccount;
import cn.liupengstudy.family_finance_system.service.IRunningAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @文件名 cn.liupengstudy.family_finance_system.service.Impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/16 - 8:39 上午
 * @修改人和其它信息
 */

@Service
public class ImplRunningAccountService implements IRunningAccount {

    @Autowired
    private RunningAccountMapper runningAccountMapper;

    /**
     * @描述  获取RunningAccount的数据库操作对象RunningAccountMapper
     * @参数  []
     * @返回值  cn.liupengstudy.family_finance_system.mapper.RunningAccountMapper
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:41 上午
     * @修改人和其它信息
     */
    public RunningAccountMapper getRunningAccountMapper() {
        return runningAccountMapper;
    }

    /**
     * @描述  设置RunningAccount的数据库操作对象RunningAccountMapper
     * @参数  [runningAccountMapper]
     * @返回值  void
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:41 上午
     * @修改人和其它信息
     */
    public void setRunningAccountMapper(RunningAccountMapper runningAccountMapper) {
        this.runningAccountMapper = runningAccountMapper;
    }

    /**
     * @描述  通过流水账的ID删除
     * @参数  [id]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:45 上午
     * @修改人和其它信息
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getRunningAccountMapper().deleteByPrimaryKey(id);
    }

    /**
     * @描述  添加流水账
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:54 上午
     * @修改人和其它信息
     */
    @Override
    public int insert(RunningAccount record) {
        return this.getRunningAccountMapper().insert(record);
    }

    /**
     * @描述  添加流水账
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:54 上午
     * @修改人和其它信息
     */
    @Override
    public int insertSelective(RunningAccount record) {
        return this.getRunningAccountMapper().insertSelective(record);
    }

    /**
     * @描述  通过消费ID查找流水账
     * @参数  [id]
     * @返回值  cn.liupengstudy.family_finance_system.pojo.RunningAccount
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:54 上午
     * @修改人和其它信息
     */
    @Override
    public RunningAccount selectByPrimaryKey(Integer id) {
        return this.getRunningAccountMapper().selectByPrimaryKey(id);
    }

    /**
     * @描述  通过ID更新流水账记录
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:54 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKeySelective(RunningAccount record) {
        return this.getRunningAccountMapper().updateByPrimaryKeySelective(record);
    }

    /**
     * @描述  通过ID更新流水账记录
     * @参数  [record]
     * @返回值  int
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2019/11/16 - 8:54 上午
     * @修改人和其它信息
     */
    @Override
    public int updateByPrimaryKey(RunningAccount record) {
        return this.getRunningAccountMapper().updateByPrimaryKey(record);
    }
}