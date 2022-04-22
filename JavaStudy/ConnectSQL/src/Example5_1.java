import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_1 {

    /* 定数（接続先の情報） */
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
        ResultSet resultSet = null;

        try {
        	//データベースに接続する準備
            Class.forName(POSTGRES_DRIVER);
            
            //DriveManagerクラスのgetConnection()メソッドを使ってデータベースに接続
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
            
            //SQLの実行には、Statementインターフェースを使用
            statement = connection.createStatement();
            
            //テーブル名のデータを抽出するSQL文
            String SQL = "SELECT * FROM goods_table";
            
            //executeQuery()メソッドは、
            //引数で指定されたSQLをデータベースで実行するメソッド
            resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                String column1 = resultSet.getString("goods_code");	//文字列の場合はgetString
                String column2 = resultSet.getString("goods_name");
                int column3 = resultSet.getInt("price");			//文字列の場合はgetInt

                System.out.print(column1 + ",");
                System.out.print(column2 + ",");
                System.out.println(column3);
            }

            // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

            // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
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