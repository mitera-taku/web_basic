package web_basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseRequestServlet1 extends HttpServlet {	//これのクラス名を呼ぶだけでは表示されないのでxml内で定義されていることを確認する 
		
		public void doGet(HttpServletRequest request, HttpServletResponse response)
		
		    throws ServletException, IOException {
		
		 
		
		        //リクエストスコープへの登録
		
		        request.setAttribute("bookTitle", "JSP/サーブレットの本");
		
		        request.getRequestDispatcher("/useRequest1.jsp").forward(request, response);
		
		    


	}

}
