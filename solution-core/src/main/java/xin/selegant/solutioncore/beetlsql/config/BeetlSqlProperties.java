package xin.selegant.solutioncore.beetlsql.config;

import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.db.OracleStyle;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class BeetlSqlProperties {
    /**
     * 模板跟目录
     */
    String basePackage = null;

    /**
     * 模板跟目录
     */
    String daoSuffix = null;

    /**
     * 模板跟目录
     */
    String sqlPath = null;

    /**
     * 数据库和javapojo的映射关系
     */
    String nameConversion = null;

    /**
     * 何种数据库
     */
    String dbStyle = null;

    /**
     * 是否输出debug
     */
    Boolean dev = true;


    public BeetlSqlProperties(Environment env) {
        basePackage = env.getProperty("beetlsql.basePackage", "xin.selegant.solutionservice.dao");
        daoSuffix = env.getProperty("beetlsql.daoSuffix", "Dao");
        sqlPath = env.getProperty("beetlsql.sqlPath", "/sql");
        nameConversion = env.getProperty("beetlsql.nameConversion", "org.beetl.sql.core.JPA2NameConversion");
        dbStyle = env.getProperty("beetlsql.dbStyle", "org.beetl.sql.core.db.MySqlStyle");

        dev = env.getProperty("beetl-beetlsql.dev", Boolean.class, true);

    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getDaoSuffix() {
        return daoSuffix;
    }

    public void setDaoSuffix(String daoSuffix) {
        this.daoSuffix = daoSuffix;
    }

    public String getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    public String getNameConversion() {
        return nameConversion;
    }

    public void setNameConversion(String nameConversion) {
        this.nameConversion = nameConversion;
    }

    public String getDbStyle(DataSource dataSource) throws SQLException {
        Connection connection = dataSource.getConnection();
        String databaseType = connection.getMetaData().getDatabaseProductName();
        if ("ORACLE".equals(databaseType.toUpperCase())) {
            this.setDbStyle(OracleStyle.class.getName());
        } else {
            this.setDbStyle(MySqlStyle.class.getName());
        }
        return dbStyle;
    }

    public String getDbStyle() {
        return dbStyle;
    }

    public void setDbStyle(String dbStyle) {
        this.dbStyle = dbStyle;
    }


}
