package com.tinkerpop.gremlin.elastic.schema;

import com.tinkerpop.gremlin.elastic.ElasticGraphGraphProvider;
import com.tinkerpop.gremlin.elastic.schema.inmemory.GraphEdgeSchema;
import com.tinkerpop.gremlin.elastic.schema.inmemory.GraphVertexSchema;
import com.tinkerpop.gremlin.elastic.structure.ElasticGraph;
import com.tinkerpop.gremlin.structure.StructurePerformanceSuite;
import com.tinkerpop.gremlin.structure.StructureStandardSuite;
import org.junit.runner.RunWith;

import java.util.ArrayList;

/**
 * Created by Roman on 3/9/2015.
 */
public class MyGraphSchemaProviderExample implements IGraphElementSchemaProvider {

    @Override
    public IGraphVertexSchema getVertexSchema(String type) {
        if (type == "ph") {
            ArrayList<String> indexNames = new ArrayList<>();
            indexNames.add("entity");

            return new GraphVertexSchema("ph", null, indexNames);
        }

        return null;
    }

    @Override
    public IGraphEdgeSchema getEdgeSchema(String type) {
        if (type == "conv") {
            ArrayList<String> indexNames = new ArrayList<>();
            indexNames.add("a1401");
            indexNames.add("a1402");
            indexNames.add("a1403");

            return new GraphEdgeSchema("conv",
                    "phIdA",
                    indexNames,
                    "phIdA",
                    "ph",
                    "phIdB",
                    "ph");
        }

        return null;
    }

    @Override
    public Iterable<String> getVertexTypes() {
        ArrayList<String> vertexTypes = new ArrayList<>();
        vertexTypes.add("ph");
        vertexTypes.add("em");
        vertexTypes.add("se");
        return vertexTypes;
    }

    @Override
    public Iterable<String> getEdgeTypes() {
        ArrayList<String> edgeTypes = new ArrayList<>();
        edgeTypes.add("conv");
        edgeTypes.add("cors");
        edgeTypes.add("gesh");
        return edgeTypes;
    }
}
