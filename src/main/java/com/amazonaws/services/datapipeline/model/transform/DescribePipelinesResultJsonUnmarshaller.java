/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.datapipeline.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Describe Pipelines Result JSON Unmarshaller
 */
public class DescribePipelinesResultJsonUnmarshaller implements Unmarshaller<DescribePipelinesResult, JsonUnmarshallerContext> {

    

    public DescribePipelinesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePipelinesResult describePipelinesResult = new DescribePipelinesResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("pipelineDescriptionList", targetDepth)) {
                    describePipelinesResult.setPipelineDescriptionList(new ListUnmarshaller<PipelineDescription>(PipelineDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describePipelinesResult;
    }

    private static DescribePipelinesResultJsonUnmarshaller instance;
    public static DescribePipelinesResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribePipelinesResultJsonUnmarshaller();
        return instance;
    }
}
    