package by.bsuir.webtech.fourthLab.builder;

import by.bsuir.webtech.fourthLab.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
