package com.demo.frankxu.product.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@ApiModel
public class CustInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("客户id")
    private  long id;

    @Column
    @ApiModelProperty("客户BSS编码")
    private String custNo;//客户编码
    @Column
    @ApiModelProperty("客户名称")
    private String custName;//客户名称
    @Column
    @ApiModelProperty("归属省")
    private String provinceCode;//归属省份
    @Column
    @ApiModelProperty("归属地市")
    private String eparchyCode;//归属地市
    @Column
    @ApiModelProperty("归属区县")
    private String countyCode;//归属区县
    @Column
    @ApiModelProperty("订购状态")
    private String orderStatus; //用户订购状态
    @ApiModelProperty("用户客户1：N关系")
    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)//一个客户可以订购多个产品
    @JoinTable(name = "CustInfoCustUsersRel", joinColumns = {@JoinColumn(name = "custuer_id")},
    inverseJoinColumns={@JoinColumn(name = "custInfo_id")})


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


    @Override
    public String toString() {
        return "CustInfo{" +
                "id=" + id +
                ", custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", eparchyCode='" + eparchyCode + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", custUsers=" +  +
                '}';
    }
}
