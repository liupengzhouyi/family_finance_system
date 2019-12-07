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
 * @创建时间 2019/12/7 - 5:15 下午
 * @修改人和其它信息
 */
public class GetNextWeekTest {

    private GetNextWeek getNextWeek;

    public GetNextWeek getGetNextWeek() {
        return getNextWeek;
    }

    public void setGetNextWeek(GetNextWeek getNextWeek) {
        this.getNextWeek = getNextWeek;
    }

    @Before
    public void setUp() throws Exception {
        lpPrintln("----Start----");
        this.setGetNextWeek(new GetNextWeek("2019-12-07"));
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