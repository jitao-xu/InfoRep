
package client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DiviseurNullException", targetNamespace = "http://service.SOAP/")
public class DiviseurNullException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DiviseurNullException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DiviseurNullException_Exception(String message, DiviseurNullException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DiviseurNullException_Exception(String message, DiviseurNullException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: client.DiviseurNullException
     */
    public DiviseurNullException getFaultInfo() {
        return faultInfo;
    }

}