package cn.rx.dao.model;

import java.io.Serializable;

public class AsUserDO implements Serializable {
    /**
     * 字段：user_id
     * 
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 字段：pic
     * 头像
     *
     * @mbg.generated
     */
    private Integer pic;

    /**
     * 字段：user_name
     * 昵称
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 字段：accounts
     * 账号
     *
     * @mbg.generated
     */
    private String accounts;

    /**
     * 字段：gender
     * 性别
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * 字段：birthday
     * 出生日期
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     * 字段：phone_num
     * 电话号码
     *
     * @mbg.generated
     */
    private String phoneNum;

    /**
     * 字段：pwd
     * 登录密码
     *
     * @mbg.generated
     */
    private String pwd;

    /**
     * 字段：address
     * 收货地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 字段：char_sign
     * 个性签名
     *
     * @mbg.generated
     */
    private String charSign;

    /**
     * 字段：email
     * 邮箱

     *
     * @mbg.generated
     */
    private String email;

    /**
     * 字段：role
     * 角色 0 管理员 1 用户
     *
     * @mbg.generated
     */
    private Integer role;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public AsUserDO withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPic() {
        return pic;
    }

    public AsUserDO withPic(Integer pic) {
        this.setPic(pic);
        return this;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public String getUserName() {
        return userName;
    }

    public AsUserDO withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccounts() {
        return accounts;
    }

    public AsUserDO withAccounts(String accounts) {
        this.setAccounts(accounts);
        return this;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getGender() {
        return gender;
    }

    public AsUserDO withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public AsUserDO withBirthday(String birthday) {
        this.setBirthday(birthday);
        return this;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public AsUserDO withPhoneNum(String phoneNum) {
        this.setPhoneNum(phoneNum);
        return this;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPwd() {
        return pwd;
    }

    public AsUserDO withPwd(String pwd) {
        this.setPwd(pwd);
        return this;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public AsUserDO withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCharSign() {
        return charSign;
    }

    public AsUserDO withCharSign(String charSign) {
        this.setCharSign(charSign);
        return this;
    }

    public void setCharSign(String charSign) {
        this.charSign = charSign;
    }

    public String getEmail() {
        return email;
    }

    public AsUserDO withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public AsUserDO withRole(Integer role) {
        this.setRole(role);
        return this;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", pic=").append(pic);
        sb.append(", userName=").append(userName);
        sb.append(", accounts=").append(accounts);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", pwd=").append(pwd);
        sb.append(", address=").append(address);
        sb.append(", charSign=").append(charSign);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AsUserDO other = (AsUserDO) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getAccounts() == null ? other.getAccounts() == null : this.getAccounts().equals(other.getAccounts()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getCharSign() == null ? other.getCharSign() == null : this.getCharSign().equals(other.getCharSign()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getCharSign() == null) ? 0 : getCharSign().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        return result;
    }
}