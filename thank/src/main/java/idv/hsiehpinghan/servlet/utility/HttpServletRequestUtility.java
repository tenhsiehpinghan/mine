package idv.hsiehpinghan.servlet.utility;

import idv.hsiehpinghan.servlet.model.HttpServletRequestInfo;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtility {
	/**
	 * 產生HttpServletRequest資訊物件。
	 * @param httpServletRequest
	 * @return
	 */
	public static HttpServletRequestInfo parseInfo(HttpServletRequest httpServletRequest) {
		HttpServletRequestInfo info = new HttpServletRequestInfo();
		info.setAuthType(httpServletRequest.getAuthType());
		info.setLocales(httpServletRequest.getLocales());
		info.setContextPath(httpServletRequest.getContextPath());
		info.setMethod(httpServletRequest.getMethod());
		info.setProtocol(httpServletRequest.getProtocol());
		info.setQueryString(httpServletRequest.getQueryString());
		info.setRemoteAddr(httpServletRequest.getRemoteAddr());
		info.setRemotePort(httpServletRequest.getRemotePort());
		info.setRequestedSessionId(httpServletRequest.getRequestedSessionId());
		info.setRequestUri(httpServletRequest.getRequestURI());
		info.setRequestUrl(httpServletRequest.getRequestURL());
		info.setScheme(httpServletRequest.getScheme());
		info.setServerName(httpServletRequest.getServerName());
		info.setServerPort(httpServletRequest.getServerPort());
		info.setServletPath(httpServletRequest.getServletPath());
		info.setUserPrincipal(httpServletRequest.getUserPrincipal());
		info.setHeaderNames(httpServletRequest.getHeaderNames());
		
		return info;
	}
}
