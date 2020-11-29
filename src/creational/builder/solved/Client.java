package creational.builder.solved;

public class Client {

    public static void main(String[] args) {

        // setup director
        QueryBuilderDirector director = new QueryBuilderDirector();

        String from = "client table";
        String where = "client name = ...";

        // Build a SQL query
        QueryBuilder builder = new SQLQueryBuilder();
        Query query = director.buildQuery(from, where, builder);
        query.execute();

        // Build a MongoDB query
        builder = new MongoDBQueryBuilder();
        query = director.buildQuery(from, where, builder);
        query.execute();
    }
}
