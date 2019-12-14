package cn.liupengstudy.family_finance_system.pojo.tools.date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools.date
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/7 - 5:15 下午
 * @修改人和其它信息
 */
public class GetNextWeekByLPTest {

    private GetNextWeekByLP getNextWeekByLP;

    public GetNextWeekByLP getGetNextWeek() {
        return getNextWeekByLP;
    }

    public void setGetNextWeek(GetNextWeekByLP getNextWeekByLP) {
        this.getNextWeekByLP = getNextWeekByLP;
    }

    @Before
    public void setUp() throws Exception {
        lpPrintln("----Start----");
        this.setGetNextWeek(new GetNextWeekByLP("2019-12-07"));
    }

    @After
    public void tearDown() throws Exception {
        lpPrintln("----End----");
    }

    @Test
    public void getStringDate() {
        lpPrintln(this.getGetNextWeek().getStringDate());
    }

    @Test
    public void getStringNextWeekDate() {
        lpPrintln(this.getGetNextWeek().getStringNextWeekDate());
    }

    public void lpPrintln(String string){
        System.out.println(string);
    }
}