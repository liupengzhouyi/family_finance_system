package cn.liupengstudy.family_finance_system.pojo.tools;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @文件名 cn.liupengstudy.family_finance_system.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/7 - 5:05 下午
 * @修改人和其它信息
 */
public class GetNextDayTest {

    private GetNextDay getNextDay;

    public GetNextDay getGetNextDay() {
        return getNextDay;
    }

    public void setGetNextDay(GetNextDay getNextDay) {
        this.getNextDay = getNextDay;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("---Start---");
        this.setGetNextDay(new GetNextDay("2019-12-31"));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("--End---");
    }

    @Test
    public void getStringDate() {
        lpPrintln(this.getGetNextDay().getStringDate());
    }

    @Test
    public void setStringDate() {
    }

    @Test
    public void getStringNextDate() {
        lpPrintln(this.getGetNextDay().getStringNextDate());
    }

    @Test
    public void setStringNextDate() {
    }

    @Test
    public void getDate() {
    }

    @Test
    public void setDate() {
    }

    @Test
    public void getNextDate() {
    }

    @Test
    public void setNextDate() {
    }

    public void lpPrintln(String string){
        System.out.println(string);
    }
}