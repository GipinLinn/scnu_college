package core.model;/** * Created by gipin on 2017/3/5. */public class Student {    /**     * 学号     */    private Integer account;    /**     * 姓名     */    private String name;    /**     * 年级     */    private Integer grade;    /**     * 专业     */    private Integer major;    public static final class MAJORS{        /**         * 网络工程职业教育         */        public static final int NET = 1;        /**         * 电子商务职业教育         */        public static final int ECM = 2;    }    /**     * 密码     */    private String password;    private String rppassword;    public Integer getAccount() {        return account;    }    public void setAccount(Integer account) {        this.account = account;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public Integer getGrade() {        return grade;    }    public void setGrade(Integer grade) {        this.grade = grade;    }    public Integer getMajor() {        return major;    }    public void setMajor(Integer major) {        this.major = major;    }    public String getPassword() {        return password;    }    public void setPassword(String password) {        this.password = password;    }    public String getRppassword() {        return rppassword;    }    public void setRppassword(String rppassword) {        this.rppassword = rppassword;    }}