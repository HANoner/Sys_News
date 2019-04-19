package entity;

import java.util.Date;

public class news {
    private Integer id;

    private String xinwenbiaoti;

    private String xinwenzhaiyao;

    private String zuozhe;

    private Date chuangjianshijian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXinwenbiaoti() {
        return xinwenbiaoti;
    }

    public void setXinwenbiaoti(String xinwenbiaoti) {
        this.xinwenbiaoti = xinwenbiaoti == null ? null : xinwenbiaoti.trim();
    }

    public String getXinwenzhaiyao() {
        return xinwenzhaiyao;
    }

    public void setXinwenzhaiyao(String xinwenzhaiyao) {
        this.xinwenzhaiyao = xinwenzhaiyao == null ? null : xinwenzhaiyao.trim();
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe == null ? null : zuozhe.trim();
    }

    public Date getChuangjianshijian() {
        return chuangjianshijian;
    }

    public void setChuangjianshijian(Date chuangjianshijian) {
        this.chuangjianshijian = chuangjianshijian;
    }
}