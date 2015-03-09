package com.tinkerpop.gremlin.elastic.schema;

/**
 * Created by Roman on 1/16/2015.
 */
public interface IGraphElementSchemaProvider {
    public IGraphVertexSchema getVertexSchema(String type);
    public IGraphEdgeSchema getEdgeSchema(String type);

    public Iterable<String> getVertexTypes();
    public Iterable<String> getEdgeTypes();
}
