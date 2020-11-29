package creational.builder.solved;

public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();
}
