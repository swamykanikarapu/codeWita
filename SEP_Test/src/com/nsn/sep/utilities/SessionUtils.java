package com.nsn.sep.utilities;

import javax.servlet.http.HttpServletRequest;

import com.nsn.sep.models.Sep_user;

public class SessionUtils {
	public static Sep_user setUser(HttpServletRequest request)
    {    
		Sep_user user1=new Sep_user();
		Sep_user user= (Sep_user) request.getAttribute("Se");
		/*user1.setFIRSTNAME(user.getFIRSTNAME());*/
        return user;
    }

}
