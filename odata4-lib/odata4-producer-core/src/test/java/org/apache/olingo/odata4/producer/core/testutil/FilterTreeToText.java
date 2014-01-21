/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata4.producer.core.testutil;

import java.util.List;

import org.apache.olingo.odata4.producer.core.uri.UriInfoImplPath;
import org.apache.olingo.odata4.producer.core.uri.expression.ExceptionVisitExpression;
import org.apache.olingo.odata4.producer.core.uri.expression.ExpressionVisitor;
import org.apache.olingo.odata4.producer.core.uri.expression.Member;
import org.apache.olingo.odata4.producer.core.uri.expression.SupportedBinaryOperators;
import org.apache.olingo.odata4.producer.core.uri.expression.SupportedMethodCalls;
import org.apache.olingo.odata4.producer.core.uri.expression.SupportedUnaryOperators;

public class FilterTreeToText implements ExpressionVisitor<String> {

  @Override
  public String visitBinaryOperator(SupportedBinaryOperators operator, String left, String right)
      throws ExceptionVisitExpression {
    return "<" + left + " " + operator.toString() + " " + right + ">";
  }

  @Override
  public String visitUnaryOperator(SupportedUnaryOperators operator, String operand) throws ExceptionVisitExpression {
    return "<" + operator + " " + operand.toString() + ">";
  }

  @Override
  public String visitMethodCall(SupportedMethodCalls methodCall, List<String> parameters)
      throws ExceptionVisitExpression {
    String text = "<" + methodCall + "(";
    int i = 0;
    while (i < parameters.size()) {
      if (i > 0) {
        text += ",";
      }
      text += parameters.get(i);
      i++;
    }
    // TODO Auto-generated method stub
    return text + ")";
  }

  @Override
  public String visitLiteral(String literal) throws ExceptionVisitExpression {
    return literal;
  }

  @Override
  public String visitMember(Member member) throws ExceptionVisitExpression {
    String ret = "";
    if (member.isIT()) {
      ret += "$it";
    }

    UriInfoImplPath path = member.getPath();
    if (path != null) {
      /*
       * if (member.isIT()) {
       * ret +="/";
       * }
       */

      ret += path.toString();

    }
    return ret;
  }

  @Override
  public String visitAlias(String referenceName) throws ExceptionVisitExpression {
    return "<" + referenceName + ">";
  }

}