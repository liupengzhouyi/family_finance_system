package cn.liupengstudy.family_finance_system.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/11/20 - 8:21 下午
 * @修改人和其它信息
 */
public class DatetimeTypeTest {

    private DatetimeType datetimeType;

    public DatetimeType getDatetimeType() {
        return datetimeType;
    }

    public void setDatetimeType(DatetimeType datetimeType) {
        this.datetimeType = datetimeType;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("-----开始测试-----");
        this.datetimeType = new DatetimeType("2019-11-01 00:00:00", "2019-11-01 00:00:00");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-----结束测试-----");
    }

    @Test
    public void getDatetime1() {
        System.out.println(this.getDatetimeType().getDatetime1());
    }

    @Test
    public void setDatetime1() {
    }

    @Test
    public void getDatetime2() {
        System.out.println(this.getDatetimeType().getDatetime2());
    }

    @Test
    public void setDatetime2() {
    }
}