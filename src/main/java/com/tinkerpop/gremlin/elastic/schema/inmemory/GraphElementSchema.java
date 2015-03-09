package com.tinkerpop.gremlin.elastic.schema.inmemory;

import com.tinkerpop.gremlin.elastic.schema.IGraphElementSchema;
import com.tinkerpop.gremlin.elastic.schema.SchemaElementType;

import java.util.Iterator;

/**
 * Created by Roman on 1/17/2015.
 */
public abstract class GraphElementSchema implements IGraphElementSchema {
    //region Constructor
    public GraphElementSchema(String type,
                              String routingFieldName,
                              Iterable<String> indexNames) {
        _type = type;
        _routingFieldName = routingFieldName;
        _indexNames = indexNames;
    }
    //endregion

    //region IGraphElementSchema Implementation
    @Override
    public String getType() {
        return _type;
    }



    @Override
    public String getRoutingFieldName() {
        return _routingFieldName;
    }

    @Override
    public Iterable<String> getIndexNames() {
        return _indexNames;
    }
    //endregion

    //region Fields
    private String _type;
    private String _routingFieldName;
    private Iterable<String> _indexNames;
    //endregion
}
