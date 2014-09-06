package idv.hsiehpinghan.servlet.model;

import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class HttpServletRequestInfo {
	/**
	 * 通訊協定。
	 */
	private String scheme;
	/**
	 * 伺服器名稱。
	 */
	private String serverName;
	/**
	 * 伺服器的port。
	 */
	private int serverPort;
	/**
	 * Web應用程式路徑。
	 */
	private String contextPath;
	/**
	 * Servlet路徑。
	 */
	private String servletPath;
	/**
	 * Get方式的query參數。
	 */
	private String queryString;
	/**
	 * 授權類型。
	 */
	private String authType;
	/**
	 * 記錄已授權使用者的資訊。
	 */
	private Principal userPrincipal;
	/**
	 * Header資料。
	 */
	private Enumeration<String> headerNames;
	/**
	 * 取得通訊協定的版本。
	 */
	private String protocol;
	/**
	 * 取得request的類型。
	 */
	private String method;
	/**
	 * 取得client端的ip。
	 */
	private String remoteAddr;
	/**
	 * 取得client端的port。
	 */
	private int remotePort;
	/**
	 * 取得sessionId。
	 */
	private String requestedSessionId;
	/**
	 * 取得資源的uri。
	 */
	private String requestUri;
	/**
	 * 取得資源的url。
	 */
	private StringBuffer requestUrl;
	
	/**
	 * 取得client端可接受的語言種類。
	 */
	private Enumeration<Locale> locales;

	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public Enumeration<Locale> getLocales() {
		return locales;
	}
	public void setLocales(Enumeration<Locale> locales) {
		this.locales = locales;
	}
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	public String getRemoteAddr() {
		return remoteAddr;
	}
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	public int getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public String getRequestedSessionId() {
		return requestedSessionId;
	}
	public void setRequestedSessionId(String requestedSessionId) {
		this.requestedSessionId = requestedSessionId;
	}
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	public StringBuffer getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(StringBuffer requestUrl) {
		this.requestUrl = requestUrl;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public int getServerPort() {
		return serverPort;
	}
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
	public String getServletPath() {
		return servletPath;
	}
	public void setServletPath(String servletPath) {
		this.servletPath = servletPath;
	}
	public Principal getUserPrincipal() {
		return userPrincipal;
	}
	public void setUserPrincipal(Principal userPrincipal) {
		this.userPrincipal = userPrincipal;
	}
	public Enumeration<String> getHeaderNames() {
		return headerNames;
	}
	public void setHeaderNames(Enumeration<String> headerNames) {
		this.headerNames = headerNames;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}