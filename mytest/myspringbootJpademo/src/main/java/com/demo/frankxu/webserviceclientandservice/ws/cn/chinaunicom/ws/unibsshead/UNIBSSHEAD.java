
package cn.chinaunicom.ws.unibsshead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIG_DOMAIN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVICE_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPERATE_NAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTION_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTION_RELATION">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROUTING">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ROUTE_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ROUTE_VALUE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PROC_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRANS_IDO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRANS_IDH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROCESS_TIME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESPONSE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RSP_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RSP_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RSP_DESC">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="512"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COM_BUS_INFO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OPER_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PROVINCE_CODE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EPARCHY_CODE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CITY_CODE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CHANNEL_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CHANNEL_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ACCESS_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ORDER_TYPE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SP_RESERVE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TRANS_IDC" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CUTOFFDAY" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OSNDUNS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="HSNDUNS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CONV_ID" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TEST_FLAG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSG_SENDER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSG_RECEIVER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "origdomain",
    "servicename",
    "operatename",
    "actioncode",
    "actionrelation",
    "routing",
    "procid",
    "transido",
    "transidh",
    "processtime",
    "response",
    "combusinfo",
    "spreserve",
    "testflag",
    "msgsender",
    "msgreceiver"
})
@XmlRootElement(name = "UNI_BSS_HEAD")
public class UNIBSSHEAD {

    @XmlElement(name = "ORIG_DOMAIN", required = true)
    protected String origdomain;
    @XmlElement(name = "SERVICE_NAME", required = true)
    protected String servicename;
    @XmlElement(name = "OPERATE_NAME", required = true)
    protected String operatename;
    @XmlElement(name = "ACTION_CODE", required = true)
    protected String actioncode;
    @XmlElement(name = "ACTION_RELATION", required = true)
    protected String actionrelation;
    @XmlElement(name = "ROUTING", required = true)
    protected UNIBSSHEAD.ROUTING routing;
    @XmlElement(name = "PROC_ID", required = true)
    protected String procid;
    @XmlElement(name = "TRANS_IDO", required = true)
    protected String transido;
    @XmlElement(name = "TRANS_IDH")
    protected String transidh;
    @XmlElement(name = "PROCESS_TIME", required = true)
    protected String processtime;
    @XmlElement(name = "RESPONSE")
    protected UNIBSSHEAD.RESPONSE response;
    @XmlElement(name = "COM_BUS_INFO")
    protected UNIBSSHEAD.COMBUSINFO combusinfo;
    @XmlElement(name = "SP_RESERVE", required = true)
    protected UNIBSSHEAD.SPRESERVE spreserve;
    @XmlElement(name = "TEST_FLAG", required = true)
    protected String testflag;
    @XmlElement(name = "MSG_SENDER", required = true)
    protected String msgsender;
    @XmlElement(name = "MSG_RECEIVER", required = true)
    protected String msgreceiver;

    /**
     * 获取origdomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGDOMAIN() {
        return origdomain;
    }

    /**
     * 设置origdomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGDOMAIN(String value) {
        this.origdomain = value;
    }

    /**
     * 获取servicename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICENAME() {
        return servicename;
    }

    /**
     * 设置servicename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICENAME(String value) {
        this.servicename = value;
    }

    /**
     * 获取operatename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATENAME() {
        return operatename;
    }

    /**
     * 设置operatename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATENAME(String value) {
        this.operatename = value;
    }

    /**
     * 获取actioncode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONCODE() {
        return actioncode;
    }

    /**
     * 设置actioncode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONCODE(String value) {
        this.actioncode = value;
    }

    /**
     * 获取actionrelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONRELATION() {
        return actionrelation;
    }

    /**
     * 设置actionrelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONRELATION(String value) {
        this.actionrelation = value;
    }

    /**
     * 获取routing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSHEAD.ROUTING }
     *     
     */
    public UNIBSSHEAD.ROUTING getROUTING() {
        return routing;
    }

    /**
     * 设置routing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSHEAD.ROUTING }
     *     
     */
    public void setROUTING(UNIBSSHEAD.ROUTING value) {
        this.routing = value;
    }

    /**
     * 获取procid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCID() {
        return procid;
    }

    /**
     * 设置procid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCID(String value) {
        this.procid = value;
    }

    /**
     * 获取transido属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSIDO() {
        return transido;
    }

    /**
     * 设置transido属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSIDO(String value) {
        this.transido = value;
    }

    /**
     * 获取transidh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSIDH() {
        return transidh;
    }

    /**
     * 设置transidh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSIDH(String value) {
        this.transidh = value;
    }

    /**
     * 获取processtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSTIME() {
        return processtime;
    }

    /**
     * 设置processtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSTIME(String value) {
        this.processtime = value;
    }

    /**
     * 获取response属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSHEAD.RESPONSE }
     *     
     */
    public UNIBSSHEAD.RESPONSE getRESPONSE() {
        return response;
    }

    /**
     * 设置response属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSHEAD.RESPONSE }
     *     
     */
    public void setRESPONSE(UNIBSSHEAD.RESPONSE value) {
        this.response = value;
    }

    /**
     * 获取combusinfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSHEAD.COMBUSINFO }
     *     
     */
    public UNIBSSHEAD.COMBUSINFO getCOMBUSINFO() {
        return combusinfo;
    }

    /**
     * 设置combusinfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSHEAD.COMBUSINFO }
     *     
     */
    public void setCOMBUSINFO(UNIBSSHEAD.COMBUSINFO value) {
        this.combusinfo = value;
    }

    /**
     * 获取spreserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSHEAD.SPRESERVE }
     *     
     */
    public UNIBSSHEAD.SPRESERVE getSPRESERVE() {
        return spreserve;
    }

    /**
     * 设置spreserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSHEAD.SPRESERVE }
     *     
     */
    public void setSPRESERVE(UNIBSSHEAD.SPRESERVE value) {
        this.spreserve = value;
    }

    /**
     * 获取testflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTFLAG() {
        return testflag;
    }

    /**
     * 设置testflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTFLAG(String value) {
        this.testflag = value;
    }

    /**
     * 获取msgsender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGSENDER() {
        return msgsender;
    }

    /**
     * 设置msgsender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGSENDER(String value) {
        this.msgsender = value;
    }

    /**
     * 获取msgreceiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGRECEIVER() {
        return msgreceiver;
    }

    /**
     * 设置msgreceiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGRECEIVER(String value) {
        this.msgreceiver = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OPER_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PROVINCE_CODE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EPARCHY_CODE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CITY_CODE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CHANNEL_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CHANNEL_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="7"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ACCESS_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ORDER_TYPE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operid",
        "provincecode",
        "eparchycode",
        "citycode",
        "channelid",
        "channeltype",
        "accesstype",
        "ordertype"
    })
    public static class COMBUSINFO {

        @XmlElement(name = "OPER_ID", required = true)
        protected String operid;
        @XmlElement(name = "PROVINCE_CODE")
        protected String provincecode;
        @XmlElement(name = "EPARCHY_CODE")
        protected String eparchycode;
        @XmlElement(name = "CITY_CODE")
        protected String citycode;
        @XmlElement(name = "CHANNEL_ID", required = true)
        protected String channelid;
        @XmlElement(name = "CHANNEL_TYPE", required = true)
        protected String channeltype;
        @XmlElement(name = "ACCESS_TYPE", required = true)
        protected String accesstype;
        @XmlElement(name = "ORDER_TYPE")
        protected String ordertype;

        /**
         * 获取operid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPERID() {
            return operid;
        }

        /**
         * 设置operid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPERID(String value) {
            this.operid = value;
        }

        /**
         * 获取provincecode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVINCECODE() {
            return provincecode;
        }

        /**
         * 设置provincecode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVINCECODE(String value) {
            this.provincecode = value;
        }

        /**
         * 获取eparchycode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEPARCHYCODE() {
            return eparchycode;
        }

        /**
         * 设置eparchycode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEPARCHYCODE(String value) {
            this.eparchycode = value;
        }

        /**
         * 获取citycode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * 设置citycode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * 获取channelid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHANNELID() {
            return channelid;
        }

        /**
         * 设置channelid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHANNELID(String value) {
            this.channelid = value;
        }

        /**
         * 获取channeltype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHANNELTYPE() {
            return channeltype;
        }

        /**
         * 设置channeltype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHANNELTYPE(String value) {
            this.channeltype = value;
        }

        /**
         * 获取accesstype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCESSTYPE() {
            return accesstype;
        }

        /**
         * 设置accesstype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCESSTYPE(String value) {
            this.accesstype = value;
        }

        /**
         * 获取ordertype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDERTYPE() {
            return ordertype;
        }

        /**
         * 设置ordertype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDERTYPE(String value) {
            this.ordertype = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RSP_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RSP_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RSP_DESC">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="512"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rsptype",
        "rspcode",
        "rspdesc"
    })
    public static class RESPONSE {

        @XmlElement(name = "RSP_TYPE", required = true)
        protected String rsptype;
        @XmlElement(name = "RSP_CODE", required = true)
        protected String rspcode;
        @XmlElement(name = "RSP_DESC", required = true)
        protected String rspdesc;

        /**
         * 获取rsptype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRSPTYPE() {
            return rsptype;
        }

        /**
         * 设置rsptype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRSPTYPE(String value) {
            this.rsptype = value;
        }

        /**
         * 获取rspcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRSPCODE() {
            return rspcode;
        }

        /**
         * 设置rspcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRSPCODE(String value) {
            this.rspcode = value;
        }

        /**
         * 获取rspdesc属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRSPDESC() {
            return rspdesc;
        }

        /**
         * 设置rspdesc属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRSPDESC(String value) {
            this.rspdesc = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ROUTE_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ROUTE_VALUE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routetype",
        "routevalue"
    })
    public static class ROUTING {

        @XmlElement(name = "ROUTE_TYPE", required = true)
        protected String routetype;
        @XmlElement(name = "ROUTE_VALUE", required = true)
        protected String routevalue;

        /**
         * 获取routetype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTETYPE() {
            return routetype;
        }

        /**
         * 设置routetype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTETYPE(String value) {
            this.routetype = value;
        }

        /**
         * 获取routevalue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTEVALUE() {
            return routevalue;
        }

        /**
         * 设置routevalue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTEVALUE(String value) {
            this.routevalue = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TRANS_IDC" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CUTOFFDAY" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OSNDUNS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="HSNDUNS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CONV_ID" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transidc",
        "cutoffday",
        "osnduns",
        "hsnduns",
        "convid"
    })
    public static class SPRESERVE {

        @XmlElement(name = "TRANS_IDC")
        protected String transidc;
        @XmlElement(name = "CUTOFFDAY")
        protected String cutoffday;
        @XmlElement(name = "OSNDUNS", required = true)
        protected String osnduns;
        @XmlElement(name = "HSNDUNS")
        protected String hsnduns;
        @XmlElement(name = "CONV_ID")
        protected String convid;

        /**
         * 获取transidc属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSIDC() {
            return transidc;
        }

        /**
         * 设置transidc属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSIDC(String value) {
            this.transidc = value;
        }

        /**
         * 获取cutoffday属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUTOFFDAY() {
            return cutoffday;
        }

        /**
         * 设置cutoffday属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUTOFFDAY(String value) {
            this.cutoffday = value;
        }

        /**
         * 获取osnduns属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOSNDUNS() {
            return osnduns;
        }

        /**
         * 设置osnduns属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOSNDUNS(String value) {
            this.osnduns = value;
        }

        /**
         * 获取hsnduns属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHSNDUNS() {
            return hsnduns;
        }

        /**
         * 设置hsnduns属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHSNDUNS(String value) {
            this.hsnduns = value;
        }

        /**
         * 获取convid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONVID() {
            return convid;
        }

        /**
         * 设置convid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONVID(String value) {
            this.convid = value;
        }

    }

}
