package creational.builder.current;

public class SQLQuery implements Query {

    private String from;

    private String where;

    @Override
    public void execute() {
        System.out.println("Executing SQL query from: " + from + " where " + where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
