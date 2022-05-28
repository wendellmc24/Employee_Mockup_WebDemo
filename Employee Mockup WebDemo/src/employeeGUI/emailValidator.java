package employeeGUI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Wendell
 */
public class emailValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public emailValidator()
    {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    /**
     * Validate hex with regular expression
     *
     * @param email email for validation
     * @return true valid email, false invalid email
     */
    public boolean validate(final String email)
    {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
