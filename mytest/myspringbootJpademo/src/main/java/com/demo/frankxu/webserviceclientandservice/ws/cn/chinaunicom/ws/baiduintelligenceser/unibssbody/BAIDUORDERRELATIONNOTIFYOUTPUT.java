
package cn.chinaunicom.ws.baiduintelligenceser.unibssbody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cn.chinaunicom.ws.baiduintelligenceser.unibssbody.baiduorderrelationnotifyrsp.BAIDUORDERRELATIONNOTIFYRSP;
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
 *                   &lt;element ref="{http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyRsp}BAIDU_ORDER_RELATION_NOTIFY_RSP"/>
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
@XmlRootElement(name = "BAIDU_ORDER_RELATION_NOTIFY_OUTPUT")
public class BAIDUORDERRELATIONNOTIFYOUTPUT {

    @XmlElement(name = "UNI_BSS_HEAD", namespace = "http://ws.chinaunicom.cn/unibssHead", required = true)
    protected UNIBSSHEAD unibsshead;
    @XmlElement(name = "UNI_BSS_BODY", required = true)
    protected BAIDUORDERRELATIONNOTIFYOUTPUT.UNIBSSBODY unibssbody;
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
     *     {@link BAIDUORDERRELATIONNOTIFYOUTPUT.UNIBSSBODY }
     *     
     */
    public BAIDUORDERRELATIONNOTIFYOUTPUT.UNIBSSBODY getUNIBSSBODY() {
        return unibssbody;
    }

    /**
     * 设置unibssbody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BAIDUORDERRELATIONNOTIFYOUTPUT.UNIBSSBODY }
     *     
     */
    public void setUNIBSSBODY(BAIDUORDERRELATIONNOTIFYOUTPUT.UNIBSSBODY value) {
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
     *         &lt;element ref="{http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyRsp}BAIDU_ORDER_RELATION_NOTIFY_RSP"/>
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
        "baiduorderrelationnotifyrsp"
    })
    public static class UNIBSSBODY {

        @XmlElement(name = "BAIDU_ORDER_RELATION_NOTIFY_RSP", namespace = "http://ws.chinaunicom.cn/BaiduIntelligenceSer/unibssBody/baiduOrderRelationNotifyRsp", required = true)
        protected BAIDUORDERRELATIONNOTIFYRSP baiduorderrelationnotifyrsp;

        /**
         * 获取baiduorderrelationnotifyrsp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BAIDUORDERRELATIONNOTIFYRSP }
         *     
         */
        public BAIDUORDERRELATIONNOTIFYRSP getBAIDUORDERRELATIONNOTIFYRSP() {
            return baiduorderrelationnotifyrsp;
        }

        /**
         * 设置baiduorderrelationnotifyrsp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BAIDUORDERRELATIONNOTIFYRSP }
         *     
         */
        public void setBAIDUORDERRELATIONNOTIFYRSP(BAIDUORDERRELATIONNOTIFYRSP value) {
            this.baiduorderrelationnotifyrsp = value;
        }

    }

}
