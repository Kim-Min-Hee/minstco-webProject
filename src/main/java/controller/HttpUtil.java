package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {

    public static void forward(HttpServletRequest request, HttpServletResponse response, String string) {
        // TODO Auto-generated method stub

        RequestDispatcher rd = request.getRequestDispatcher(string);

        try {
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
