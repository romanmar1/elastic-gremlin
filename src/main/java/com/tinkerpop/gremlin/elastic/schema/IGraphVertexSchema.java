package com.tinkerpop.gremlin.elastic.schema;

/**
 * Created by Roman on 1/16/2015.
 */
public interface IGraphVertexSchema extends IGraphElementSchema{
    default public SchemaElementType getSchemaElementType() {
        return SchemaElementType.Vertex;
    }
}
