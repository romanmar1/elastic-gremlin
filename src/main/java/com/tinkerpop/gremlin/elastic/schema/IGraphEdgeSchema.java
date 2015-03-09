package com.tinkerpop.gremlin.elastic.schema;

/**
 * Created by Roman on 1/16/2015.
 */
public interface IGraphEdgeSchema extends IGraphElementSchema {
    default public SchemaElementType getSchemaElementType() {
        return SchemaElementType.Edge;
    }

    public String getSourceFieldName();
    public String getSourceType();

    public String getTargetFieldName();
    public String getTargetType();
}
