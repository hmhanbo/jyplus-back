/**
 * @author hanbo
 * @date 2018/8/25 17:17
 */

package com.jys.jyplus.trouble.vo;


import java.sql.Date;

public class TroubleBondVo {
    private Integer troubleId;
    private Date troubleDate;
    private String troubleType;
    private String troubleTroubler;
    private String phTrader;
    private String phManager;
    private String dealerCorp;
    private String dealerPeople;
    private String counterpartyCorp;
    private String counterpartyPeople;
    private String troubleDetail;
    private String troubleProblem;
    private String troubleSolve;
    private String troubleSolvePeople;

    public Integer getTroubleId() {
        return troubleId;
    }

    public void setTroubleId(Integer troubleId) {
        this.troubleId = troubleId;
    }

    public Date getTroubleDate() {
        return troubleDate;
    }

    public void setTroubleDate(Date troubleDate) {
        this.troubleDate = troubleDate;
    }

    public String getTroubleType() {
        return troubleType;
    }

    public void setTroubleType(String troubleType) {
        this.troubleType = troubleType;
    }

    public String getTroubleTroubler() {
        return troubleTroubler;
    }

    public void setTroubleToubler(String troubleToubler) {
        this.troubleTroubler = troubleToubler;
    }

    public String getPhTrader() {
        return phTrader;
    }

    public void setPhTrader(String phTrader) {
        this.phTrader = phTrader;
    }

    public String getPhManager() {
        return phManager;
    }

    public void setPhManager(String phManager) {
        this.phManager = phManager;
    }

    public String getDealerCorp() {
        return dealerCorp;
    }

    public void setDealerCorp(String dealerCorp) {
        this.dealerCorp = dealerCorp;
    }

    public String getDealerPeople() {
        return dealerPeople;
    }

    public void setDealerPeople(String dealerPeople) {
        this.dealerPeople = dealerPeople;
    }

    public String getCounterpartyCorp() {
        return counterpartyCorp;
    }

    public void setCounterpartyCorp(String counterpartyCorp) {
        this.counterpartyCorp = counterpartyCorp;
    }

    public String getCounterpartyPeople() {
        return counterpartyPeople;
    }

    public void setCounterpartyPeople(String counterpartyPeople) {
        this.counterpartyPeople = counterpartyPeople;
    }

    public String getTroubleDetail() {
        return troubleDetail;
    }

    public void setTroubleDetail(String troubleDetail) {
        this.troubleDetail = troubleDetail;
    }

    public String getTroubleProblem() {
        return troubleProblem;
    }

    public void setTroubleProblem(String troubleProblem) {
        this.troubleProblem = troubleProblem;
    }

    public String getTroubleSolve() {
        return troubleSolve;
    }

    public void setTroubleSolve(String troubleSolve) {
        this.troubleSolve = troubleSolve;
    }

    public String getTroubleSolvePeople() {
        return troubleSolvePeople;
    }

    public void setTroubleSolvePeople(String troubleSolvePeople) {
        this.troubleSolvePeople = troubleSolvePeople;
    }
}
