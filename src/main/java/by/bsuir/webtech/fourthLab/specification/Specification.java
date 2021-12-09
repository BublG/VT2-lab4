package by.bsuir.webtech.fourthLab.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
