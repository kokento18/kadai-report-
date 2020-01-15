package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Attendance;

public class AttendanceValidator {
	public static List<String> validate(Attendance a) {
        List<String> errors = new ArrayList<String>();

        String go_error = _validateGo(a.getGo());
        if(!go_error.equals("")) {
            errors.add(go_error);
        }

        String aout_error = _validateOut(a.getAout());
        if(!aout_error.equals("")) {
            errors.add(aout_error);
        }

        return errors;
    }

    private static String _validateGo(String go) {
        if(go == null || go.equals("")) {
            return "出勤時間を入力してください。";
            }

        return "";
    }

    private static String _validateOut(String aout) {
        if(aout == null || aout.equals("")) {
            return "退勤時間を入力してください。";
            }

        return "";
    }
}
