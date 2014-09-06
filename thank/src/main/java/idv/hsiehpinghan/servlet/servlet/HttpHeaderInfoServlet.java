package idv.hsiehpinghan.servlet.servlet;

import idv.hsiehpinghan.servlet.model.HttpServletRequestInfo;
import idv.hsiehpinghan.servlet.utility.HttpServletRequestUtility;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 列印HttpServletRequest的資訊
 * @author Thank
 *
 */
public class HttpHeaderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger= LogManager.getLogger();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpServletRequestInfo info = HttpServletRequestUtility.parseInfo(req);
		logger.info(this.getServletContext().getServerInfo());
		
		super.doGet(req, resp);
	}
	
}
