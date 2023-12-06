package org.softserve.task3;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    static class StudentArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new Student("Anna",1), new Student("Emma",1), -4),
                    Arguments.of(new Student("Anna",5), new Student("Emma",1), 0),
                    Arguments.of(new Student("William",1), new Student("Emma",1), 18)
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(StudentArgumentsProvider.class)
    void compareTo(Student student1, Student student2, int expected) {
        var actual = student1.compareTo(student2);

        assertEquals(expected,actual);
    }
}