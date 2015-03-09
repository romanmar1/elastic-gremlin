package com.tinkerpop.gremlin.elastic.schema.inmemory;

import com.tinkerpop.gremlin.elastic.schema.IGraphEdgeSchema;
import com.tinkerpop.gremlin.elastic.schema.IGraphVertexSchema;
import com.tinkerpop.gremlin.elastic.schema.SchemaElementType;

/**
 * Created by Roman on 3/9/2015.
 */
public class GraphVertexSchema extends GraphElementSchema implements IGraphVertexSchema {
    //region Constructor
    public GraphVertexSchema(String type, String routingFieldName, Iterable<String> indexNames) {
        super(type, routingFieldName, indexNames);
    }
    //endregion
}
