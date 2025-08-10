package bank.management.system;

public class ValidationUtils {

    // Check if string is not null and not empty after trimming spaces
    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Check if the string represents a valid integer number (digits only)
    public static boolean isInteger(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("\\d+");
    }

    // Check if the string is a valid decimal number (optional)
    public static boolean isDecimal(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("\\d+(\\.\\d+)?");
    }

    // Check if the string contains only letters
    public static boolean isAlphabetic(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("[a-zA-Z]+");
    }

    // Validate email format (simple regex)
    public static boolean isValidEmail(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Check if string length equals expected length
    public static boolean hasLength(String input, int length) {
        if (!isNotEmpty(input)) return false;
        return input.trim().length() == length;
    }

    // Validate PAN format (5 uppercase letters, 4 digits, 1 uppercase letter)
    public static boolean isValidPAN(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }

    // Validate Aadhar format (12 digits)
    public static boolean isValidAadhar(String input) {
        if (!isNotEmpty(input)) return false;
        return input.matches("\\d{12}");
    }

    // Validate combo box selection (not null, not empty, not "Select"/"Null")
    public static boolean isValidSelection(String selection) {
        return isNotEmpty(selection) && !selection.equalsIgnoreCase("Select") && !selection.equalsIgnoreCase("Null");
    }

    // Check if either of two radio buttons is selected
    public static boolean isRadioSelected(boolean r1Selected, boolean r2Selected) {
        return r1Selected || r2Selected;
    }

    // Validate gender selection ("Male" or "Female")
    public static boolean isGenderSelected(String gender) {
        return gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"));
    }

    // Validate marital status ("Married", "Unmarried", "Other")
    public static boolean isMaritalStatusSelected(String status) {
        return status != null && (status.equalsIgnoreCase("Married")
            || status.equalsIgnoreCase("Unmarried")
            || status.equalsIgnoreCase("Other"));
    }

    // Validate pin code (6 digits)
    public static boolean isValidPinCode(String pin) {
        if (!isNotEmpty(pin)) return false;
        return pin.matches("\\d{6}");
    }

    // Validate account type selection
    public static boolean isValidAccountType(String accountType) {
        if (accountType == null) return false;
        return accountType.equals("Saving Account")
            || accountType.equals("Fixed Deposit Account")
            || accountType.equals("Current Account")
            || accountType.equals("Recurring Deposit Account");
    }

    // Check if facilities string is not empty
    public static boolean hasSelectedFacilities(String facilities) {
        return isNotEmpty(facilities);
    }

    // Check if declaration checkbox is checked
    public static boolean isDeclarationAgreed(boolean isChecked) {
        return isChecked;
    }

    // Validate card number (16 digits)
    public static boolean isValidCardNumber(String cardNo) {
        if (!isNotEmpty(cardNo)) return false;
        return cardNo.matches("\\d{16}");
    }

    // Validate PIN (4 digits)
    public static boolean isValidPin(String pin) {
        if (!isNotEmpty(pin)) return false;
        return pin.matches("\\d{4}");
    }
}
