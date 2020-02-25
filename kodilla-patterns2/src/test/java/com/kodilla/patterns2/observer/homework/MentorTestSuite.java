package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue aniasTasksQueue = new AniaTasksQueue("Ania's Tasks Queue");
        TasksQueue basiasTasksQueue = new BasiaTasksQueue("Basia's Tasks Queue");
        Mentor szymon = new Mentor("Szymon Smith");
        Mentor andrzej = new Mentor("Andrzej Smith");
        aniasTasksQueue.registerObserver(szymon);
        aniasTasksQueue.registerObserver(andrzej);
        basiasTasksQueue.registerObserver(andrzej);
        //When
        aniasTasksQueue.addTask("Moduł 24.4");
        aniasTasksQueue.addTask("Moduł 24.5");
        basiasTasksQueue.addTask("Moduł 25.1");
        int aniasTaskQueueSize = aniasTasksQueue.getTasks().size();
        int basiasTaskQueueSize = basiasTasksQueue.getTasks().size();
        String aniasQueue = aniasTasksQueue.getName();
        String basiasQueue = basiasTasksQueue.getName();
        //Then
        assertEquals(2, aniasTaskQueueSize);
        assertEquals(1,basiasTaskQueueSize);
        assertEquals(aniasQueue, "Ania's Tasks Queue");
        assertEquals(basiasQueue, "Basia's Tasks Queue");
    }
}
