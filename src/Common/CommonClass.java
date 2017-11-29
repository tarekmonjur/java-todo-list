package Common;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by Tarek Monjur on 11/20/2017.
 */
public abstract class CommonClass extends HttpServlet {

    protected String scheme;
    protected String serverName;
    protected String serverPort;
    protected String contextPath;
    protected String uri;
    protected String requestMethod;
    protected String baseUrl;
    protected String assets;

    protected String commonSettings(HttpServletRequest request){

//        request.getRequestURI();
//        request.getScheme();
//        request.getServerName();
//        request.getServerPort();
//        request.getContextPath();
//        request.getRequestURL();
//        request.getRequestURI();
//        request.getServletPath();
//        request.getPathInfo();

        this.scheme = request.getScheme();
        this.serverName = request.getServerName();
        this.serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
        this.contextPath = request.getContextPath();
        this.uri = request.getRequestURI();
        this.requestMethod = request.getMethod();
        this.baseUrl = this.scheme+"://"+this.serverName+this.serverPort+this.contextPath;
        this.assets = this.baseUrl+"/static/assets/";

        request.setAttribute("baseUrl", this.baseUrl);
        request.setAttribute("pageUri", this.uri);
        request.setAttribute("assets", this.assets);

        return this.baseUrl;
    }



}
