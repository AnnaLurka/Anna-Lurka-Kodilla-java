package com.kodilla.stream;

import java.util.*;
import java.lang.*;
import java.io.*;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.awt.Font;
import java.util.StringJoiner;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);



        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("beauty", String::toUpperCase);
        poemBeautifier.beautify("beauty", (text) -> "***" + text + "***");
        poemBeautifier.beautify("beauty", (text) -> String.join("-", text, text));
        poemBeautifier.beautify("beauty", (text) -> "<" + text + ">");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}