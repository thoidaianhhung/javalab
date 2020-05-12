package models;

import java.util.Calendar;

public class Result {
  public String findDay(int month, int date, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, date);
    String dayOfWeek = null;
    switch (cal.get(Calendar.DAY_OF_WEEK)) {
    case 1:
      dayOfWeek = "sunday";
      break;
    case 2:
      dayOfWeek = "monday";
      break;
    case 3:
      dayOfWeek = "tuesday";
      break;
    case 4:
      dayOfWeek = "wednesday";
      break;
    case 5:
      dayOfWeek = "thursday";
      break;
    case 6:
      dayOfWeek = "friday";
      break;
    default:
      dayOfWeek = "saturday";
      break;
    }
    return dayOfWeek.toUpperCase();
  }
}
