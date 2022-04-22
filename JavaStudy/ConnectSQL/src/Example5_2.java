import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_2 {

    /* 定数 */
    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/test7th";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "dock6132";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(POSTGRES_DRIVER);
            connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
            
            //INSERT文、UPDATE文、DELETE文の実行でも、Statementインターフェースを使う
            statement = connection.createStatement();

//          String SQL = "INSERT INTO テーブル名(列名, 列名, …) VALUES( 値, 値, …) ";
            String SQL = "INSERT INTO goods_table( goods_code, goods_name, price, update_day)"
            + " VALUES('001', 'SHOHIN021', 2100, '2022-04-20') ";
            
            //INSERT文、UPDATE文、DELETE文の場合は、executeUpdate()メソッドを使う
            statement.executeUpdate(SQL);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}