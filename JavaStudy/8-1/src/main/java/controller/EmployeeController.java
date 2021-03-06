package controller;
 
/**
 * 社員情報管理コントローラー
 */
 
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;
import service.EmployeeService;
 
public class EmployeeController extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 
 try {
  // 問① index.htmlから送信されたIDとPassWordの値を取得できるように修正しましょう。
 String id = request.getParameter("id");
 String password = request.getParameter("pass");
 
 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */
 
  // 問② EmployeeServiceクラスをインスタンス化する。
 EmployeeService employeeService = new EmployeeService();
  // 問③ EmployeeBeanに、EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
// 戻り値に合った型が必要
// 生成したインスタンスからemployeeServiceクラスのsearchメソッドを呼び出し、
 //EmployeeBean型の変数ebに格納　
 
 //戻り値EmployeeBeanに格納できる理由↓
 
 //Searchメソッドの戻り値が、EmployeeBean型だから、
 //EmployeeBeanクラスのインスタンスを生成して、そこにSearchメソッドの戻り値を格納している
 
 //EmployeeServiceクラスのインスタンスからSearchメソッドを呼び出して、戻り値をEmplooyeeBean型の変数ebに格納。
 //なんで入るの？
 //戻り値がEmployeeBean型だから
 EmployeeBean eb = employeeService.search(id, password);
 
  // 問④ nullの部分に適切な引数をセットする。
 request.setAttribute("EmployeeBean", eb);
//(スコープのオブジェクト).setAttribute("データ名", データ);
 //requestの中にEmployeeBeanという属性名をつけたebという属性値を格納している
 //属性の設定
 //リクエストの範囲内で値を保持する
 
 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 ServletContext context = this.getServletContext();
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
 dispatcher.forward(request, response);
 }
 }
}