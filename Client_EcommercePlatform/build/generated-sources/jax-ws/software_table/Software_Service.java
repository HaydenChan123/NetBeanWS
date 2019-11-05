
package software_table;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "software", targetNamespace = "http://software_table/", wsdlLocation = "http://192.168.56.1:8080/WS-Software/software?wsdl")
public class Software_Service
    extends Service
{

    private final static URL SOFTWARE_WSDL_LOCATION;
    private final static WebServiceException SOFTWARE_EXCEPTION;
    private final static QName SOFTWARE_QNAME = new QName("http://software_table/", "software");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.56.1:8080/WS-Software/software?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOFTWARE_WSDL_LOCATION = url;
        SOFTWARE_EXCEPTION = e;
    }

    public Software_Service() {
        super(__getWsdlLocation(), SOFTWARE_QNAME);
    }

    public Software_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOFTWARE_QNAME, features);
    }

    public Software_Service(URL wsdlLocation) {
        super(wsdlLocation, SOFTWARE_QNAME);
    }

    public Software_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOFTWARE_QNAME, features);
    }

    public Software_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Software_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Software
     */
    @WebEndpoint(name = "softwarePort")
    public Software getSoftwarePort() {
        return super.getPort(new QName("http://software_table/", "softwarePort"), Software.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Software
     */
    @WebEndpoint(name = "softwarePort")
    public Software getSoftwarePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://software_table/", "softwarePort"), Software.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOFTWARE_EXCEPTION!= null) {
            throw SOFTWARE_EXCEPTION;
        }
        return SOFTWARE_WSDL_LOCATION;
    }

}
