package iuh.se.tuan03.Bai4Controller;

import org.mariadb.jdbc.Connection;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBUtil {
    private DataSource dataSource;
    public DBUtil(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public Connection getConnection() throws SQLException {
        Connection con ;
        try{
            con = (Connection) dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
