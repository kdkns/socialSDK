package com.ssdk.utils;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SecurityServlet
 */
@WebServlet("/SecurityServlet")
public class SecurityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private static Logger logger = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	logger.info("Re-directing to index.jsp");    	
       	response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int uid = 0;
    	
    	if((request.getParameter("loginPassword")==null) || (request.getParameter("loginPassword").isEmpty())){
//    		logger.warn("No Password, Re-directing to index.jsp");
    		response.sendRedirect("index.jsp");
    	}else{
    		try {
    			Connection conn = DWJDBCUtils.getConnection();
    			PreparedStatement getUserProfileDataStatement = null;

    		    String getUserProfileData =
    		        "SELECT * FROM user_profiles WHERE first_name = ?";
    		    
    		        conn.setAutoCommit(false);
    		        getUserProfileDataStatement = conn.prepareStatement(getUserProfileData);

    		        
    		        getUserProfileDataStatement.setString(1, request.getParameter("loginID"));
    		        ResultSet rs = getUserProfileDataStatement.executeQuery();
    		        
    		        while(rs.next()){
//    		        	logger.info(rs.getString(1));
//    		        	logger.info(rs.getString(2));
//    		        	logger.info(rs.getString(3));
    		        	uid = rs.getInt(1);
    		        }
    		        rs.close();
    		        conn.close();
    		            
    		} catch (SQLException e) {
//    			logger.error(e.getMessage());
    		}
    		
    		request.setAttribute("uid", uid);
    		request.getRequestDispatcher("profile.jsp").forward(request, response);	
    	}    	 
	}

}
