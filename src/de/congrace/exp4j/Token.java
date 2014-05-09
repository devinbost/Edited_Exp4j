package de.congrace.exp4j;
// Edited by Devin Bost, 2014
import java.util.Stack;

public abstract class Token {
	public final String value;

	/**
	 * construct a new {@link Token}
	 * 
	 * @param value
	 *            the value of the {@link Token}
	 */
	public Token(String value) {
		super();
		this.value = value;
	}

	/**
	 * get the value (String representation) of the token
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	abstract void mutateStackForInfixTranslation(Stack<Token> operatorStack, StringBuilder output);
}