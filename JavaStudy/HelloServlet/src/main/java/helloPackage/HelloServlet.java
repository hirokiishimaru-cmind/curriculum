package helloPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloServlet extends HttpServlet {
	//オーバーライドなので一字一句間違えず記述する
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    				//第一引数　HTTPリクエストに対応　　第二引数　HTTPレスポンスに対応
    
            throws IOException, ServletException {
        response.setContentType("text/html; charset=Windows-31J");
        //setContentType()メソッドでレスポンスのMIMEタイプを指定
        //テキストや画像、オーディオファイルなど、拡張子だけでは転送先のブラウザ上で判別が難しい情報を伝えるための設定
        
        PrintWriter out = response.getWriter();
        //responceより呼び出したgetWriter()メソッドで、PrintWriterクラスのインスタンス（out）を生成
        
        out.println("<body>HelloServlet</body>");
        //今までのコンソールに表示するSystem.out.print()と同様の感覚で
        //PrintWriterクラスのprint()メソッドやprintln()メソッドを扱うことができる
    }
}