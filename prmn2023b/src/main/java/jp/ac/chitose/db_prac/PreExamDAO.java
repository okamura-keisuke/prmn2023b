package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExamDAO {
    private static final String URL="jdbc:h2:~/h2db/db_prac;Mode=PostgreSQL;AUTO_SERVER=TRUE";
    private static final String USER_NAME="b2220530";
    private static final String USER_PASS="b2220530";

    public List<PreExam> selectPreExams(int lessThan) throws SQLException {
        List<PreExam> returning=new ArrayList<>();
        String SQL="";
    }
}
