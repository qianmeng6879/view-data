package edu.cdtc.dto;

public class EpidemicData {
    //登记人数
    private Integer registration;

    private Integer nowConfirm;

    //累计确诊
    private Integer accumulatedDiagnosis;

    //有症状
    private Integer symptomatic;

    //无症状
    private Integer asymptomatic;

    //疑似病例
    private Integer suspectedCase;

    //治愈
    private Integer heath;

    //死亡
    private Integer die;

    //重症
    private Integer icu;

    //时间
    private String time;

    public Integer getNowConfirm() {
        return nowConfirm;
    }

    public void setNowConfirm(Integer nowConfirm) {
        this.nowConfirm = nowConfirm;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public Integer getAccumulatedDiagnosis() {
        return accumulatedDiagnosis;
    }

    public void setAccumulatedDiagnosis(Integer accumulatedDiagnosis) {
        this.accumulatedDiagnosis = accumulatedDiagnosis;
    }

    public Integer getSymptomatic() {
        return symptomatic;
    }

    public void setSymptomatic(Integer symptomatic) {
        this.symptomatic = symptomatic;
    }

    public Integer getAsymptomatic() {
        return asymptomatic;
    }

    public void setAsymptomatic(Integer asymptomatic) {
        this.asymptomatic = asymptomatic;
    }

    public Integer getSuspectedCase() {
        return suspectedCase;
    }

    public void setSuspectedCase(Integer suspectedCase) {
        this.suspectedCase = suspectedCase;
    }

    public Integer getHeath() {
        return heath;
    }

    public void setHeath(Integer heath) {
        this.heath = heath;
    }

    public Integer getDie() {
        return die;
    }

    public void setDie(Integer die) {
        this.die = die;
    }

    public Integer getIcu() {
        return icu;
    }

    public void setIcu(Integer icu) {
        this.icu = icu;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "EpidemicData{" +
                "registration=" + registration +
                ", nowConfirm=" + nowConfirm +
                ", accumulatedDiagnosis=" + accumulatedDiagnosis +
                ", symptomatic=" + symptomatic +
                ", asymptomatic=" + asymptomatic +
                ", suspectedCase=" + suspectedCase +
                ", heath=" + heath +
                ", die=" + die +
                ", icu=" + icu +
                ", time='" + time + '\'' +
                '}';
    }
}