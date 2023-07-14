package error.com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MytagCustom extends TagSupport
{

	@Override
	//int ye difine karta hai ki aapko body chala na hai ki nahi
	public int doStartTag() throws JspException 
	{
	 try 
	 {
	    JspWriter out=pageContext.getOut();
	    out.println("<h1>this is my custom tag</h1>");
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
	 }
		// TODO Auto-generated method stub
		return SKIP_BODY;
		
	}
	

}
