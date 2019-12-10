package cn.liupengstudy.family_finance_system.pojo.tools.datetime;

import cn.liupengstudy.family_finance_system.pojo.tools.date.StringToDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/6 - 11:10 下午
 * @修改人和其它信息
 */
public class StringToDateTimeTest {

    private StringToDate stringToDate;


    @Before
    public void setUp() throws Exception {
        System.out.println("---bagin---");
        this.stringToDate = new StringToDate("2019-12-06");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---end---");
    }

    @Test
    public void getStringTypeDate() {
    }

    @Test
    public void setStringTypeDate() {
    }

    @Test
    public void getDate() {
    }

    @Test
    public void setDate() {
    }
}