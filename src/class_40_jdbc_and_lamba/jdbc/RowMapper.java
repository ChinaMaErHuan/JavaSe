package class_40_jdbc_and_lamba.jdbc;
@FunctionalInterface
public  interface RowMapper {
  public abstract Object mapRow(java.sql.ResultSet arg0) throws java.sql.SQLException;
}