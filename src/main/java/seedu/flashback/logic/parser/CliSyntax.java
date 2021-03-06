package seedu.flashback.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_QUESTION = new Prefix("q/");
    public static final Prefix PREFIX_ANSWER = new Prefix("a/");
    public static final Prefix PREFIX_CATEGORY = new Prefix("c/");
    public static final Prefix PREFIX_PRIORITY = new Prefix("p/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_REMARK = new Prefix("r/");
    public static final Prefix PREFIX_FLAG = new Prefix("-");

    public static final Prefix PREFIX_ALIAS_COMMAND = new Prefix("cmd/");
    public static final Prefix PREFIX_ALIAS_NAME = new Prefix("al/");
}
