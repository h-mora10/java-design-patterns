package creational.builder.current;

public class Client {

    public static void main(String[] args) {

        String from = "client table";
        String where = "client name = ...";

        // build SQL query
        SQLQuery sqlQuery = new SQLQuery();
        sqlQuery.setFrom(from);
        sqlQuery.setWhere(where);
        sqlQuery.execute();

        // build MongoDB query
        MongoDBQuery mongoDBQuery = new MongoDBQuery();
        mongoDBQuery.setFrom(from);
        mongoDBQuery.setWhere(where);
        mongoDBQuery.execute();
    }
}
