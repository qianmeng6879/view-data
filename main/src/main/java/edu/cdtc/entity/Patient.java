package edu.cdtc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Patient)实体类
 *
 * @author makejava
 * @since 2022-12-08 10:11:44
 */
public class Patient implements Serializable {
    private static final long serialVersionUID = -43253927922602319L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 国家名称
     */
    private String country;
    /**
     * 省份
     */
    private String province;
    /**
     * 患者姓名
     */
    private String patientName;
    /**
     * 或者类型（1有症状2无症状）
     */
    private String patientType;
    /**
     * 患者状态（0疑似1确诊2治愈3重症4死亡）
     */
    private String patientState;
    /**
     * 创建时间
     */
    private Date createDatetime;
    /**
     * 确诊时间
     */
    private Date suretime;
    /**
     * 重症时间
     */
    private Date hardtime;
    /**
     * 治愈时间
     */
    private Date curetime;
    /**
     * 死亡时间
     */
    private Date dietime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getSuretime() {
        return suretime;
    }

    public void setSuretime(Date suretime) {
        this.suretime = suretime;
    }

    public Date getHardtime() {
        return hardtime;
    }

    public void setHardtime(Date hardtime) {
        this.hardtime = hardtime;
    }

    public Date getCuretime() {
        return curetime;
    }

    public void setCuretime(Date curetime) {
        this.curetime = curetime;
    }

    public Date getDietime() {
        return dietime;
    }

    public void setDietime(Date dietime) {
        this.dietime = dietime;
    }

}

