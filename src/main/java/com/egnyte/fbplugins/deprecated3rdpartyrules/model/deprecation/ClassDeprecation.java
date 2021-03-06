package com.egnyte.fbplugins.deprecated3rdpartyrules.model.deprecation;

import lombok.Value;

import com.egnyte.fbplugins.deprecated3rdpartyrules.Deprecated3rdPartyDetector;
import com.egnyte.fbplugins.deprecated3rdpartyrules.DeprecationVisitor;
import com.egnyte.fbplugins.deprecated3rdpartyrules.model.definition.ClassDefinition;

@Value
public class ClassDeprecation implements Deprecation {
    ClassDefinition classDefinition;

    String reason;

    @Override
    public void accept(DeprecationVisitor visitor, Deprecated3rdPartyDetector detector, String refConstantOperand) {
        visitor.visit(this, detector, refConstantOperand);
    }
}
