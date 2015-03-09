package com.tinkerpop.gremlin.elastic.schema;

/**
 * Created by Roman on 1/16/2015.
 */
public interface IGraphElementSchema {
    public SchemaElementType getSchemaElementType();

    public String getType();

    public String getRoutingFieldName();

    public Iterable<String> getIndexNames();


}
