package cn.liupengstudy.family_finance_system.pojo.tools.date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools.date
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/8 - 11:06 下午
 * @修改人和其它信息
 */
public class GetNextMonthTest {

    private GetNextMonth getNextMonth;

    public GetNextMonth getGetNextMonth() {
        return getNextMonth;
    }

    public void setGetNextMonth(GetNextMonth getNextMonth) {
        this.getNextMonth = getNextMonth;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("---Start---");
        this.setGetNextMonth(new GetNextMonth("2019-12-31"));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---End---");
    }

    @Test
    public void getStringDate() {
        lpPrintln(this.getGetNextMonth().getStringDate());
    }

    @Test
    public void getStringNextMonthDate() {
        lpPrintln(this.getGetNextMonth().getStringNextMonthDate());
    }

    public void lpPrintln(String string){
        System.out.println(string);
    }
}