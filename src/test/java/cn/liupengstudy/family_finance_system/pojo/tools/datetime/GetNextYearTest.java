package cn.liupengstudy.family_finance_system.pojo.tools.datetime;

import cn.liupengstudy.family_finance_system.pojo.tools.date.GetNextYear;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools.date
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/8 - 11:14 下午
 * @修改人和其它信息
 */
public class GetNextYearTest {

    private GetNextYear getNextYear;

    public GetNextYear getGetNextYear() {
        return getNextYear;
    }

    public void setGetNextYear(GetNextYear getNextYear) {
        this.getNextYear = getNextYear;
    }

    @Before
    public void setUp() throws Exception {
        lpPrintln("---Start---");
        this.setGetNextYear(new GetNextYear("2019-12-31"));
    }

    @After
    public void tearDown() throws Exception {
        lpPrintln("---End---");
    }

    @Test
    public void getStringDate() {
        lpPrintln(this.getGetNextYear().getStringDate());
    }

    @Test
    public void getStringNextYearDate() {
        lpPrintln(this.getGetNextYear().getStringNextYearDate());
    }

    public void lpPrintln(String string){
        System.out.println(string);
    }
}