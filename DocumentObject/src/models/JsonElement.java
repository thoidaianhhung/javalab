package models;

import interfaces.Visitor;
import interfaces.Element;

public class JsonElement implements Element {
  public String uuid;

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
