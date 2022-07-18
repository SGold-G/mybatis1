package com.entry;

public class TabAccount {
    private Integer accountid;
    private String accountname;
    private String operatorStar;

    public String getOperatorStar() {
        return operatorStar;
    }

    public void setOperatorStar(String operatorStar) {
        this.operatorStar = operatorStar;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public String getAccountname() {
        return accountname;
    }


    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    @Override
    public String toString() {
        return "TabAccount{" +
                "accountid=" + accountid +
                ", accountname='" + accountname + '\'' +
                ", operatorStar='" + operatorStar + '\'' +
                '}';
    }
}
