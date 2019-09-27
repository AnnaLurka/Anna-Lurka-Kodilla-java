package com.kodilla.stream;

import java.util.*;
import java.lang.*;
import java.io.*;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.awt.Font;
import java.util.StringJoiner;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("beauty", String::toUpperCase);
        poemBeautifier.beautify("beauty", (text) -> "***" + text + "***");
        poemBeautifier.beautify("beauty", (text) -> String.join("-", text, text));
        poemBeautifier.beautify("beauty", (text) -> "<" + text + ">");


    }
}