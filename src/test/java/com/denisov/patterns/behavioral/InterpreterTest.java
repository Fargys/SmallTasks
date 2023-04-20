package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.interpreter.AndExpression;
import com.denisov.patterns.behavioral.interpreter.ContainExpression;
import com.denisov.patterns.behavioral.interpreter.Expression;
import com.denisov.patterns.behavioral.interpreter.OrExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterpreterTest {

    public static final String JAVA        = "Java";
    public static final String JAVA_CORE   = "Java core";
    public static final String SPRING      = "Spring";
    public static final String JAVA_SPRING = "Java Spring";

    @Test
    void test() {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEnterpriseExpression();

        assertTrue(isJava.interpret(JAVA));
        assertTrue(isJava.interpret(JAVA_CORE));
        assertTrue(isJava.interpret(JAVA_SPRING));
        assertFalse(isJava.interpret(SPRING));

        assertFalse(isJavaEE.interpret(JAVA));
        assertFalse(isJavaEE.interpret(JAVA_CORE));
        assertFalse(isJavaEE.interpret(SPRING));
        assertTrue(isJavaEE.interpret(JAVA_SPRING));
    }

    private static Expression getJavaExpression() {
        Expression java = new ContainExpression(JAVA);
        Expression javaCore = new ContainExpression(JAVA_CORE);

        return new OrExpression(java, javaCore);
    }

    private static Expression getJavaEnterpriseExpression() {
        Expression java = new ContainExpression(JAVA);
        Expression javaCore = new ContainExpression(SPRING);

        return new AndExpression(java, javaCore);
    }
}
