package cn.liupengstudy.family_finance_system.about;

/**
 * @文件名 cn.liupengstudy.family_finance_system.about
 * @描述 关于的信息
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2019/12/14 - 11:45 下午
 * @修改人和其它信息
 */
public class AboutInformation {

    // 网站作者
    private String author;

    // 网站
    private String whatfuck;

    // 维护人员
    private String WhoIsMaintainingIt;

    // 联系方式
    private String ContactInformation;

    // 时间
    private String lastDateTime;

    public AboutInformation(String author, String whatfuck, String whoIsMaintainingIt, String contactInformation, String lastDateTime) {
        this.author = author;
        this.whatfuck = whatfuck;
        WhoIsMaintainingIt = whoIsMaintainingIt;
        ContactInformation = contactInformation;
        this.lastDateTime = lastDateTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getWhatfuck() {
        return whatfuck;
    }

    public void setWhatfuck(String whatfuck) {
        this.whatfuck = whatfuck;
    }

    public String getWhoIsMaintainingIt() {
        return WhoIsMaintainingIt;
    }

    public void setWhoIsMaintainingIt(String whoIsMaintainingIt) {
        WhoIsMaintainingIt = whoIsMaintainingIt;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public void setContactInformation(String contactInformation) {
        ContactInformation = contactInformation;
    }

    public String getLastDateTime() {
        return lastDateTime;
    }

    public void setLastDateTime(String lastDateTime) {
        this.lastDateTime = lastDateTime;
    }

    @Override
    public String toString() {
        return "AboutInformation{" +
                "author='" + author + '\'' +
                ", whatfuck='" + whatfuck + '\'' +
                ", WhoIsMaintainingIt='" + WhoIsMaintainingIt + '\'' +
                ", ContactInformation='" + ContactInformation + '\'' +
                ", lastDateTime='" + lastDateTime + '\'' +
                '}';
    }
}
