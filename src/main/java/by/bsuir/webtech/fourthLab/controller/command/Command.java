package by.bsuir.webtech.fourthLab.controller.command;

import by.bsuir.webtech.fourthLab.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
