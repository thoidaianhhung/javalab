package models;

public class Regex {
  String zip = "(\\d{1,2}|(1|0)\\d{2}|2[0-4]\\d|25[0-5])";
  public String pattern = zip + "\\." + zip + "\\." + zip + "\\." + zip;
}
