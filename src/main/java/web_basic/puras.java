package web_basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class puras extends HttpServlet{
	public class FormSampleServlet extends HttpServlet{
		private static final long serialVersionUID = 1L;
		
		protected void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException{
			
			// リクエストパラメータの文字コードを指定
			request.setCharacterEncoding("UTF-8");
			
			// リクエストパラメータを取得
			String input_name = request.getParameter("input_name");
			String input_gender = request.getParameter("input_gender");
			
			// 性別の初期値をセット
			String result_gender = "不明";
			
			// 性別判定（0：男、1：女）
			if(input_gender.equals("0")) {
				result_gender = "男";
			}else if(input_gender.equals("1")){
				result_gender = "女";
			}
			
			// HTMLを出力
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>入力結果</title>");
			out.println("<body>");
			out.println("<p>入力結果</p>");
			out.println("<p>名前：" + input_name + "</p>");
			out.println("<p>性別："+ result_gender + "</p>");
			out.println("</body>");	
		}	
	}
}
