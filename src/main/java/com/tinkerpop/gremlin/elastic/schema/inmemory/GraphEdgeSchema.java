package com.tinkerpop.gremlin.elastic.schema.inmemory;

import com.tinkerpop.gremlin.elastic.schema.IGraphEdgeSchema;
import com.tinkerpop.gremlin.elastic.schema.SchemaElementType;

/**
 * Created by Roman on 3/9/2015.
 */
public class GraphEdgeSchema extends GraphElementSchema implements IGraphEdgeSchema {
    //region Constructor
    public GraphEdgeSchema(String type,
                           String routingFieldName,
                           Iterable<String> indexNames,
                           String sourceFieldName,
                           String sourceType,
                           String targetFieldName,
                           String targetType) {
        super(type, routingFieldName, indexNames);

        _sourceFieldName = sourceFieldName;
        _sourceType = sourceType;

        _targetFieldName = targetFieldName;
        _targetType = targetType;
    }
    //endregion

    //region Properties
    @Override
    public String getSourceFieldName() {
        return _sourceFieldName;
    }

    @Override
    public String getSourceType() {
        return _sourceType;
    }

    @Override
    public String getTargetFieldName() {
        return _targetFieldName;
    }

    @Override
    public String getTargetType() {
        return _targetType;
    }
    //endregion

    //region Fields
    private String _sourceFieldName;
    private String _targetFieldName;
    private String _sourceType;
    private String _targetType;
    //endregion
}
