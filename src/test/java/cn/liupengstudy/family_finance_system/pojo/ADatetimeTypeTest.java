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
 * @创建时间 2019/11/20 - 8:26 下午
 * @修改人和其它信息
 */
public class ADatetimeTypeTest {

    private ADatetimeType aDatetimeType;

    public ADatetimeType getaDatetimeType() {
        return aDatetimeType;
    }

    public void setaDatetimeType(ADatetimeType aDatetimeType) {
        this.aDatetimeType = aDatetimeType;
    }

    @Before
    public void setUp() throws Exception {
        this.aDatetimeType = new ADatetimeType();
        this.getaDatetimeType().setDatetime1("2019-11-30 12:00:01");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getDatetime1() {
        System.out.println(this.getaDatetimeType().getDatetime1());
    }

    @Test
    public void setDatetime1() {
    }

    @Test
    public void getDatetime2() {
        System.out.println(this.getaDatetimeType().getDatetime2());
    }

    @Test
    public void main() {
    }
}