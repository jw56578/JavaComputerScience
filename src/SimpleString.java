/*
 * Write a class called SimpleString that implements a subset of the Java String class methods. You are to pretend that the Java String class does not exist and that you cannot use Java String literals. SimpleStrings are to be immutable. Here are the details:

Define a character array instance variable to hold the contents of your SimpleString.
Write a constructor that takes an array of characters as its parameter. Copy the actual argument into the above instance variable.
Methods:
charAt(int index): returns the character at the given index.
contains(char c): returns true if the string contains the character c, false otherwise.
indexOf(char c): returns the index of the first occurrence of the character c in the string, -1 if the character does not appear in the string.
isEmpty(): returns true if the string contains no characters, false otherwise.
length(): returns the number of characters in the string.
concat(SimpleString s): returns a new SimpleString that consists of a copy of this SimpleString with a copy of s concatenated to the end.
substring(int startIndex, int endIndex): returns a new SimpleString that is a copy of the portion of this SimpleString that starts at index startIndex and ends at index endIndex - 1.
equals(Object o): returns true if this SimpleString is equal to o.
hashCode(): returns a hash code for this SimpleString*/


public class SimpleString {

	char[] characters;
	public SimpleString(char[] chars)
	{
		characters = new char[chars.length];
		for(int i = 0; i < chars.length; i ++)
		{
			characters[i] = chars[i];
		}
		
	}
	public SimpleString substring(int startIndex, int endIndex)
	{
		char[] newString = new char[endIndex - startIndex];
		int i = startIndex;
		for(; i < endIndex -1; i ++)
		{
			newString[i] = this.characters[i];
		}

		return new SimpleString(newString);
	}
	public boolean equals(java.lang.Object o)
	{
		SimpleString input = (SimpleString)o;
		if(input.length() != this.length())
			return false;
		int i = 0;
		for(; i < this.length() -1; i ++)
		{
			if(this.characters[i] != input.characters[i])
				return false;
		}
		return true;
	}
	public int hashCode() {
	    int h = 1;
	    int hash;
	    if (h == 0 && characters.length > 0) {
	        char val[] = characters;

	        for (int i = 0; i < characters.length; i++) {
	            h = 31 * h + val[i];
	        }
	        hash = h;
	    }
	    return h;
	}
	public SimpleString concat(SimpleString s)
	{
		char[] newString = new char[this.characters.length + s.characters.length];
		int i = 0;
		for(; i < this.characters.length; i ++)
		{
			newString[i] = this.characters[i];
		}
		for(int a = 0; i < s.characters.length; a ++,i++)
		{
			newString[i] =  s.characters[a];
		}
		return new SimpleString(newString);
	}
	public int length()
	{
		return characters.length;
	}
	public boolean isEmpty()
	{
		return characters.length == 0;
	}
	public char charAt(int index)
	{
		return characters[index];
		
	}
	public boolean contains(char character)
	{
		for(int i = 0; i < characters.length; i ++)
		{
			if(characters[i] == character)
			{
				return true;
			}
		}
		return false;
		
	}
	public int indexOf(char character)
	{
		for(int i = 0; i < characters.length; i ++)
		{
			if(characters[i] == character)
			{
				return i;
			}
		}
		return -1;
		
	}
}
