
package cn.chinaunicom.ws.baiduintelligenceser.unibssbody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cn.chinaunicom.ws.baiduintelligenceser.unibssbody.baiduorderrelationnotifyreq.BAIDUORDERRELATIONNOTIFYREQ;
import cn.chinaunicom.ws.unibssattached.UNIBSSATTACHED;
import cn.chinaunicom.ws.unibsshead.UNIBSSHEAD;


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
 *         &lt;element ref="{http://ws.chinaunicom.cn/unibssHead}UNI_BSS_HEAD"/>
 *         &lt;element name="UNI_BSS_BODY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyReq}BAIDU_ORDER_RELATION_NOTIFY_REQ"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://ws.chinaunicom.cn/unibssAttached}UNI_BSS_ATTACHED"/>
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
    "unibsshead",
    "unibssbody",
    "unibssattached"
})
@XmlRootElement(name = "BAIDU_ORDER_RELATION_NOTIFY_INPUT")
public class BAIDUORDERRELATIONNOTIFYINPUT {

    @XmlElement(name = "UNI_BSS_HEAD", namespace = "http://ws.chinaunicom.cn/unibssHead", required = true)
    protected UNIBSSHEAD unibsshead;
    @XmlElement(name = "UNI_BSS_BODY", required = true)
    protected BAIDUORDERRELATIONNOTIFYINPUT.UNIBSSBODY unibssbody;
    @XmlElement(name = "UNI_BSS_ATTACHED", namespace = "http://ws.chinaunicom.cn/unibssAttached", required = true)
    protected UNIBSSATTACHED unibssattached;

    /**
     * 获取unibsshead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSHEAD }
     *     
     */
    public UNIBSSHEAD getUNIBSSHEAD() {
        return unibsshead;
    }

    /**
     * 设置unibsshead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSHEAD }
     *     
     */
    public void setUNIBSSHEAD(UNIBSSHEAD value) {
        this.unibsshead = value;
    }

    /**
     * 获取unibssbody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BAIDUORDERRELATIONNOTIFYINPUT.UNIBSSBODY }
     *     
     */
    public BAIDUORDERRELATIONNOTIFYINPUT.UNIBSSBODY getUNIBSSBODY() {
        return unibssbody;
    }

    /**
     * 设置unibssbody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BAIDUORDERRELATIONNOTIFYINPUT.UNIBSSBODY }
     *     
     */
    public void setUNIBSSBODY(BAIDUORDERRELATIONNOTIFYINPUT.UNIBSSBODY value) {
        this.unibssbody = value;
    }

    /**
     * 获取unibssattached属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UNIBSSATTACHED }
     *     
     */
    public UNIBSSATTACHED getUNIBSSATTACHED() {
        return unibssattached;
    }

    /**
     * 设置unibssattached属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UNIBSSATTACHED }
     *     
     */
    public void setUNIBSSATTACHED(UNIBSSATTACHED value) {
        this.unibssattached = value;
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
     *         &lt;element ref="{http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyReq}BAIDU_ORDER_RELATION_NOTIFY_REQ"/>
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
        "baiduorderrelationnotifyreq"
    })
    public static class UNIBSSBODY {

        @XmlElement(name = "BAIDU_ORDER_RELATION_NOTIFY_REQ", namespace = "http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyReq", required = true)
        protected BAIDUORDERRELATIONNOTIFYREQ baiduorderrelationnotifyreq;

        /**
         * 获取baiduorderrelationnotifyreq属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BAIDUORDERRELATIONNOTIFYREQ }
         *     
         */
        public BAIDUORDERRELATIONNOTIFYREQ getBAIDUORDERRELATIONNOTIFYREQ() {
            return baiduorderrelationnotifyreq;
        }

        /**
         * 设置baiduorderrelationnotifyreq属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BAIDUORDERRELATIONNOTIFYREQ }
         *     
         */
        public void setBAIDUORDERRELATIONNOTIFYREQ(BAIDUORDERRELATIONNOTIFYREQ value) {
            this.baiduorderrelationnotifyreq = value;
        }

    }

}
