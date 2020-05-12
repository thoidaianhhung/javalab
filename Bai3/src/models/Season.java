package models;

public class Season {
  public String season(int month, int date) {
    date = (month - 1) * 31 + date;
    if (date >= 78 && date <= 170) {
      return "Spring";
    } 
    else if (date >= 171 && date <= 263) {
      return "Summer";
    }
    else if (date >= 264 && date <= 356) {
      return "Fall";
    }
    return "Winter";   
  }
}
