package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}






//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("beauty", String::toUpperCase);
//        poemBeautifier.beautify("beauty", (text) -> "***" + text + "***");
//        poemBeautifier.beautify("beauty", (text) -> String.join("-", text, text));
//        poemBeautifier.beautify("beauty", (text) -> "<" + text + ">");
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);


//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);


//    BookDirectory theBookDirectory = new BookDirectory();
//
//    Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//            .filter(book -> book.getYearOfPublication() > 2005)
//            .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//           theResultMapOfBooks.entrySet().stream()
//                   .map(entry -> entry.getKey() + ": " + entry.getValue())
//            .forEach(System.out::println);


//    BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
