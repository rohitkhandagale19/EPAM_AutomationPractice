package Java8DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeAssignment {
    public static void main(String[] args) {
        // Task 1: Predicate to check if the given date is yesterday's date
        Predicate<LocalDate> isYesterday = date -> date.isEqual(LocalDate.now().minusDays(1));

        // Example usage of Task 1
        LocalDate testDate = LocalDate.now().minusDays(1);
        System.out.println("Is " + testDate + " yesterday's date? " + isYesterday.test(testDate));

        // Task 2: Supplier to get the date for next Thursday
        Supplier<LocalDate> nextThursdaySupplier = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

        // Example usage of Task 2
        System.out.println("Next Thursday's date: " + nextThursdaySupplier.get());

        // Task 3: Supplier to get the current time in EST timezone
        Supplier<LocalTime> currentTimeInESTSupplier = () -> LocalTime.now(ZoneId.of("America/New_York"));

        // Example usage of Task 3
        System.out.println("Current time in EST: " + currentTimeInESTSupplier.get().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // Task 4: Function to calculate the age of a person given date of birth
        Function<LocalDate, Integer> calculateAge = dob -> Period.between(dob, LocalDate.now()).getYears();

        // Example usage of Task 4
        LocalDate birthDate = LocalDate.of(1990, 6, 15);
        System.out.println("Age for birth date " + birthDate + ": " + calculateAge.apply(birthDate));
    }
}

