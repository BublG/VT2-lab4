package by.bsuir.webtech.fourthLab.controller.command.user;

import by.bsuir.webtech.fourthLab.controller.command.Command;
import by.bsuir.webtech.fourthLab.controller.command.CommandResult;
import by.bsuir.webtech.fourthLab.exception.ServiceException;
import by.bsuir.webtech.fourthLab.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrderCommand implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
