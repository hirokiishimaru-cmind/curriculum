<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="bean.EmployeeBean"%>
 
<%
 // 問① getAttributeに適切な引数をセットして、EmployeeControllerから渡されたBeanを取得する。
 EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("EmployeeBean");
/* 属性名EmployeeeBeanを呼び出し、データeb（EmployeeControllerクラスの）を取得し、変数employeeBeanに格納 */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
 <div align="center">
 <!-- 検索が成功した場合の表示 -->
 <%
 if (employeeBean != null) {
 %>
 <table border="1">
 <tr>
 <th>社員名</th>
 <!-- 変数employeeBeanのgetNameで取得した社員名のデータを表示 -->
 <td><%=employeeBean.getName()%></td>
 </tr>
 <tr>
 <th>コメント</th>
 <td><%=employeeBean.getComment()%></td>
 </tr>
 <tr>
 <th>ログインタイム</th>
 <td><%=employeeBean.getLogin_Time()%></td>
 </tr>
 </table>
 
 <!-- 問② それ以外の表示（エラーの場合）-->
 <% } else { %>
 <h1>IDもしくはパスワードが間違っています。</h1>
 <% } %>
 </div>
</body>
</html>